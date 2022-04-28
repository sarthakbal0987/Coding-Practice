package org.Jspider.friends;

import java.util.Scanner;

public class AverageOf_EvenOdd_GivenRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a range");
        int range = scn.nextInt();
        int sum_Even = 0;
        int sum_Odd = 0;
        int count_Even = 0;
        int count_Odd = 0;
        while (range != 0) {
            if (range % 2 == 0) {
                sum_Even = sum_Even + range;
                count_Even++;
            } else {
                sum_Odd = sum_Odd + range;
                count_Odd++;
            }
            range--;
        }
        float Average_Even = (float) sum_Even / count_Even;
        float Average_Odd = (float) sum_Odd / count_Odd;
        System.out.println("Average of even numbers is : " + Average_Even);
        System.out.print("Average of odd numbers is : " + Average_Odd);
        scn.close();
    }
}
