package com.online.PrepInsta.GettingStarted;

import java.util.Scanner;

/*
* We are given an integer input as the number, the objective is to check whether or not the given number is a palindrome.
* To do so, we’ll first reverse the string input using loops and check if it matches the original number.
* If it matched then the given input number is a palindrome number
*
* Example
* -------
* Input : 121
* Output : Palindrome
*
* */
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();// Taking input from the
        // If isPalindrome() method returns true then the number is palindrome and if it
        // returns false then it is not
        if (isPalindrome(number))
            System.out.println("This is a palindrome number");
        else
            System.out.println("This is not a palindrome number");
        input.close();
    }

    public static boolean isPalindrome(int number) {
        /*
         * Checking the number is smaller than 0 or not
         * if it is smaller than zero then it can't be a palindrome number
         * because:
         * Input: x = -121
         * Output: false
         * Explanation: From left to right, it reads -121. From right to left, it
         * becomes 121-.
         * Therefore, it is not a palindrome.
         *
         */
        if (number < 0)
            return false;
        /*
         * Declaring and initializing flag variable with false
         * if number will not palindrome then flag will return
         */
        boolean flag = false;
        /*
         * Storing number in temp variable because
         * after while loop number will be zero(because while loop will continue until
         * and unless number is zero)
         * But after while loop we need to check reverse number with original number
         * That's why first we store the number in temp variable so that after
         * completion of while loop
         * we can compare temp with reverse number
         */
        int temp = number;
        // Initializing rev variable with zero and after while loop the reverse of the
        // number will store in rev
        int rev = 0;
        // Below is the same logic i have applied to reverse the number which i have
        // already explained before in reverse the number program
        while (number != 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;

        }
        /*
         * Checking reversed value of number with original number(here we have stored
         * value of number in temp)
         * if rev match with temp then update flag from false to true means the entered
         * number is palindrome
         * because the reverse of the given number matched with original number
         */
        if (rev == temp)
            flag = true;
        /*
         * Returning flag,if rev will not match with temp then default value of flag
         * will return which is false
         * and if it will match then true will return.
         */
        return flag;
    }
}
