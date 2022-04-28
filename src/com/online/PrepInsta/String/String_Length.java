package com.online.PrepInsta.String;

import java.util.Scanner;

public class String_Length {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = scn.nextLine();
        System.out.println("The length of given string is: " + findLength(word));
        scn.close();
    }

    public static int findLength(String str) {
        char[] rs = str.toCharArray();
        int count = 0;

        int i = 0;
        while (rs[i] != '\0') {
            count++;
            i++;
        }
        return count;
    }
}
