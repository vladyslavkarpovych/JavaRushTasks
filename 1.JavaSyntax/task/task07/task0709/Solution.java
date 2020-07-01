package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
        String s = reader.readLine();
        list.add(s);
    }
    int Slength = list.get(0).length();
    
    for (int i = 0; i < 4; i++)
    
        if (Slength > list.get(i + 1).length())
        
            Slength = list.get(i + 1).length();
            
    for (int i = 0; i < 5; i++)
    
        if (Slength == list.get(i).length())
        
            System.out.println(list.get(i));
}
    }