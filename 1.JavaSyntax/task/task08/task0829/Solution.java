package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
/* 
Модернизация ПО
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        TreeMap<String, String> addresses = new TreeMap<String, String>();
        while (true)
        {
            String city = reader.readLine();


            if (city.isEmpty()) break;
            String family = reader.readLine();
            //System.out.println('1');
            addresses.put(city, family);
        }

        //read home number
        String houseNumber = reader.readLine();
        String enter = reader.readLine();
        if (enter.isEmpty())
        {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }


    }
}