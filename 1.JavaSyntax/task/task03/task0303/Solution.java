package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
    System.out.println (convertEurToUsd (150, 1.12));
    System.out.println (convertEurToUsd (170, 1.12));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double dollar;
        dollar = eur * course;
        return dollar;

    }
}
