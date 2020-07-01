package com.javarush.task.task38.task3802;

/* 
Проверяемые исключения (checked exception)
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class VeryComplexClass {
    public void veryComplexMethod() throws Exception {
        //напишите тут ваш код

        FileInputStream fileInputStream = new FileInputStream("file.txt");
        fileInputStream.close();

    }

    public static void main(String[] args) {

    }
}
