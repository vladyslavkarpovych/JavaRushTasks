package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    String name;
    int y, m, d;
    
    Scanner sc = new Scanner(System.in);
    name = sc.nextLine();
    Scanner sc1 = new Scanner(System.in);
    y = sc1.nextInt();
    Scanner sc2 = new Scanner(System.in);
    m = sc2.nextInt();
    Scanner sc3 = new Scanner(System.in);
    d = sc3.nextInt();
    
    System.out.println("Меня зовут " + name + ".");
    System.out.println("Я родился " + d + "." + m + "." + y);
    
    
    }
}
