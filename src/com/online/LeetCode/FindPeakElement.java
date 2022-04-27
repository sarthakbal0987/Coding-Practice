package com.online.LeetCode;
import java.util.Scanner;

/*
* Array --> [1,2,1,4,6,5]
* Output:
*----------
* There are 2 peak elements of this give array.And those are follows:
* At index 1 --> The peak element is 2
* At index 5 --> The peak element is 6
*
*
* */
public class FindPeakElement {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the size of the array:");
            int size = scan.nextInt();
            int[] nums = new int[size];
            System.out.println("Enter elements of the array:");
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = scan.nextInt();
                }
            if (size <=2){
                System.out.print("Please provide at least 3 elements to find-out the peak element of the given array");
            }else{
                if(isAllElementSame(nums))
                    System.out.print("There is no peak element in this array because all the elements of the array are same.");
                else{
                    System.out.print("All elements are not same,So it is possible to find the peak elements of the given array.\n\n");

                    if(countAllPeakElementOfTheArray(nums)==0)
                        System.out.println("There is no peak element in this array.");
                    else{
                        int[] indexesOfPeakElements = indexesOfPeakElements(nums);
                        System.out.println("There are "+countAllPeakElementOfTheArray(nums)+" peak elements in this array.");
                        int[] theExactNumberOfElements=findPeakElement(nums);
                        for (int i = 0; i < countAllPeakElementOfTheArray(nums); i++) {
                            System.out.println("At index "+indexesOfPeakElements[i]+" ------> "+ theExactNumberOfElements[i]);
                        }
                    }
                }
            }
            scan.close();
        }
        
    }
    public static int countAllPeakElementOfTheArray(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || i == nums.length-1){
                continue;
            }else{
                if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                    count++;
                }
            }
        }
        return count;
    }
    public static int[] indexesOfPeakElements(int[] nums){
        int[] newArrayForIndexesOfPeakElements = new int[countAllPeakElementOfTheArray(nums)];
        int arrayIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            //It's the code for checking,which intermediate number (between first and last element) is a peak element or not
            if (i == 0 || i == nums.length-1){
                continue;
            }else{
                if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                    newArrayForIndexesOfPeakElements[arrayIndex] = i;
                    arrayIndex++;
                }
            }
        }
        return newArrayForIndexesOfPeakElements;
    }
    public static int[] findPeakElement(int[] nums){
        int[] storePeakElement = new int[countAllPeakElementOfTheArray(nums)];
        int newArrayIndex = 0;
        for (int i = 0; i < nums.length; i++) {
                //It's the code for checking,which intermediate number (between first and last element) is a peak element or not
            if (i == 0 || i == nums.length-1){
                continue;
            }else{
                if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                    storePeakElement[newArrayIndex] = nums[i];
                    newArrayIndex++;
                }
            }
        }
       return  storePeakElement;
    }

    public static boolean isAllElementSame(int[] nums){
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    flag = true;
                }
                else{
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
}
/*
! Call the below method to know the exact number of peak element present in the given array
! and what are those.
*/

