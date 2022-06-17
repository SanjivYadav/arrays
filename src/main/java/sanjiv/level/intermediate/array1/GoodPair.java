package sanjiv.level.intermediate.array1;
/*
* Problem Description:
        Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
*
* Example Input
                                Input 1:

                                A = [1,2,3,4]
                                B = 7
                                Input 2:

                                A = [1,2,4]
                                B = 4
                                Input 3:

                                A = [1,2,2]
                                B = 4


                                Example Output
                                Output 1:

                                1
                                Output 2:

                                0
                                Output 3:

                                1
*
*
*  */
public class GoodPair {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int sum = 7;
        boolean hasPair = checkForPairOfGivenSum(arr, sum);
        System.out.println("Array has pair with given sum : "+hasPair);
    }

    private static boolean checkForPairOfGivenSum(int[] arr, int sum){
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum)
                    return true;
            }
        }
        return false;
    }
}
