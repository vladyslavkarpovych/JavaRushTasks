package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        String mother = "мама";
        String wash = "мыла";
        String ramu = "раму";
        
        list.add(mother);
        list.add(wash);
        list.add(ramu);
       
        for (int i = 0; i < list.size(); i = i + 2)
        list.add(i+1, "именно");
        for (String s : list) {
        System.out.println(s);
    }
}
}