package com.online.PrepInsta.Arrays;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = input.nextInt();
        int[] Array = new int[size];
        int[] revArray = new int[size];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = input.nextInt();
        }
        int Size = Array.length;
        for (int i = 0; i < size; i++) {
            revArray[i] = Array[Size - 1];
            Size--;
        }
        for (int number : revArray) {
            System.out.print(number + " ");
        }
        input.close();

    }
}
