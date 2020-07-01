package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a;
        int b;
        int min;
        
        Scanner sc = new  Scanner (System.in);
        a = sc.nextInt();
        
        Scanner sc1 = new  Scanner (System.in);
        b = sc1.nextInt();
        
        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        
    }
}