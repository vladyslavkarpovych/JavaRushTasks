package com.javarush.task.task34.task3411;

/* 
Ханойские башни
*/

public class Solution {
    public static void main(String[] args) {
        int numRings = 3;
        moveRing('A', 'B', 'C', numRings);
    }

    public static void moveRing(char a, char b, char c, int numRings) {
        //напишите тут ваш код
        if (numRings>0)
        {

            /*переложить N-1 кольцо с исходного на временный стержень
            переложить 1 кольцо с исходного на конечный стержень
            переложить N-1 кольцо с временного на конечный стержень
    Hanoi(int n, char from, char to, char temp)
                        A         B        C
             Hanoi(n-1, from, temp, to);
             cout << from << "->" << to << endl;
             Hanoi(n-1, temp, to, from);
            */

            //System.out.println("from" + a + " to " + b);
            moveRing(a, c, b, numRings-1);
            System.out.println("from " + a + " to " + b);
            moveRing(c, b, a, numRings-1);

        }
    }
}