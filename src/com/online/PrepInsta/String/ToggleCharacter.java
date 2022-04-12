package com.online.PrepInsta.String;

import java.util.Scanner;

public class ToggleCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String givenWord = scan.nextLine().trim();
        String s = "";
        for (int i = 0; i < givenWord.length(); i++) {
            if (givenWord.charAt(i)>=97 && givenWord.charAt(i)<=122)
                s = s + Character.toUpperCase(givenWord.charAt(i));
            else
                s = s + Character.toLowerCase(givenWord.charAt(i));
        }
        System.out.print(s);
    }
}
