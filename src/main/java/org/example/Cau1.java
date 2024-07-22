package org.example;

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args)
    {

        for(int i = 100000;i < 999999;i++)
        {
            if(CheckTN(String.valueOf(i)))
            {
                System.out.println(i);
                System.out.println(-i);
            }
        }
    }

    public static boolean CheckTN(String str){
        try
        {
            int a = Integer.parseInt(str);
            int b = 0;
            int c = a;

            while (a != 0) {
                int digit = a % 10;
                b = b * 10 + digit;
                a /= 10;
            }

            return (b == c)? true : false;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
