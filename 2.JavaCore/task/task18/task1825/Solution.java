package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        //System.setIn(new BufferedInputStream(new FileInputStream("d:/testIN.txt")));

        BufferedReader rcon = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> fileSet = new TreeSet<>();
        String str;
        while (!(str = rcon.readLine()).equals("end")) {
            fileSet.add(str);
        }
        rcon.close();
        String firstFileName = fileSet.first();
        FileOutputStream fileOut = new FileOutputStream(firstFileName.substring(0, firstFileName.lastIndexOf('.')), true);

        for (String fileName : fileSet) {
            FileInputStream fileIn = new FileInputStream(fileName);
            if (fileIn.available() > 0) {
                byte[] buffer = new byte[fileIn.available()];
                fileIn.read(buffer);
                fileOut.write(buffer);
            }
            fileIn.close();
        }
        fileOut.close();
    }
}
