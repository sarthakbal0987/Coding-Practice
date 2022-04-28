package com.online.PrepInsta.GettingStarted;

import java.util.Scanner;

/*
 * Sample Input:
 * Enter first range:
 * 1
 * Enter second range:
 * 10
 * Sum of 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
 */
public class Sum_Of_Numbers_GivenRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first range:");
        int n = input.nextInt(); // Taking first range from the user.
        System.out.println("Enter the second range:");
        int N = input.nextInt(); // Taking second range from the user.
        sumOfNumbers(n, N); // Calling the sumOfNumbers() method and passed the first range and second range
                            // as parameter.
        input.close();
    }

    static void sumOfNumbers(int range, int range1) {
        int sum = 0; // Initialize sum with zero.
        // The value of i ranges from first range to second range.
        for (int i = range; i <= range1; i++) {
            sum = sum + i; // In each iteration,the sum value will be updated.
        }
        System.out.print("Sum of ");
        // To print the all number between first range and second range.
        for (int i = range; i <= range1; i++) {

            if (i == range1) { // It will check which is last number.Here range1 is last number, so it will
                               // print '=' instead of '+'symbol.
                System.out.print(i + " = "); // After last number '=' symbol will be print.
                break; // after last number,the loop will be break and control will jump out from the
                       // loop.
            }
            System.out.print(i + " + "); // Printing '+' symbol in between two numbers.
        }
        System.out.print(sum);// Printing the value of sum.

    }
}
