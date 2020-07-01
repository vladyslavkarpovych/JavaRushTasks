package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String> ();
        map.put("Сергеев", "Антон");
        map.put("Иванов", "Петя");
        map.put("Стаханов", "Жора");
        map.put("Сталин", "Иосиф");
        map.put("Куриев", "Артур");
        map.put("Сколов", "Антон");
        map.put("Воробев", "Станичлав");
        map.put("Сергеева", "Антон");
        map.put("Глодин", "Паша");
        map.put("Кинг", "Стивен");
        
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while(iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (value.equals(name)) count++;
        }
    return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if (key.equals(lastName)) count++;
        }
    return count;
    }

    public static void main(String[] args) {

    }
}
