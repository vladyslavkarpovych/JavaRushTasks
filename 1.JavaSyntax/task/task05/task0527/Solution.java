package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog dog = new Dog ("Muhtar", 7, 5);
        Cat cat = new Cat ("Muska", 3, 2);
        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код
    public static class Dog {
        String name;
        int height;
        int tail;
        
        public Dog (String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        } 
    }
    public static class Cat {
        String name;
        int height;
        int tail;
        
        public Cat (String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
}
}
}