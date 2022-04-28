package company.codingRound.friendsSuggestions;

import java.util.Scanner;

/*
* Date:13-03-2022
* Question Given by Rahul's Friend(Coding Round)
* ------------------**********---------------------
*
* Problem statement:
* ------------------
* You are playing an online game. In the game, a list of N numbers is given.
*
* The player has to arrange the numbers so that all the odd numbers of the list
* come after the even numbers.
*
* Write an algorithm to arrange the given list such that all the odd numbers
* of the list come after the even numbers.
*
* Input tofu
* ------
* The first line of the input consists of an integer num.representing
* the size of the list(N).
*
* The second line of the input consists of
* N  space-separated  integers representing the values of the list
*
* Output
* -------
* Print N space-separated integers such that all the odd numbers of the list
* come after the even numbers
*
* Example
*
* Sample Input
* -------------
* 8
* 10 98 12 3 33 22 21 11
* Sample Output
* --------------
* 10 98 12 22 3 33 21 11
* */
public class TestClass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Taking size of the array
        int[] arr = new int[n]; // Declaring array
        for (int i = 0; i < arr.length; i++) // Checking i is smaller than array size or not
            arr[i] = scn.nextInt(); // Taking elements of the array

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) // Checking the number is even
                // Printing the even numbers with print() method because we don't want
                // new line after printing even numbers
                System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)// Checking the number is odd
                // Same thing as above but here odd number will be print
                System.out.print(arr[i] + " ");
        }
        scn.close();

    }
}
