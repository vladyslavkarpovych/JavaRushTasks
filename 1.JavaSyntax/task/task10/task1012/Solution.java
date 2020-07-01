package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int abcCount=0; // объявили счетчик
        for ( char x : alphabet) // идем по alphabet и  по букве присваеваем в переменню char "x"...
        {
            for ( String y : list) // теперь идем по введенному списку и берем оттдуа по строке и присваем каждую строчку к "у"
            {
                for (char z : y.toCharArray()) // расскладываем строчку на буквенный массив и присваем каждую букву по массиву в переменную "z"
                {
                    if ( x == z ) // остается теперь сравнить букву с алфавита с буквами из введенной строки
                        abcCount++; // когда буква встречается счетчик +1
                }
            }
            System.out.println(x + " " + abcCount); // выводим букву из алфавита и наш счетчик для этой буквы
            abcCount=0; // не забываем обнулить счетчки после прохождения каждой буквы из алфавита, иначе он посчетает кол-во всех совпадений со всеми буквами из списка
        }
    }

}