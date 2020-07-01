package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        String s;
        while (true)
        {
            s = reader.readLine();
            //создаем объект, пункт 2
            if (s.equals("user")) {
                person = new Person.User();
                doWork(person); //вызываем doWork
                continue;
            }

            if (s.equals("loser")) {
                person = new Person.Loser();
                doWork(person); //вызываем doWork
                continue;
            }

            if (s.equals("coder")) {
                person = new Person.Coder();
                doWork(person); //вызываем doWork
                continue;
            }

            if (s.equals("proger")) {
                person = new Person.Proger();
                doWork(person); //вызываем doWork
                continue;
            }

            break; // User input other string, break.
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) {
            ((Person.User) person).live();
            return;
        }

        if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
            return;
        }

        if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
            return;
        }

        if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
            return;
        }
    }
}