package com.javarush.task.task02.task0205;

/* 
Прибавка к зарплате
*/
public class Solution {
    public static void main(String[] args) {
        hackSalary(100);
    }

    public static void hackSalary(int a) {
        // напишите тут ваш код
        int s = a + 100;
       // int b = 100;
        System.out.println ("Твоя зарплата составляет: " + s + " долларов в месяц.");
    }
}
