package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i;
        String n;
        Scanner sc1 = new Scanner(System.in);
        n = sc1.nextLine();
        
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        
        if (i < 18) {
            System.out.println("Подрасти еще");
        }

    }
}
