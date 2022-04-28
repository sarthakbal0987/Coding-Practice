package com.online.PrepInsta.GettingStarted;

import java.util.Scanner;

public class myBubbleSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scn.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("The sorted array is:");
        arr = sort(arr);
        for (int elements : arr) {
            System.out.print(elements + " ");
        }
        scn.close();
    }

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        return arr;
    }
}
