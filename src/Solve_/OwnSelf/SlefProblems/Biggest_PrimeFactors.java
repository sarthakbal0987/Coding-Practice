package Solve_.OwnSelf.SlefProblems;

import java.util.Scanner;

public class Biggest_PrimeFactors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scn.nextInt();
        int biggestPrimeFactor = 1;
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0)
                        count++;
                }
                if (count == 2) {
                    if (i > biggestPrimeFactor)
                        biggestPrimeFactor = i;
                }

            }

        }
        System.out.println();
        System.out.print("The biggest Prime factor of " + number + " is " + biggestPrimeFactor);
        scn.close();
    }
}
