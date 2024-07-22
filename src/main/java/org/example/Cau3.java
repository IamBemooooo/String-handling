package org.example;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String Str = Cau3(sc.nextLine());
        System.out.println(Str);
    }

    public static String Cau3(String str)
    {
        String[] lst = str.split(" ");
        StringBuilder NewStr = new StringBuilder();
        for(int i = 0; i < lst.length; i++)
        {
            for(int j = 0; j < lst[i].length(); j++)
            {
                if(j == 0)
                {
                    NewStr.append(Character.toUpperCase(lst[i].charAt(j)));
                }
                else
                {
                    NewStr.append(Character.toLowerCase(lst[i].charAt(j)));
                }
            }
            if(i != lst.length - 1)
            {
                NewStr.append(" ");
            }
        }

        return NewStr.toString();
    }
}
