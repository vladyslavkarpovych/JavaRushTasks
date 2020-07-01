package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public Cat() {
    }
    //add your code here - добавь свой код тут
    public  static ArrayList<Cat> cats = new ArrayList<Cat>();

    public static void main(String[] args) {
        //Create 10 Cat-s here - создай 10 котов тут
        for (int i=0;i<10;i++){
            Cat cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        //add your step 3 code here - добавь свой код для пункта 3 тут
        for (int i=0;i<cats.size();i++) {
         System.out.println(cats.get(i));
        }

    }
}
