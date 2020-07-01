package com.javarush.task.task38.task3812;

/* 
Обработка аннотаций
*/

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static boolean printFullyQualifiedNames(Class c) {

        if (c.isAnnotationPresent(PrepareMyTest.class)) {
            PrepareMyTest prepareMyTest = (PrepareMyTest) c.getAnnotation(PrepareMyTest.class);
            String[] strings = prepareMyTest.fullyQualifiedNames();
            for (String s:strings ) {
                System.out.println(s);
            }
            return true;
        } else
            return false;
    }

    public static boolean printValues(Class c) {

        if (c.isAnnotationPresent(PrepareMyTest.class))
        {
            PrepareMyTest prepareMyTest = (PrepareMyTest) c.getAnnotation(PrepareMyTest.class);
            Class[] classes = prepareMyTest.value();
            for (Class classValues:classes ) {
                System.out.println(classValues.getSimpleName());
            }
            return true;
        }
        else
            return false;

    }
}
