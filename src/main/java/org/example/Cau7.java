package org.example;

import java.util.Scanner;

public class Cau7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = Cau7(sc.nextLine(),sc.nextLine());
        System.out.println(str);
    }

    public static String Cau7(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return "Khong hop le";
        }

        StringBuilder builder = new StringBuilder(str2);
        int index = 0;
        while ((index = builder.indexOf(str1, index)) != -1) {
            builder.delete(index, index + str1.length());
            index += str1.length();
        }

        return builder.toString();
    }

}
