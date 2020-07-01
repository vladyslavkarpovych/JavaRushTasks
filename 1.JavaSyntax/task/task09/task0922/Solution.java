package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        SimpleDateFormat dat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        d = dat1.parse(s);
        SimpleDateFormat dat2 = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(dat2.format(d).toUpperCase());
        
        
        
        
        
        //напишите тут ваш код
    }
}
