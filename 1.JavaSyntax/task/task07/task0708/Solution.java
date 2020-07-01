package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();                          // Инициализируй существующее
        ArrayList<String> listMax = new ArrayList<String>();        // поле strings класса Solution новым ArrayList<>
        String s;

        for (int i = 0; i < 5; i++) {                               // Программа должна считывать 5 строк с
            s = br.readLine();                                      // клавиатуры и записывать их в поле strings
            strings.add(i, s);                                      // класса Solution.
        }

        int maxLenght = 0, j = 0;
        for (int i = 0; i < strings.size(); i++) {                  // Если есть несколько строк с длиной равной
            if (maxLenght < strings.get(i).length()) {              // максимальной, то нужно вывести каждую из
                maxLenght = strings.get(i).length();                // них с новой строки.
                j = 0;
                listMax.clear();
                listMax.add(j, strings.get(i));
            } else if (maxLenght == strings.get(i).length()) {
                listMax.add(j++, strings.get(i));
            }
        }

        for (int i = 0; i < listMax.size(); i++) {                  // Программа должна выводить самую длинную
            System.out.println(listMax.get(i));                     // строку на экран.
        }
    }
}
