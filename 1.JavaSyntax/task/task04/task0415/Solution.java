package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    double a;
	double b;
	double c;
	
    Scanner sc = new Scanner (System.in);
	a = sc.nextDouble();
	Scanner sc1 = new Scanner (System.in);
	b = sc.nextDouble();
    Scanner sc2 = new Scanner (System.in);
    c = sc.nextDouble();
	if ((a + b) > c && (a + c) > b && (c + b) > a) {
		System.out.println("Треугольник существует.");
	} else {
		System.out.println("Треугольник не существует.");
	}
  }
}