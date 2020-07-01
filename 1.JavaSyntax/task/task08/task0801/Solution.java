package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
    Set<String> set = new HashSet<String>();
    set.add("арбуз");
    set.add("банан");
    set.add("вишня");
    set.add("груша");
    set.add("дыня");
    set.add("ежевика");
    set.add("женьшень");
    set.add("земляника");
    set.add("ирис");
    set.add("картофель");
    
    Iterator<String> iterator = set.iterator();

    while (iterator.hasNext())        //проверка, есть ли ещё элементы
    {
        //получение текущего элемента и переход на следующий
        String text = iterator.next();

        System.out.println(text);
    }
    }
}
