package com.online.PrepInsta.String;

import java.util.Scanner;

public class Check_StringPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();
        char[] str1 = str.toCharArray();
        if (str.equals(reverseString(str1))) {
            System.out.print("This String is a palindrome string");
        }
        else System.out.print("This String is not a palindrome String");

    }
    public static  String reverseString(char[] str){
        char[] revString = new char[str.length];
        int size = str.length;
        for (char c : str) {
            revString[size - 1] = c;
            size = size - 1;
        }
        String finalResult = "";
        for (int i = 0; i < revString.length; i++) {
            finalResult = finalResult + revString[i];
        }
        return finalResult;
    }
}
