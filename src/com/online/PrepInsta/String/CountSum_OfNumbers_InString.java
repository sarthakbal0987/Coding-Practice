package com.online.PrepInsta.String;

import java.util.Scanner;

public class CountSum_OfNumbers_InString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String value = scan.nextLine();
        int sum = 0;
        // int numValue = Integer.parseInt(value);
        // while(numValue != 0){
        // int rem = numValue % 10;
        // sum = sum + rem;
        // numValue = numValue/10;
        // }
        // System.out.print("Sum is : "+ sum);

        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i))) {
                sum = sum + Character.getNumericValue(value.charAt(i));
            }
        }
        System.out.print("Sum is : " + sum);
        scan.close();
    }
}
