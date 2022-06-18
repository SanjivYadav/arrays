package sanjiv.level.intermediate.array1;
/*
* Problem Description
        Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.
        Find the rotated array for each value and return the result in the from of a matrix where ith row represents the rotated array for the ith value in B.
*
*
* Example Input
Input 1:

    A = [1, 2, 3, 4, 5]
    B = [2, 3]

Input 2:


    A = [5, 17, 100, 11]
    B = [1]




Example Output
Output 1:

    [ [3, 4, 5, 1, 2]
     [4, 5, 1, 2, 3] ]


Output 2:


    [ [17, 100, 11, 5] ]

* */
public class LeftRotations {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int[] rotation = {2, 3};
        int length = arr.length;
        int[][] result = new int[rotation.length][arr.length];
        int i=0;
        for(int element : rotation){
            result[i++] = findArrayAfterNLeftRottions(arr, element);
        }
        System.out.println("Print rotations ....");
        for(int[] row : result){
            for(int element : row){
                System.out.print(element +" ");
            }
            System.out.println(" ");
        }
    }

    private static int[] findArrayAfterNLeftRottions(int[] arr, int rotations){
        int result[] = new int[arr.length];
        for(int i= rotations ; i< (arr.length+ rotations);i++){
            result[i-rotations] = arr[i%arr.length];
        }
        return result;
    }
}
