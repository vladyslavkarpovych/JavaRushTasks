package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFaname = reader.readLine();
        String grandManame = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();


        Cat grandFa = new Cat(grandFaname);
        Cat grandMa = new Cat(grandManame);
        Cat catFather = new Cat(fatherName, grandFa, null);
        Cat catMother = new Cat(motherName, null, grandMa);
        Cat catSon = new Cat(sonName, catFather, catMother);
        Cat catDaughter = new Cat(daughterName, catFather, catMother);


        System.out.println(grandFa);
        System.out.println(grandMa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.print(catDaughter);

    }

    public static class Cat
    {
        private String name;
        private Cat father;
        private Cat mother;


        Cat(String name)
        {
            this.name = name;
            this.father = null;
            this.mother = null;
        }

        Cat(String name, Cat father,  Cat mother)
        {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override

        public String toString()
        {
            return "The cat's name is " + name +
                    ((mother != null) ? ", mother is " + mother.name : ", no mother") + ((father != null) ? ", father is " + father.name : ", no father");
        }

    }
}