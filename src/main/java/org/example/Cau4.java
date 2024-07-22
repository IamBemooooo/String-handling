package org.example;

import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = Cau4(sc.nextLine());
        System.out.println(str);
    }

    public static String Cau4(String str)
    {
        String[] lst = str.split(" ");
        for(int i = 0; i < lst.length -2; i++)
        {
            for(int j = i +1 ; j < lst.length; j++)
            {
                if( lst[j].length() > lst[i].length())
                {
                    String temp = lst[i];
                    lst[i] = lst[j];
                    lst[j] = temp;
                }
            }
        }
        int Address = str.indexOf(lst[0]);
        return lst[0] + " " + Address;
    }
}
