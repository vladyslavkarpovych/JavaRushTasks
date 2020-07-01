package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set cats = createCats();
        Set dogs = createDogs();

        Set pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set createCats()
    {
        HashSet result = new HashSet();

        for(int i = 0; i < 4; i++)
        {
            result.add(new Cat());
        }

        return result;
    }

    public static Set createDogs()
    {
        HashSet result = new HashSet();

        for(int i = 0; i < 3; i++)
        {
            result.add(new Dog());
        }

        return result;
    }

    public static Set join(Set cats, Set dogs)
    {
        HashSet pets = new HashSet(dogs);
        pets.addAll(cats);

        return pets;
    }

    public static void removeCats(Set pets, Set cats)
    {
        pets.removeAll(cats);
    }

    public static void printPets(Set pets)
    {
        for(Object object : pets)
        {
            System.out.println(object);
        }
    }

    public static class Cat
    {

    }
    public static class Dog
    {

    }
}
