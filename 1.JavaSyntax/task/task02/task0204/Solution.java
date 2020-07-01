package com.javarush.task.task02.task0204;

/* 
О семейных отношениях
*/
public class Solution {
    public static void main(String[] args) {
         Man man=new Man(); //создаем объект man и сразу делаем на него ссылку
        Woman woman=new Woman(); //создаем объект woman и сразу делаем на него ссылку
        
        woman.husband=man;
        man.wife=woman;
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
