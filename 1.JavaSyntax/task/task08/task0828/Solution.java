package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> motht = new HashMap<>();

        motht.put("January", 1);
        motht.put("February", 2);
        motht.put("March", 3);
        motht.put("April", 4);
        motht.put("May", 5);
        motht.put("June", 6);
        motht.put("July", 7);
        motht.put("August", 8);
        motht.put("September", 9);
        motht.put("October", 10);
        motht.put("November", 11);
        motht.put("December", 12);


        String yourMonth = reader.readLine();
        for (Map.Entry<String, Integer> pair : motht.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (key.equals(yourMonth)) {
                System.out.println(key + " is the " + value + " month");
            }
        }
    }
}
