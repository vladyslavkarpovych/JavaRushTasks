package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(fileOne));
        BufferedWriter writer1 = new BufferedWriter(new FileWriter(fileTwo));

        while(reader1.ready()) {
            String str = reader1.readLine();
            str = str.replaceAll("\\.", "!");
            writer1.write(str);
            writer1.newLine();
        }
        reader1.close();
        writer1.close();
    }
}
