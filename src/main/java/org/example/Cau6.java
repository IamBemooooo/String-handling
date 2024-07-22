package org.example;

import java.util.Scanner;

public class Cau6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] str = Cau6(sc.nextLine());
        for (int i = 0; i < str.length; i++)
        {
            System.out.println(str[i]);
        }
    }

    public static String[] Cau6(String str)
    {
        String[] lst = str.split(" ");
        if(lst.length > 20)
        {
            System.out.println("Khong duoc vuot qua 20 tu");
        }
        for(int i = 0 ; i < lst.length -2 ; i++)
        {
            Character char1 = lst[i].charAt(0);
            for (int j = i+1 ; j < lst.length ; j++)
            {
                Character char2 = lst[j].charAt(0);
                if(char1.compareTo(char2) > 0)
                {
                    String temp = lst[i];
                    lst[i] = lst[j];
                    lst[j] = temp;
                }
            }
        }
        return lst;
    }
}
