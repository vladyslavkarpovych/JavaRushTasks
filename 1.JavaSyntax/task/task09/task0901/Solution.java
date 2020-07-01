package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        //напишите тут ваш код
    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return stackTrace;
    }

    public static StackTraceElement[] method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stackTrace1 = Thread.currentThread().getStackTrace();
        return stackTrace1;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stackTrace2 = Thread.currentThread().getStackTrace();
        return stackTrace2;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] stackTrace3 = Thread.currentThread().getStackTrace();
        return stackTrace3;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTrace4 = Thread.currentThread().getStackTrace();
        return stackTrace4;
    }
}
