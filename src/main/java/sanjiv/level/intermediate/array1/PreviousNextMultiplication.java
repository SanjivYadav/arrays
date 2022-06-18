package sanjiv.level.intermediate.array1;
/*
* Given an array of integers A, update every element with multiplication of previous and next elements with following
* exceptions. a) First element is replaced by multiplication of first and second. b) Last element is replaced by multiplication
* of last and second last.
*
*       Input 1:
            A = [1, 2, 3, 4, 5]
        Output 1:
            [2, 3, 8, 15, 20]

        Input 2:
            A = [5, 17, 100, 11]
        Output 2:
            [85, 500, 187, 1100]
* */
public class PreviousNextMultiplication {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = findPrevNextMultiplicationArray(arr);
    }

    private static int[] findPrevNextMultiplicationArray(int[] arr){
        int prev=1;
        for(int i=0;i<arr.length;i++){
            int tempPrev = arr[i];
            int tempNext =1;
            if(i==0)
                prev = arr[i];
            if(i+1<arr.length)
                tempNext = arr[i+1];
            else
                tempNext = arr[i];
            arr[i]= tempNext*prev;
            prev = tempPrev;
        }
        return arr;
    }
}
