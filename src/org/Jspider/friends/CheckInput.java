package org.Jspider.friends;
import java.util.Scanner;
/*
* Date:10-03-2022
* Question Given by Sonu Bhai
* ----------**********---------
* Write a program to check the type of character given by the
* user.
* Explanation:
*    User will enter a character we have to write a program which
*    will print the type of entered character means whether it is a digit or upper case letter
*    or lower case letter or a special character.
*
* Reference:
*     Character     ASCII
*    ------------------------
*      A - Z       65 - 90
*      a - z       97 - 122
*      0 - 9       48 - 57
*/

public class CheckInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = input.next().charAt(0);//Taking the user input
        if ((int)ch >=48 & (int)ch <=57)//Type cast from char to int for character's ascii value and then compare with the ascii value of digit
        {
            System.out.println("The entered character is a digit");
        }
        else if ((int)ch >=65 & (int)ch <=90)//Compare with the ascii value of upper case letter
              {
                 System.out.println("The entered character is an upper case letter");
              }
              else if ((int)ch >= 97 & (int)ch <=122)//Compare with the ascii value of lower case letter
              {
                      System.out.println("The entered character is a lower case letter ");
              }
              else //If anyone's ascii value will not match with the ascii value of entered character then print the below statement
              {
                 System.out.println("The entered character is a special character ");
              }
       }
    }
