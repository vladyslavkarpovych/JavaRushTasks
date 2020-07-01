package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a)
    {
        int hor = a[0].length;
        int ver = a.length;
        int count;
        int verEnd;
        int horEnd;
        int result = 0;
        for (int i = 0; i < ver; i++)
        {
            for (int j = 0; j < hor; j++)
            {
                if (a[i][j] == 1)
                {

                    //по вертикали
                    count = i + 1;
                    System.out.println("a[" + count + "][" + j + "]");
                    while (true)
                    {
                        if (count >= ver || (a[count][j] == 0 && count < ver))
                        {
                            verEnd = count - 1;
                            System.out.println("verEnd = " + verEnd);
                            break;
                        }
                        count++;
                        System.out.println("a[" + count + "][" + j + "]");
                    }
                    //по горизонтали
                    count = j + 1;
                    while (true)
                    {
                        if (count >= hor || (a[i][count] == 0 && count < hor))
                        {
                            horEnd = count - 1;
                            System.out.println("horEnd = " + horEnd);
                            break;
                        }
                        count++;
                    }
                    boolean flag = true;
                    for (int p = i; p <= verEnd; p++)
                        for (int q = j; q <= horEnd; q++)
                            if (a[p][q] != 1)
                            {
                                flag = false;
                                break;
                            }
                    if (flag)
                    {
                        System.out.println("startI = " + i);
                        System.out.println("startJ = " + j);
                        System.out.println("endI = " + verEnd);
                        System.out.println("endJ = " + horEnd);
                        for (int p = i; p <= verEnd; p++)
                            for (int q = j; q <= horEnd; q++)
                                a[p][q] = 0;
                        result++;
                    }
                    System.out.println();
                }
            }
        }
        return result;
    }
}
