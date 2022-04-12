package company.codingRound.friendsSuggestions;

import java.util.Scanner;

public class Find_Pair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of products:");
        int no_of_Products = scanner.nextInt();
        System.out.println("Enter the max value:");
        int maxValue = scanner.nextInt();
        int arr[] = new int[no_of_Products];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scanner.nextInt();
        }
    }
}
