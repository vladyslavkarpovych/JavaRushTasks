package com.javarush.task.task04.task0428;

/* 
Положительное число
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
    
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    Scanner sc1 = new Scanner(System.in);
    b = sc1.nextInt();
    Scanner sc2 = new Scanner(System.in);
    c = sc2.nextInt();
        
    if(a > 0) {
        d++;
    }    
    if(b > 0) {
        d++;
    }
    if(c > 0) {
        d++;
    }    
    System.out.println(d);
        
    }
}
