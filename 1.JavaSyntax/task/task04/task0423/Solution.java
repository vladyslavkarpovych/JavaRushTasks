package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
        int a;
        String n;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextInt();
        
        if(a > 20) {
            System.out.println("И 18-ти достаточно");
        }

    }
}
