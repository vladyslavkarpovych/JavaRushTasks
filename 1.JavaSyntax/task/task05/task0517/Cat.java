package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name = null;
    int age = 3;
    int weight = 5;
    String address = null;
    String color = "Orange";
    
    public Cat (String name) {
        this.name = name; 
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public Cat (String name, int weight, int age) {
        this.name = name; 
        this.weight = weight;
        this.age = age;
        this.color = color;
    }
    public Cat (String name, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }
    public Cat (int weight, String color) {
        this.weight = weight;
        this.age = age;
        this.color = color;
    }
    public Cat (int weight, String color, String address) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.address = address;
    }
    public static void main(String[] args) {

    }
}
