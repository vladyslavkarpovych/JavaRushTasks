package com.javarush.task.task06.task0610;

import java.util.Scanner;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        Scanner sc1 = new Scanner(System.in);
        String a = sc1.nextLine();
        return a;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    return a;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
    Scanner sc2 = new Scanner(System.in);    
    double b = sc2.nextDouble();
    return b;

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код

       Scanner t=new Scanner(System.in);
       boolean truee=t.nextBoolean();
       return truee;
}
    public static void main(String[] args) throws Exception {

    }
}
