package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();

        //заносим 20 чисел
        for (int i=0; i<20; i++) set.add(i);

        return set;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            //если значение больше 10, то удаляем и переходим к следующему
            if (iterator.next()>10) iterator.remove();
        }

        return set;
    }

    public static void main(String[] args) {

    }
}


  