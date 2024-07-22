package org.example;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder newStrBuilder = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++) {
            if (i % 2 == 0) {
                newStrBuilder.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                newStrBuilder.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        String newStr = newStrBuilder.toString();
        System.out.println(newStr);
    }
}
