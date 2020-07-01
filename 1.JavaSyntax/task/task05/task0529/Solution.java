package com.javarush.task.task05.task0529;

import java.util.Scanner;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    Scanner sc = new Scanner(System.in);
    double sum = 0;
    while (sc.hasNextDouble()) {
        sum = sum + sc.nextDouble();
    }
    if(sc.next().equals("сумма"))
    System.out.println(sum);
    else System.out.println("Wrong input type, has to be double or сумма" );
    }
}
