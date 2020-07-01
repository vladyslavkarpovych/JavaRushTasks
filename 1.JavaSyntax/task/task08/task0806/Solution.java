package com.javarush.task.task08.task0806;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/* 
Коллекция Map из Object
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //напишите тут ваш код
        
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();

   while (iterator.hasNext())
    {
        //получение «пары» элементов
        Map.Entry<String, Object> pair = iterator.next();
        String key = pair.getKey();            //ключ
        Object value = pair.getValue();        //значение
        System.out.println(key + " - " + value);
    }
}
}