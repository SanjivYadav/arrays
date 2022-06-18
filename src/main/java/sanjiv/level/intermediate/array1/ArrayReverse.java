package sanjiv.level.intermediate.array1;
/*
* Problem Description
        You are given a constant array A.

        You are required to return another array which is the reversed form of the input array.

* Example Input
Input 1:

A = [1,2,3,2,1]
Input 2:

A = [1,1,10]


Example Output
Output 1:

 [1,2,3,2,1]
Output 2:

 [10,1,1]

* */

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr){
        int l =0;
        int r = arr.length-1;
        while(l<r){
            /*int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;*/
            arr[l] = arr[l]^arr[r];
            arr[r]= arr[l]^arr[r];
            arr[l] = arr[l]^arr[r];
            l++;
            r--;
        }

        System.out.println("Reversed array is ..");
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
