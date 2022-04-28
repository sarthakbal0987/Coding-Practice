package com.online.PrepInsta.String;

import java.util.Scanner;

public class RemoveSpace_FromString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scn.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 32)
                ;
            else
                result = result + str.charAt(i);
        }
        System.out.print("Result is :" + result);
        scn.close();
    }
}
