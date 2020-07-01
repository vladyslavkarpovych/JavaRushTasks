package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* 
Перестановочка подоспела
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Напишите тут ваш код
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<String>();
//Считываем в список        
        for (int i = 0; i < N; i++)
        {
            list.add(i, reader.readLine());
        }
//меняем местами элементы
        for (int i = 0; i < M; i++)
        {
            list.add(list.get(0));
            list.remove(0);
        }
//выводим на экран        
        for (int i = 0; i < N; i++)
        {
            System.out.println(list.get(i));
        }
    }
}
