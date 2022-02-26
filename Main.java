package com.company;
import java.util.Scanner;


public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = in.nextInt();
        int[][] array = new int[length][length];

        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < length; j++)
            {
                array[i][j]=(int)(Math.random()*10);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int j = 0; j < array.length; j++)
        {
            int value = array[j][j];
            int i = j - 1;
            for (; i >= 0; i--) {
                if (value < array[i][i])
                {
                    array[i + 1][i + 1] = array[i][i];
                }
                else
                {
                    break;
                }
            }
            array[i + 1][i + 1] = value;
        }

        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < length; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}