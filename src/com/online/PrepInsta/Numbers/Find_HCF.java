package com.online.PrepInsta.Numbers;

import java.util.Scanner;

public class Find_HCF {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How many numbers do you want to get HCF?");
        int size = scn.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter numbers separated by space:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scn.nextInt();
        }
        int small = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<small)
                small = nums[i];
        }
        int hcf = 1;
        for (int i = 1; i <= small; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] % i ==0){
                    count++;
                }
                else if(nums[j] % i!= 0) break;
                if (count == nums.length){
                    if(hcf < i)
                        hcf = i;
                }
            }
        }
        System.out.print("The HCF is "+hcf);
    }

}
