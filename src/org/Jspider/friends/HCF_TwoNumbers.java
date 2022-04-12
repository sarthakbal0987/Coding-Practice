package org.Jspider.friends;

import java.util.Scanner;

public class HCF_TwoNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = 50;
        int num1 = 100;
        int j =0;
        int[] arr = new int[num];
        for (int i = 1; i <= num; i++) {
            if ((num % i ==0) &&(num1 % i == 0)){
                arr[j] = i;
                j++;
            }
        }
        int hcf = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>hcf){
                hcf = arr[i];
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0);
//            else
//                System.out.print(arr[i]+" ");
//        }
        System.out.print("HCF is "+hcf);
    }

}
