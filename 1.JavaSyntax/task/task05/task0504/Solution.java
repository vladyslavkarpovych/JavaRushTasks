package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat = new Cat("Vaska", 6, 3, 4);
        Cat cat1 = new Cat("Muska", 5, 2, 7);
        Cat cat2 = new Cat("Luska", 3, 1, 4 );
        
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}