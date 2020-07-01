package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        checkParam(args);
    }

    public static void checkParam(String[] args) {

        switch (args[0]) {
            case "-c":
                create(args[1], args[2], args[3]);
                break;
            case "-u":
                update(args[1], args[2], args[3], args[4]);
                break;
            case "-d":
                delete(args[1]);
                break;
            case "-i":
                info(args[1]);
                break;
            default:
                break;
        }
    }

    public static void create(String name, String sex, String bd) {
        Date bdDate = parseDate(bd);
        Sex pSex = inputSex(sex);

        Person person;
        if (pSex == Sex.MALE) {
            person = Person.createMale(name, bdDate);
        } else {
            person = Person.createFemale(name, bdDate);
        }

        allPeople.add(person);
        System.out.println(allPeople.indexOf(person));

    }

    public static void update(String id, String name, String sex, String bd) {
        Date bdDate = parseDate(bd);
        Sex pSex = inputSex(sex);
        Person person = allPeople.get(Integer.parseInt(id));

        person.setName(name);
        person.setBirthDate(bdDate);
        person.setSex(pSex);
    }

    public static void delete(String id) {
        Person person = allPeople.get(Integer.parseInt(id));

        person.setSex(null);
        person.setBirthDate(null);
        person.setName(null);
    }

    public static void info(String id) {
        Person person = allPeople.get(Integer.parseInt(id));
        StringJoiner sb = new StringJoiner(" ");
        sb.add(person.getName())
                .add(outputSex(person.getSex()))
                .add(convertDate(person.getBirthDate()));
        System.out.println(sb);
    }

    public static Sex inputSex(String sex) {
        return sex.equals("м") ? Sex.MALE : Sex.FEMALE;
    }

    public static String outputSex(Sex sex) {
        return sex == Sex.MALE ? "м" : "ж";
    }

    public static Date parseDate(String bd) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(bd);
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date();
        }
    }

    public static String convertDate(Date in) {
        return new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(in);
    }

}