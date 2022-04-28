package com.online.LeetCode;

import java.util.Scanner;

public class Two_Sum {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = scn.nextInt();
    int[] nums = new int[size];
    if (size < 2) {
      System.out.println("Please provide at least two elements to proceed..");
    } else {
      System.out.println("Enter elements of the array:");
      for (int i = 0; i < nums.length; i++) {
        nums[i] = scn.nextInt();
      }
      System.out.println("Enter target:");
      int target = scn.nextInt();
      if (twoSum(nums, target).length >= 2) {
        System.out.print("[");
        for (int i = 0; i < 2; i++) {
          if (i == 0)
            System.out.print(twoSum(nums, target)[i] + ",");
          if (i == 1)
            System.out.print(twoSum(nums, target)[i]);
        }
        System.out.print("]");
      } else {
        System.out.println("There is no such two numbers whose sum is equal to " + target);
      }
    }
    scn.close();

  }

  public static int[] twoSum(int[] arr, int target) {
    int[] storeIndexes = new int[2];
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          storeIndexes[0] = i;
          storeIndexes[1] = j;
          break;
        }
      }
    }
    return storeIndexes;
  }
}
