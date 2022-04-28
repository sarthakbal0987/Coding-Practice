package com.online.PrepInsta.GettingStarted;

import java.util.Scanner;

public class CheckFriendlyPairNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter a second number: ");
        int secondNumber = scan.nextInt();
        int firstNumberFactorSum = 0;
        int secondNumberFactorSum = 0;
        for (int i = 1; (i <= firstNumber) || (i <= secondNumber); i++) {
            if (firstNumber % i == 0) {
                firstNumberFactorSum = firstNumberFactorSum + i;
            } else if (secondNumber % i == 0) {
                secondNumberFactorSum = secondNumberFactorSum + i;
            }
        }
        if (firstNumberFactorSum / firstNumber == secondNumberFactorSum / secondNumber)
            System.out.print("These numbers are friendly pair numbers.");
        else
            System.out.print("These number are not friendly pair numbers.");
        scan.close();
    }
}
