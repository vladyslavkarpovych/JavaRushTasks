package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        Scanner sc = new Scanner(new FileInputStream(reader.readLine()));
        String str;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(sc.hasNextInt()) {
            int temp = sc.nextInt();
            if(temp % 2 == 0) {
                arrayList.add(temp);
            }
        }
        sc.close();
        reader.close();
        Collections.sort(arrayList);
        for(Integer arr : arrayList) {
            System.out.println(arr);
        }
    }
}
