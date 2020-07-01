package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    int a;
    
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    
     if ((a >= 1) && (a < 1000))
        {
            if (a % 2 == 0)
            {
                if (a < 10)
                    System.out.println("четное однозначное число");
                if ((a > 9) && (a < 100))
                System.out.println("четное двузначное число");
                if ((a > 99) && (a < 1000))
                System.out.println("четное трехзначное число");
            }
            else
            {
                if (a < 10)
                    System.out.println("нечетное однозначное число");
                if ((a > 9) && (a < 100)) 
                System.out.println("нечетное двузначное число");
                if ((a > 99) && (a  < 1000))
                System.out.println("нечетное трехзначное число");

            }
        }

    }
}