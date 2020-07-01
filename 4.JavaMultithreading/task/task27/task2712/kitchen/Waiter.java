package com.javarush.task.task27.task2712.kitchen;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by FarAway on 27.02.2016.
 */
public class Waiter implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Cook cook = (Cook) o;
        Order order = (Order) arg;

    }
}
