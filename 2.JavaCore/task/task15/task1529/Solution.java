package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String type = reader.readLine();

            if (type.equals("helicopter"))  result = new Helicopter();
            else if (type.equals("plane")) {
                int passengers = Integer.parseInt(reader.readLine());
                result = new Plane(passengers);
            }

            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


}
