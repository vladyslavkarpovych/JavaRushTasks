package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    int a;
    int b;
    int c;
    int d;
    int max;
    
    Scanner sc = new Scanner (System.in);
    a = sc.nextInt();
    
    Scanner sc1 = new Scanner (System.in);
    b = sc1.nextInt();
    
    Scanner sc2 = new Scanner (System.in);
    c = sc2.nextInt();
    
    Scanner sc3 = new Scanner (System.in);
    d = sc3.nextInt();
    
    max = a;
    
    if (max < b) {
	max = b;
    }
	if (max < c) {
	max = c;
	}
	if (max < d) {
	max = d;
	}
    System.out.println(max);
    
    }
}
