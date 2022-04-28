package com.online.PrepInsta.String;

import java.util.Scanner;

public class CheckVowel_Constant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter:");
        char ch = input.next().charAt(0);
        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))// This logic can be used to check whether the entered
                                                              // character is alphabet or not
        {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("This is a vowel");
            } else {
                System.out.println("This is a consonant");
            }
        } else {
            System.out.println("Please enter an alphabet");
        }
        input.close();
    }
}
