package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        
        char c;
        boolean l = false;
    
        String str[] = new String[string.length()];
        //напишите тут ваш код
        for (int i=0;i<str.length;i++) {
            c = string.charAt(i);
            if (c != ' ')  {
                str[i] = Character.toString(c);
                if (!l)  {
                    str[i] = str[i].toUpperCase();
                    l = true;
                }
            } else {
                str[i] = Character.toString(c);
                l = false;
            }
        }
        string = "";
        for (String a : str) string += a;
        System.out.print(string);
    }
}
