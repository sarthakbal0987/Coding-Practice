package com.online.PrepInsta.GettingStarted;

import java.util.Scanner;

/*
* For any year to be a leap year the following two conditions must be checked. If the year satisfies either of the conditions,
* it's considered a leap year. Following are the conditions
*
* 1. The year must be divisible by 400.
* 2. The year must be divisible by 4 but not 100.
*
*
* */
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = input.nextInt();
        checkLeapYear(year);
        input.close();
    }

    public static void checkLeapYear(int Year) {
        /*
         * For first condition --> The year must be divisible by 400 ->(Year % 400 == 0)
         *
         * For second condition --> The year must be divisible by 4 but not 100 ->(Year
         * % 4 == 0)&(Year % 100 != 0))
         *
         * Since either of the conditions should satisfy we should use OR(|) operator
         */
        if ((Year % 400 == 0) | ((Year % 4 == 0) & (Year % 100 != 0))) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }
}
