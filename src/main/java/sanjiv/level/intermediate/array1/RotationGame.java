package sanjiv.level.intermediate.array1;

/*
* Problem Description
        Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.

* Example Input
        Input 1 :
        4 1 2 3 4
        2


        Example Output
        Output 1 :
        3 4 1 2
* */
public class RotationGame {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = 2;
        int[] res = rightRotationNTimes(arr,n);
        System.out.println("Result is  :");
        for(int element : res) {
            System.out.print(element + " ");
        }
    }

    private static int[] rightRotationNTimes(int[] input, int n){
        int[] res = new int[input.length];
        int i= input.length-n-1;
        int k=0;
        for(int j=i+1;j != i; j=(j+1)%(input.length)){
            res[k++]=input[j];
        }
        res[k] = input[i];
        return res;
    }
}
