package com.online.PrepInsta.GettingStarted;

import java.util.Scanner;

public class Check_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int temp = num;
        int count = 0;
        /*
         * To count the number of digit present in the given number
         * I use below while loop,In each iteration rem of the number will be
         * store in rem and count value will be updated.count value will be updated
         * as many times as we get the remainder
         */
        while (num != 0) {
            num = num / 10; // It will shorten the number by one digit in each iteration until number is
                            // zero
            count++;

        }
        checkArmstrong(temp, count);// Calling checkArmstrong() method
        scan.close();

    }

    public static void checkArmstrong(int number, int power) {
        int sum = 0;
        int temp2 = number;
        while (temp2 != 0) {
            int rem = temp2 % 10;
            sum = (int) (sum + (Math.pow(rem, power)));
            temp2 = temp2 / 10;
        }
        if (number == sum)
            System.out.println("This is an armstrong number");
        else
            System.out.println("This is not an armstrong number");

    }
}
