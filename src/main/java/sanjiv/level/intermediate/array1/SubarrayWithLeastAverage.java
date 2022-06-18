package sanjiv.level.intermediate.array1;
/*
* Problem Description
        Given an array of size N, find the subarray of size K with the least average.
        *
Example Input
Input 1:
A=[3, 7, 90, 20, 10, 50, 40]
B=3
Input 2:

A=[3, 7, 5, 20, -10, 0, 12]
B=2


Example Output
Output 1:
3
Output 2:

4
* */
public class SubarrayWithLeastAverage {
    public static void main(String[] args) {
        int[] arr = {3, 7, 90, 20, 10, 50, 40};
        int k =3;
        int result = findLeastAverageKSubarray(arr,k);
        System.out.println("Least average of subarray of size k is : "+result);
    }

    private static int findLeastAverageKSubarray(int[] arr, int k){
        int sum =0;
        int max_avg =0;
        int res=0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        max_avg = sum/k;
        for(int i=k; i< arr.length;i++){
            sum = sum + arr[i]-arr[i-k];
            if(max_avg > sum/k) {
                max_avg = sum / k;
                res = i-k+1;
            }
        }
        return res;
    }
}
