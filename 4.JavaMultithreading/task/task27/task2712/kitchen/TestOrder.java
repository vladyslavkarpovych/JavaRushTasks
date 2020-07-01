package com.javarush.task.task27.task2712.kitchen;


import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by FarAway on 29.02.2016.
 */
public class TestOrder extends Order {
    @Override
    protected void initDishes() throws IOException {
        ConsoleHelper.writeMessage(Dish.allDishesToString());
        dishes = new ArrayList<>();
        dishes.addAll(Arrays.asList(Dish.values()));
        int randDishCount = (int)(Math.random() * Dish.values().length) + 1;
        int countOfDishToDelete = dishes.size() - randDishCount;
        for (int i = 0; i < countOfDishToDelete; i++) {
            dishes.remove((int)(Math.random() * dishes.size()));
        }
    }

    public TestOrder(Tablet tablet) throws IOException {
        super(tablet);
    }
}