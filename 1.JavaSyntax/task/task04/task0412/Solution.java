package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    int a;
    int b = 1;
    int c = 2;
    Scanner sc = new Scanner (System.in);
    a = sc.nextInt();
    
    if (a > 0) {
        System.out.println(a * c);
    }
    if (a < 0) {
        System.out.println(a + b);
    }
    if (a == 0) {
        System.out.println(a);
    }
    }
}