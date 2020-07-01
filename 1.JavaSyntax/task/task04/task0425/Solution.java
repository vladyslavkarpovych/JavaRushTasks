package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a;
        int b;
        
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        b = sc1.nextInt();
        
        if (a > 0 && b > 0) {
            System.out.println("1");
        }
        if (a < 0 && b > 0) {
            System.out.println("2");
        }
        if (a < 0 && b < 0) {
            System.out.println("3");
        }
        if (a > 0 && b < 0) {
            System.out.println("4");
        }
    }
}
