package com.online.PrepInsta.GettingStarted;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scn.nextInt(); // Taking number from the user
        // Checking number entered number is greater than 0 or not
        if (number <= 0) {
            if (number == 0)
                System.out.println("Zero is neither prime nor composite😊");
            else
                System.out.println("Negative integers can not be prime!🚫");
        } else {
            boolean result = checkPrime(number); // Store the return value of checkPrime() method
            if (result)
                System.out.println("This is a prime number"); // If result is true print this line
            else
                System.out.println("This is not a prime number"); // If result is false print this line
        }
        scn.close();
    }

    public static boolean checkPrime(int n) {
        boolean flag = true; // Initializing flag(Variable) with true
        /*
         * Iteration will continue till half of the number bcz after half of the number
         * no number can
         * divide the number itself
         */
        for (int i = 2; i < n / 2; i++) {

            if (n % i == 0) // Checking number is divisible by i or not
            {
                flag = false; // If number will completely divisible by i then setting flag as false
                break; // If condition will meet then break the loop
            }
        }
        return flag;
    }
}
