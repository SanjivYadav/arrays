package sanjiv.level.intermediate.array1;

import java.util.Arrays;

/*
* Problem Description:
        Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
        *

* Example Input
Input 1:

 A = [3, 2, 1, 3]
Input 2:

 A = [1, 1, 3, 3]


Example Output
Output 1:

 1
Output 2:

 -1
* */
public class NobleInteger {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 3};
        //int[] arr1 = {1, 1, 3, 3};
        boolean hasNobleInteger = checkForNobleInteger(arr);
        System.out.println("Array has a noble integer : "+ hasNobleInteger);
    }
    private static boolean checkForNobleInteger(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i] == arr.length-i-1)
                return true;
        }
        return false;

    }
}
