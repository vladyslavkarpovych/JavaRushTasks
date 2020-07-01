package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    int age; 
    String name;
    
    
    Scanner sc = new Scanner(System.in);
    age = sc.nextInt();
    Scanner sc1 = new Scanner(System.in);
    name = sc1.nextLine();
    
    
    System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    
    }
}
