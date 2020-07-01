package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(new File(reader.readLine()));

        int count = 0;
        while (fis.available() > 0) {
            if(fis.read() == 44) {
                count++;
            }
        }
        System.out.println(count);

        reader.close();
        fis.close();
    }

}
