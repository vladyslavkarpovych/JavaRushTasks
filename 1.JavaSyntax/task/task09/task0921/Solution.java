package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
    List<Integer>list = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
        while(true)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }
    }
    catch (NumberFormatException e)
    {
        for(int x : list){
            System.out.println(x);
        }
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
}
}
