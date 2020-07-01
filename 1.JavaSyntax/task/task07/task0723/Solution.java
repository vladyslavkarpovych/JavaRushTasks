package com.javarush.task.task07.task0723;

/* 
Обратный отсчёт
*/

public class Solution
{
    public static void main(String[] args) throws InterruptedException {/*throws InterruptedException добавляется для работы Thread.sleep(100);*/

        for (int i = 30; i >= 0; i--)
        {
            System.out.println(i);
            //Написать тут ваш код
        Thread.sleep(100);
        }

        System.out.println("Бум!");
    }
}