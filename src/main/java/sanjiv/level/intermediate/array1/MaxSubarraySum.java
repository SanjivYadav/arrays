package sanjiv.level.intermediate.array1;

/*
* Problem Description
            Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.

        * Example Input
        Input 1:

         A = [1, 2, 3, 4, -10]
        Input 2:

         A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]


        Example Output
        Output 1:

         10
        Output 2:

         6

* */
public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = maxSubArraySum(arr);
        System.out.println(" max sum of max sum subarray is : "+res);
    }

    private static int maxSubArraySum(int[] arr){
        int max_Sum = Integer.MIN_VALUE;
        int curr_sum =0;
        for(int i=0;i<arr.length;i++){
            curr_sum += arr[i];
            if(max_Sum < curr_sum)
                max_Sum = curr_sum;
            if(curr_sum < 0)
                curr_sum =0;
        }
        return max_Sum;
    }
}
