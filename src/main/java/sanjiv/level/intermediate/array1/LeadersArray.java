package sanjiv.level.intermediate.array1;

import java.util.ArrayList;
import java.util.List;

/*
* Problem Description

        Given an integer array A containing N distinct integers, you have to find all the leaders in array A.

        An element is a leader if it is strictly greater than all the elements to its right side.

        NOTE:The rightmost element is always a leader.


        * Input 1:

         A = [16, 17, 4, 3, 5, 2]
        Input 2:

         A = [1, 2]


        Example Output

        Output 1:

 [17, 2, 5]
Output 2:

 [2]
* */
public class LeadersArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int[] res = findLeadersInArray(arr);
        System.out.println("Leaders of the array are : ");
        for(int element : res){
            System.out.print(element + " ");
        }
    }

    private static int[] findLeadersInArray(int[] arr){
        List<Integer> ls = new ArrayList<Integer>();
        int curr_leader = arr[arr.length-1];
        ls.add(curr_leader);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>curr_leader){
                curr_leader = arr[i];
                ls.add(curr_leader);
            }
        }
        int[] res = new int[ls.size()];
        int k=0;
        for(Integer i : ls){
            res[k++] = i;
        }
        return res;
    }
}
