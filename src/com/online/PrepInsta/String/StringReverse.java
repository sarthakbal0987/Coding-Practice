package com.online.PrepInsta.String;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        char[] ch = s.toCharArray();
        int n = ch.length;
        int j = n;
        char[] reverseString = new char[n];
        for (char c : ch) {
            reverseString[j - 1] = c;
            j = j - 1;
        }
        System.out.println("The reverse of above string is:");
        for (int i = 0; i < n; i++) {
            System.out.print(reverseString[i]);
        }
    }
}
