package Solve_.OwnSelf.SlefProblems;

import java.util.Scanner;

/**
 * Customized two sum program(Customized by @Dev-Soumyaranjan)
 * ----------------------------
 * Expected Output that I want👇
 * ! Output 1
 * --------
 * Enter size of the array: 6
 * Enter elements of the array: [1,3,6,5,4,2]
 * Enter target: 7
 * 
 ** O/P
 * ----
 * Followings are the pair of elements whose sum is equal to 7
 * Pair 1 : [1,6]
 * Pair 2 : [2,5]
 * Pair 3 : [4,3]
 * ! Output 2
 * --------
 * Enter size of the array: 14
 * Enter elements of the array: [0,1,2,4,2,5,1,6,3,7,8,2,9,3]
 * Enter target: 9
 * 
 ** O/P
 * ----
 * There are repetition of same element in the array and those are followings:
 * 1 --> 2 times
 * 2 --> 3 times
 * 3 --> 2 times
 * So we will not consider those repetitive elements as per their frequency for
 * making the pair.
 * Followings are the pair of elements whose sum is equal to 7
 * Pair 1 : [0,9]
 * Pair 2 : [1,8]
 * Pair 3 : [2,7]
 * Pair 4 : [3,6]
 * Pair 5 : [4,5]
 * Note:You can print those pairs element in alternative order means you can
 * print [8,1] in the place of [8,1]
 * 
 * Conditions:
 * 1.If array is empty then print the empty alert message
 * 2.If all elements of the array are same then print that message as output
 * 3.If there are no two elements of the array whose some is equal to target
 * then print that message.
 */
