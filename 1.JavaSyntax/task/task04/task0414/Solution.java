package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    Scanner sc = new Scanner (System.in);
    int a;
    a = sc.nextInt();
    
    int b = a % 400;
    int c = a % 100;
    int d = a % 4;
    
    if (d < 1 && c >= 1) {
        System.out.println("количество дней в году: 366");
    } else if (b < 1) {
        System.out.println("количество дней в году: 366");
    } else {
        System.out.println("количество дней в году: 365");
    }
    }
}