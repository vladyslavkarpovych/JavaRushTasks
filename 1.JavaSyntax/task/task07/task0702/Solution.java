package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] array = new String [10];
        
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < 8; i++) {
        array[i] = reader.readLine(); 
    }
    for (int i = 0; i < array.length; i++) {
    
    }
    for(int j = array.length-1; j >= 0; j--){
            System.out.println(array[j]);  // выводим в обратном порядке строки
        }
}
}