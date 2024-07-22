package org.example;

import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(Parse(sc.nextLine()));
    }

    public static String Parse(String str)
    {
        String[] st = str.split(" ");
        String Name = st[st.length - 1];
        String NewStr = Name + " ";
        for (int i = 0 ; i <= st.length -2 ; i++)
        {
            NewStr = NewStr + st[i] + " ";
        }
        return NewStr;
    }
}
