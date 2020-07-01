package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in ));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int a1 = Integer.parseInt(a);
        int a2 = Integer.parseInt(b);
        int a3 = Integer.parseInt(c);
        
        if (a1==a2 && a1!=a3)
        System.out.println("3");
        else if (a2==a3 && a2!=a1)
        System.out.println("1");
        else if (a1==a3 && a1!=a2)
        System.out.println("2");//напишите тут ваш код
    }
}
