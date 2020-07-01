package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] bigArray = new int [20];
        int [] firstSmallArray = new int [10];
        int [] secondSmallArray = new int [10];
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 20; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }
        for(int i = 0; i < 20 ; i++){
           if (i <= 9) {
               firstSmallArray[i] = bigArray[i];
          } else {
               secondSmallArray[i-10] = bigArray[i];
               System.out.println(secondSmallArray[i-10]);
           }
        }
    }
}
