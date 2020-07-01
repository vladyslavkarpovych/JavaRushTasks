package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            
            double index = 0;
            index = weight / (height * height);
            double a = 18.5;
            int b = 25; 
            int c = 30;
            if (index < a) {
                System.out.println("Недовес: меньше чем 18.5");
            }
            if(index > a && index < b) {
                System.out.println("Нормальный: между 18.5 и 25");
            }
            if (index > b && index < c) {
                System.out.println("Избыточный вес: между 25 и 30");
            }   
            if(index > c) {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}
