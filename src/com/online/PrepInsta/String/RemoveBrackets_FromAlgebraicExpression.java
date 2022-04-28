package com.online.PrepInsta.String;

import java.util.Scanner;

/*
* ( ----> 40
* ) ----> 41
* { ----> 123
* } ----> 125
* [ ----> 91
* ] ----> 93
*/
public class RemoveBrackets_FromAlgebraicExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an algebraic Expression");
        String expression = scan.nextLine();
        String Result = "";
        if (isExpressionContainBracktes(expression)) {
            for (int i = 0; i < expression.length(); i++) {
                if (checkIsitBracket(expression.charAt(i)))
                    ;
                else {
                    Result = Result + expression.charAt(i);
                }
            }
        }
        System.out.print("After removing brackets the final algebraic expression is :" + Result);
        scan.close();

    }

    public static boolean isExpressionContainBracktes(String str) {
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 40 || str.charAt(i) == 41 ||
                    str.charAt(i) == 123 || str.charAt(i) == 125 ||
                    str.charAt(i) == 91 || str.charAt(i) == 93) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static boolean checkIsitBracket(char ch) {
        return (ch == 40 || ch == 41 || ch == 123 || ch == 125 || ch == 91 || ch == 93);
    }
}
