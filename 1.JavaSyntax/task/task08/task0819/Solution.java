package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
/* 
Set из котов
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Iterator<Cat> it =  cats.iterator();
        if (it.hasNext())
            cats.remove(it.next());
        //Написать тут ваш код. step 3 - пункт 3
        // cats.remove(cats.iterator().next());

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        //Написать тут ваш код. step 2 - пункт 2
        Set<Cat> cats = new HashSet<Cat>();
        for (int i = 0; i < 3; i++) {
            cats.add(new Cat());
        }
        return (HashSet<Cat>) cats;
    }

    public static void printCats(Set<Cat> cats)
    {
        // step 4 - пункт 4
        for (Cat cat : cats)
        {
            System.out.println(cat);
        }

    }


    public static class Cat   {

    }// step 1 - пункт 1
}