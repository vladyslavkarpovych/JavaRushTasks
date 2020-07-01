package com.javarush.task.task04.task0441;

/* 
Как-то средненько
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
        c = sc.nextInt();
        
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        Arrays.sort(array);
        System.out.println(array[1]);
        
        
    }
}
