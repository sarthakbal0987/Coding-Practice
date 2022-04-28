package com.online.PrepInsta.String;

import java.util.Scanner;

public class ASCII_ValueOf_Character {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scn.next().charAt(0);
        System.out.println("The ASCII value of " + ch + " is : " + (int) ch);
        scn.close();
    }
}