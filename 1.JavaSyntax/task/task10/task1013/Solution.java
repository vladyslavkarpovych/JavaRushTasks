package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int age;
        private double weight;
        private boolean sex;
        private String name;
        private String surname;
        private double height;
        
        public Human (int age) {
            this.age = age;
        }
       public  Human (int age, String name) {
            this.age = age;
            this.name = name;
        }
       public Human (int age, String name, String surname) {
            this.age = age;
            this.name = name;
            this.surname = surname;
        }
       public Human (double weight) {
            this.weight = weight;
        }
       public Human (String surname, boolean sex) {
            this.surname = surname;
            this.sex = sex;
        }
       public Human (double weight, double height) {
            this.weight = weight;
            this.height = height;
        }
       public Human (boolean sex) {
            this.sex = sex;
        }
       public Human (int age, String name, String surname, boolean sex) {
            this.age = age;
            this.name = name;
            this.surname = surname;
            this.sex = sex;
        }
       public Human (int age, double height, double weight) {
            this.age = age;
            this.height = height;
            this.weight = weight;
        }
       public Human (boolean sex, String name) {
            this.sex = sex;
            this.name = name;
        }
    }
}
