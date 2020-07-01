package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> salaryMap = new HashMap<>();
        salaryMap.put("Иванов", 100);
        salaryMap.put("Петров", 278);
        salaryMap.put("Сидоров", 350);
        salaryMap.put("Надеин", 15000);
        salaryMap.put("Харламова", 3900);
        salaryMap.put("Проскуряков", 499);
        salaryMap.put("Микрухин", 5000);
        salaryMap.put("Ярцев", 3500);
        salaryMap.put("Корнюшина", 4000);
        salaryMap.put("Бесламбеков", 300);
        return salaryMap;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}