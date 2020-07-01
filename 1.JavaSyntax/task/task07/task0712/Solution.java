package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++) {
        list.add(reader.readLine());
    }
        String min = Collections.min(list, Comparator.comparing(String::length));
        String max = Collections.max(list, Comparator.comparing(String::length));
        if (list.indexOf(min) < list.indexOf(max)) {
            System.out.println(min);
        } else {
            System.out.println(max);
        }
}
}
