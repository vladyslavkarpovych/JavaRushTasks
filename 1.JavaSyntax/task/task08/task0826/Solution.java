package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Пять победителей
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        int[] maxFiveNumbers = new int[20];
        //сортировка пузырьком, на уменьшение. Пока единственная, которую я могу написать. Сад бат тру.
        int max;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if(array[i]>array[j])
                {
                    max = array[i];
                    array[i] = array[j];
                    array[j] = max;

                }
            }
        }


        //Напишите тут ваш код
    }
}