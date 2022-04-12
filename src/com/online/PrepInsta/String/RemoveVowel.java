package com.online.PrepInsta.String;

import java.util.Scanner;

public class RemoveVowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine().trim();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str,i));
            else
            {
                res.append(str.charAt(i));
            }
        }
        System.out.print("After remove vowel from "+ str+"The result is: "+res);
    }
    public static boolean isVowel(String str,int pos){
          boolean flag = false;
            return (str.charAt(pos) == 'a' ||str.charAt(pos) == 'e' ||str.charAt(pos) == 'i'||
                str.charAt(pos) == 'o' ||str.charAt(pos) == 'u' ||str.charAt(pos) =='A' ||
                str.charAt(pos) =='E'  ||str.charAt(pos) =='I'  ||str.charAt(pos) =='O' ||
                str.charAt(pos) =='U');
    }
}
