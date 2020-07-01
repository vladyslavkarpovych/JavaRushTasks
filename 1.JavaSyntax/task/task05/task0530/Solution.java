package com.javarush.task.task05.task0530;
import java.util.Scanner;
import java.io.*;

/* 
Шеф, что-то не пашет
*/

public class Solution
{
   public static void main(String[] args) throws Exception
    {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        b = sc1.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}