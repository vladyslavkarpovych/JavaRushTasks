package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(file.readLine());
        FileWriter writer = new FileWriter(file.readLine());
        int n = 1;
        while (reader.ready())
        {
            int data = reader.read();
            if (n%2==0)
            {
                writer.write(data);
            }
            n++;
        }
        file.close();
        reader.close();
        writer.close();
    }
}
