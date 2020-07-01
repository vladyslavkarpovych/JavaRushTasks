package com.javarush.task.task06.task0606;

import java.io.*;

public class Solution {

    public static int even; // кол-во четных чисел
    public static int odd; //кол-во нечетных чисел

    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(reader.readLine()); // х это число вводимое с клавиатуры
      while(x > 0) { // пока х>0 выполняется следующее:

            if (x%2==0) // если х делится на 2 без остатка, то
            {
                even++; //кол-во четных чисел увеличивается на один
            }
            else odd++; // иначе на один увел. кол-во нечетных чисел
            x /= 10; // число х делится на 10 для того, чтобы определить четность числа на порядок выше
        }
        System.out.println("Even: "+ even + " Odd: " + odd);
    }
}