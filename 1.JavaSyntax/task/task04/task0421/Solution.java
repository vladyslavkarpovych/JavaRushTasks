package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    String a;
    String b;
    
    Scanner sc = new Scanner(System.in);
    a = sc.nextLine();
    
    Scanner sc1 = new Scanner(System.in);
    b = sc1.nextLine();
    
    if(a.equals(b)) {
        System.out.println("Имена идентичны");
    } else {
    if(a.length() == b.length()) {
        System.out.println("Длины имен равны");
    }
    }
    }
}
