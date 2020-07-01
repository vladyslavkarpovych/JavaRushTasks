package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        
        float sum = 0;
        int count = 0;
        
        while (true) {
            int a = Integer.parseInt(buff.readLine());
            
            if(a == -1)
            break;
            else  
                count++;
            sum = (sum + a);
            }
            sum = sum / count;
            System.out.println(sum);
    }
}

