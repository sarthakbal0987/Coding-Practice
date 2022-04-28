package com.online.PrepInsta.String;

import java.util.Scanner;

public class RemoveCharacters_ExceptAlphabet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scn.nextLine();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (isAlphabet(str.charAt(i)))
                res.append(str.charAt(i));
        }
        System.out.print("Result is: " + res);
        scn.close();

    }

    public static boolean isAlphabet(char ch) {
        return (ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90);
    }
}
