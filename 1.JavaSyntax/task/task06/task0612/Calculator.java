package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int plus = a + b;
        return plus;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int minus = a - b;
        return minus;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int multiply = a * b;
        return multiply;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double division = (double) a / (double) b;
        return division;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        return a*0.01*b;
    }

    public static void main(String[] args) {
    }
    }