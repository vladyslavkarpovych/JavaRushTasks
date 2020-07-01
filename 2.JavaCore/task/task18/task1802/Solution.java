package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream fis = new FileInputStream(fileName);
        int min = fis.read();
        while(fis.available() > 0) {
            int data = fis.read();
            if (data < min) {
                min = data;
            }
        }
        fis.close();
        System.out.println(min);
    }
}
