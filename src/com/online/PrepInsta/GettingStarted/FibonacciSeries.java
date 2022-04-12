package com.online.PrepInsta.GettingStarted;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the nth term:");
       int n = input.nextInt();
//        for (int i = 0;fibo(i)<=n; i++) {
//            System.out.print(fibo(i)+",");
//        }
        fibo(n);
    }
    public static void fibo(int n){
        int prev = 0;
        int curr = 1;
        int next = 0;
//        if ( n == prev){
//            return prev;
//        }
//        if ( n == curr){
//            return curr;
//        }
        System.out.print(prev+" , "+curr+" , ");
        for (int i = 2; i <= n; i++) {
            next = prev + curr;
            System.out.print(next+",");
            prev = curr;
            curr = next;
        }
    }

}
