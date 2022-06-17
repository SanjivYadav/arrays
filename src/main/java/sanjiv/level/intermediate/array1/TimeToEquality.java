package sanjiv.level.intermediate.array1;

import java.util.Arrays;

/*
*
* Problem Description
        Given an integer array A of size N. In one second, you can increase the value of one element by 1.

        Find the minimum time in seconds to make all elements of the array equal.
*
*
*               Example Input
                A = [2, 4, 1, 3, 2]


                Example Output
                8

*
* */
public class TimeToEquality {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 2};
        int res = countTimeToconvert(arr);
        System.out.println("Time to make elements to equal : "+res);
    }

    private static int countTimeToconvert(int[] arr){
        Arrays.sort(arr);
        int res=0;
        for(int element : arr){
            res +=arr[arr.length-1]-element;
        }
        return res;
    }
}
