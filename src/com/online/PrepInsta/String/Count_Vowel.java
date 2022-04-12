package com.online.PrepInsta.String;

import java.util.Scanner;

public class Count_Vowel {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = scn.nextLine().toLowerCase().trim();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' ||word.charAt(i) == 'e' ||word.charAt(i) == 'i' ||
                    word.charAt(i) == 'o' ||word.charAt(i) == 'u')
            {
                count++;
            }
        }
        System.out.print("Total number of vowel in "+ word+" is "+count);
    }
}
