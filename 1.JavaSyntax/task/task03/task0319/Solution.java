package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name;
        int a;
        int b;
        
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        
        Scanner sc1 = new Scanner(System.in);
        a = sc.nextInt();
        
        Scanner sc2 = new Scanner(System.in);
        b = sc.nextInt();
        
        System.out.println(name + " получает " + a + " через " + b + " лет."); 
    }
}
