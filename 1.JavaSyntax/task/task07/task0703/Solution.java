package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] array = new String [10];
        int [] array1 = new int [10];
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
            array1[i] = array[i].length();
        }
        for (int n=0; n < array.length;n++)
        {
            System.out.println(array1[n]);
        }
    }
}
