package com.javarush.task.task27.task2712.kitchen;


import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;

import java.util.Observable;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by FarAway on 27.02.2016.
 */
public class Cook extends Observable implements Runnable{
    private String name;
    private LinkedBlockingQueue<Order> queue;
    private volatile boolean busy;

    public Cook(String name) {
        this.name = name;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setQueue(LinkedBlockingQueue<Order> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                startCookingOrder(queue.take());
                Thread.sleep(10);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public void startCookingOrder(Order order) {
        busy = true;
        Tablet tablet = order.getTablet();

        ConsoleHelper.writeMessage("Start cooking - " + order + ", cooking time " + order.getTotalCookingTime() + "min");
        try {
            Thread.sleep(10 * order.getTotalCookingTime());
        } catch (InterruptedException e) {

        }
        //When finish cooking
        StatisticManager.getInstance().register(new CookedOrderEventDataRow(tablet.toString(), this.toString(), order.getTotalCookingTime() * 60, order.getDishes()));

        ConsoleHelper.writeMessage(order + " was cooked by " + this);
        setChanged();
        notifyObservers(order);
        busy = false;
    }

    @Override
    public String toString() {
        return name;
    }
}






