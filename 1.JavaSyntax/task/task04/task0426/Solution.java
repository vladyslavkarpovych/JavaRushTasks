package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    int a;
    
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    
    if (a==0)
            System.out.println("ноль");
        else {
            if (a > 0) {
                if (a % 2 == 0)
                    System.out.println("положительное четное число");
                else
                    System.out.println("положительное нечетное число");
            } else {
                if (-a % 2 == 0)
                    System.out.println("отрицательное четное число");
                else
                    System.out.println("отрицательное нечетное число");
            }
        }
    }
}
