package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Считать строки с консоли и объявить ArrayList list тут
        ArrayList <String> list = new ArrayList <String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i < 10; i++)
        {
            list.add(reader.readLine());
        }


        ArrayList result = doubleValues(list);

        //Вывести на экран result
        for (int k=0; k < result.size();k++)
        {
            System.out.println(result.get(k));
        }
    }

    public static ArrayList doubleValues(ArrayList list)
    {
        //напишите тут ваш код
        ArrayList listcopy = new ArrayList();
        for (int n=0; n < list.size();n++)
        {
            listcopy.add(list.get(n));
            listcopy.add(list.get(n));
        }
        return listcopy;
    }
}
