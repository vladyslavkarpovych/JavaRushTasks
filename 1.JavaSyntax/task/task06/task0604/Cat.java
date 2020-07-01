package com.javarush.task.task06.task0604;

public class Cat {

    public Cat() {//1. Добавь в класс Cat конструктор без параметров public Cat().
        catCount ++; //2. Конструктор класса должен на 1 увеличивать значение переменной catCount.
    }

    public void finalize() {//3. Добавь в класс Cat метод finalize. 4. Метод finalize ничего не должен возвращать (тип возвращаемого значения void).
        catCount --;//5. Метод finalize должен уменьшать переменную catCount на 1.
    }

    public static int catCount = 0;


    public static void main(String[] args) {

    }
}