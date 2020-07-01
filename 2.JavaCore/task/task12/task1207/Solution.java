package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution
{
    public static void main(String[] args)
    {
        // Т.К. b типа Integer, то сработает метод именно с Integer 
        Integer b = 9;
        print(9);
        print(b);

    }
    public static void print (Integer i){}
    public static void print (int i){}

}