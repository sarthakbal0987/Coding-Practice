package com.online.PrepInsta.GettingStarted;

import java.util.Scanner;

public class Prime_Number_Given_Range {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first range:");
        int firstRange = input.nextInt(); //Taking first range from the user
        System.out.println("Enter second range:");
        int secondRange = input.nextInt(); //Taking second range from the user
        /*
        * Condition for checking range greater than zero or not
        * because 0 is neither prime number nor composite number
        * and negative numbers can't be prime number.
        * */
        if ((firstRange<=0)|(secondRange<=0))
        {
                System.out.println("Both ranges should be greater than 0👈");
        }
        else
        {
            System.out.println("Prime numbers between "+firstRange+" and "+secondRange+" are: ");
            for (int i = firstRange; i <= secondRange; i++) //i will start from first range and ends in second range
            {
                //initializing flag with true
                boolean flag = true;
                /*
                 * j will start from 2 and will end at half of the i,after i/2
                 * there will be no number which can completely divide i
                 */
                for (int j = 2 ; j  <= i/2 ; j++)
                {
                    /*
                     *In each iteration we will check is i completely divisible by j or not
                     */
                    if (i % j == 0) {
                        flag = false; //If i is divisible by j then set flag to false
                        break;//If condition will meet then break the loop
                    }
                }
                /*
                 * if flag is true then number is prime number
                 * because as we know prime number has at most two multiples(1 and the number itself)
                 * but we start j(which will divide i(number)) from 2 which means if no number(here j) will divide i
                 * then it will be prime number.
                 *
                 * By default, we set flag as true so if j will divide i then flag will become false which means
                 * that number is not a prime number because if it was a prime number then no number would be divide i.
                 */
                if (flag)
                    System.out.print(i+" ");//if flag is true print this line
            }
        }


    }
}
