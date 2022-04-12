package org.Jspider.friends;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scn.nextInt();
        int sum = 0;
        int temp = num;
        for(int i = 1; i<num;i++){
            if(num % i ==0)
                sum = sum+i;
        }
        if(temp == sum){
            System.out.println("This is a perfect number");
        }
        else {
            System.out.println("This is not a perfect number");
        }
    }
}
