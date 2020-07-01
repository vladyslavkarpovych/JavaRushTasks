package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    int a;
    int b;
    int c;
    
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    Scanner sc1 = new Scanner(System.in);
    b = sc1.nextInt();
    Scanner sc2 = new Scanner(System.in);
    c = sc2.nextInt();
    
    if (a==b)
        {
            if (a==c)
                System.out.print(a + " " + b + " " + c);
            else
                System.out.print(a + " " + b);
        }
        else
        {
            if (a==c)
                System.out.print(a + " " + c);
            if (b==c)
                System.out.print(b + " " + c);
    }
}
}