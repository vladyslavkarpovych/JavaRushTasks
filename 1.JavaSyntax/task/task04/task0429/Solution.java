package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    int a;
    int b;
    int c;
    int d = 0;
    int e = 0;
    
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    Scanner sc1 = new Scanner(System.in);
    b = sc1.nextInt();
    Scanner sc2 = new Scanner(System.in);
    c = sc2.nextInt();
    
        if (a > 0){
            d++;
        }
        if (b > 0) {
            d++;
        }
        if (c > 0) {
            d++;
        }    
        if(a < 0) {
            e++;
        }
        if(b < 0) {
            e++;
        }
        if(c < 0) {
            e++;
        }
        
        System.out.println("количество отрицательных чисел: " + e);
        System.out.println("количество положительных чисел: " + d);
}
}
