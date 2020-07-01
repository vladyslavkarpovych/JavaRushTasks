package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        int count = 0;
        int spaces = 0;
        double res = 0;

        if(args.length > 0){
            FileInputStream in = new FileInputStream(args[0]);

            while(in.available() > 0){
                count++;
                int data = in.read();

                if(data == Integer.valueOf(' ')){
                    spaces++;
                }
            }

            in.close();
        }

        if(count == 0){

        } else {
            res = (double)spaces / count * 100;
        }

        System.out.printf("%.2f", res);
    }
}
