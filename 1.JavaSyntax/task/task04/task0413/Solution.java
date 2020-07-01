package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in); 
        
        int i;
        String[] str = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота",
        "воскресенье"};
        i = sc.nextInt();
        if(i<8 && i>=1){
            
        System.out.println(str[i-1]);
        } else  System.out.println("такого дня недели не существует");
    }
    
}