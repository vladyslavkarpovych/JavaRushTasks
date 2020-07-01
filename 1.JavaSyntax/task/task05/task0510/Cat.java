package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    
    String name = null;
    int age = 3;
    int weight = 5;
    String address = null;
    String color = "Red";
    
    public void initialize (String name) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public void initialize (String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public void initialize (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;   
    }
    public void initialize (int weight, String color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
     public void initialize (int weight, String color, String address) {
        this.age = age;
        this.weight = weight;
        this.color = color;  
        this.address = address;
     }
     
    public static void main(String[] args) {

    }
}
