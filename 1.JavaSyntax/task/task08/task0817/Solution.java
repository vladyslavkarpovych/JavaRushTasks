package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Иван");
        map.put("Сидоров", "Иван");
        map.put("Козлов", "Петр");
        map.put("Лампов", "Иван");
        map.put("Крылов", "Сергей");
        map.put("Блюдцев", "Николай");
        map.put("Трутнев", "Бенедикт");
        map.put("Польский", "Иннокентий");
        map.put("Крымов", "Дмитрий");

        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
         ArrayList<String> values = new ArrayList<>(map.values());
        Collections.sort(values);

        for (int i = 0; i < values.size() - 1; i++){
            if (values.get(i).equals(values.get(i+1)))
                removeItemFromMapByValue(map, values.get(i));
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}