public class Two_Sum_Extended {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = scn.nextInt();
    int[] nums = new int[size];
    if (size < 2) {
      System.out.println("Invalid!!");
    } else {
      int count = 0;
      System.out.println("Enter elements of the array:");
      for (int i = 0; i < nums.length; i++) {
        nums[i] = scn.nextInt();
        count++;
      }
      int ArraySizeForNewSortedArray = arraySizeOfNewArray(repeatingElementsOfTheArray(nums),
          countRepeatingElement(nums), nums);
      int[] NewSorted = sortedArray(newArrayWithoutRepeatedElements(nums, ArraySizeForNewSortedArray));
      if (count < 1) {
        System.out.println("Array is empty ! please enter some elements to proceed.Try again!😔");
      } else {
        if (isAllElementSame(nums)) {
          System.out
              .print("You entered all same element.Please enter different elements for better output.Try again!!");
        } else {
          System.out.println("Enter target:");
          int target = scn.nextInt();

          if (isTwoSumAvailable(NewSorted, target) == 1) {
            System.out.print("There are no such two elements whose sum is equal to " + target);
          } else {
            if (countRepeatingElement(nums) == 1) {
              System.out.println(
                  "There is only " + countRepeatingElement(nums) + " repeated element in the array and that is:");
              printRepeatedElement(nums);
              System.out.println(
                  "So we will not consider this repetitive element as per that frequency for making the pair.");
              System.out.println("Followings are the pair of elements whose sum is equal to " + target);
              twoSum(NewSorted, target);

            } else if (countRepeatingElement(nums) > 1) {
              System.out.println("There are " + countRepeatingElement(nums)
                  + " repeated elements in the array and those are followings:");
              printRepeatedElement(nums);
              System.out.println(
                  "So we will not consider those repetitive elements as per their frequency for making the pair.");
              System.out.println("Followings are the pair of elements whose sum is equal to " + target);
              twoSum(NewSorted, target);
            } else {
              System.out.println("There is no repeated elements in this array");
              System.out.println("Followings are the pair of elements whose sum is equal to " + target);
              twoSum(NewSorted, target);
            }
          }
        }
      }
    }
    scn.close();
  }

  public static boolean isAllElementSame(int[] nums) {
    boolean flag = false;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          flag = true;
        } else {
          flag = false;
        }
      }
      if (flag)
        continue;
      else
        break;
    }
    return flag;
  }

  public static int isTwoSumAvailable(int[] arr, int target) {
    int slno = 1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          slno++;
        }
      }
    }
    return slno;
  }

  public static void twoSum(int[] arr, int target) {
    int slno = 1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          System.out.println("Pair " + slno + " : [" + arr[i] + "," + arr[j] + "]");
          slno++;
        }
      }
    }
  }

  public static int[] newArrayWithoutRepeatedElements(int[] nums, int repeated_Elements) {
    int[] ResultantArray = new int[repeated_Elements];
    int indexOfResultantArray = 0;
    for (int i = 0; i < nums.length; i++) {
      int count = 1;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }
      if (count > 1) {
        boolean flag = true;
        for (int j2 = 0; j2 < ResultantArray.length; j2++) {
          if (nums[i] == ResultantArray[j2]) {
            flag = false;
            break;
          }
        }
        if (flag) {
          ResultantArray[indexOfResultantArray] = nums[i];
          indexOfResultantArray++;
        }
      } else {
        boolean flag_1 = true;
        for (int j2 = 0; j2 < ResultantArray.length; j2++) {
          if (nums[i] == ResultantArray[j2]) {
            flag_1 = false;
            break;
          }
        }
        if (flag_1) {
          ResultantArray[indexOfResultantArray] = nums[i];
          indexOfResultantArray++;
        }
      }
    }
    return ResultantArray;
  }

  public static int[] sortedArray(int[] ResultantArray) {
    int IndexOfSortedArray = ResultantArray.length;
    for (int i = 0; i < IndexOfSortedArray - 1; i++) {
      for (int j = 0; j < IndexOfSortedArray - 1 - i; j++) {
        if (ResultantArray[j] > ResultantArray[j + 1]) {
          // Swap Elements
          int temp = ResultantArray[j + 1];
          ResultantArray[j + 1] = ResultantArray[j];
          ResultantArray[j] = temp;
        }
      }
    }
    return ResultantArray;
  }

  public static int repeatingElementsOfTheArray(int[] nums) {
    int[] storingRepeatingElements = new int[countRepeatingElement(nums)];
    int indexOfStoringRepeatingElementsArray = 0;

    int repeatingElementsCounter = 0;
    for (int i = 0; i < nums.length; i++) {
      int count = 1;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }
      if (count > 1) {
        boolean flag = true;
        for (int j2 = 0; j2 < storingRepeatingElements.length; j2++) {
          if (nums[i] == storingRepeatingElements[j2]) {
            flag = false;
            break;
          }
        }
        if (flag) {
          storingRepeatingElements[indexOfStoringRepeatingElementsArray] = nums[i];
          indexOfStoringRepeatingElementsArray++;
          repeatingElementsCounter += count;
        }
      }
    }
    return repeatingElementsCounter;
  }

  public static void printRepeatedElement(int[] nums) {
    int[] storingRepeatingElements = new int[countRepeatingElement(nums)];
    int indexOfStoringRepeatingElementsArray = 0;
    for (int i = 0; i < nums.length; i++) {
      int count = 1;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }
      if (count > 1) {
        boolean flag = true;
        for (int j2 = 0; j2 < storingRepeatingElements.length; j2++) {
          if (nums[i] == storingRepeatingElements[j2]) {
            flag = false;
            break;
          }
        }
        if (flag) {
          storingRepeatingElements[indexOfStoringRepeatingElementsArray] = nums[i];
          indexOfStoringRepeatingElementsArray++;
          System.out.println(nums[i] + " --->" + count + " times");
        }
      }
    }
  }

  public static int arraySizeOfNewArray(int repeatingElementsOfTheArray, int countRepeatingElement, int[] nums) {
    int c1 = repeatingElementsOfTheArray(nums) - countRepeatingElement(nums);
    return nums.length - c1;

  }

  public static int countRepeatingElement(int[] nums) {
    int[] storingRepeatingElements = new int[nums.length];
    int indexOfStoringRepeatingElementsArray = 0;
    for (int i = 0; i < nums.length; i++) {
      int count = 1;
      for (int j = i + 1; j < nums.length; j++) {

        if (nums[i] == nums[j]) {
          count++;
        }
      }
      if (count > 1) {
        boolean flag = true;
        for (int j2 = 0; j2 < storingRepeatingElements.length; j2++) {
          if (nums[i] == storingRepeatingElements[j2]) {
            flag = false;
            break;
          }
        }
        if (flag) {
          storingRepeatingElements[indexOfStoringRepeatingElementsArray] = nums[i];
          indexOfStoringRepeatingElementsArray++;
        }
      }
    }
    return indexOfStoringRepeatingElementsArray;
  }
}
