package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fName = new String();
        ArrayList<FileInputStream> stream = new ArrayList<>();

        while (true) {
            try {
                fName = reader.readLine();
                stream.add(new FileInputStream(fName));
            }
            catch (FileNotFoundException e) {
                System.out.println(fName);
                try {
                    reader.close();
                    for (FileInputStream str:stream) {
                        str.close();
                    }
                }
                catch (IOException e1) {
                    e1.printStackTrace();
                }
                break;
            }
            catch (IOException e) {
                break;
            }
        }
    }
}
