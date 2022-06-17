package sanjiv.level.intermediate.array1;
/*
* Problem Description

    Given a positive integer A, return an array of strings with all the integers from 1 to N. But for multiples of
    3 the array should have “Fizz” instead of the number. For the multiples of 5, the array should have “Buzz”
    instead of the number. For numbers which are multiple of 3 and 5 both, the array should have "FizzBuzz" instead
    of the number.

Look at the example for more details.
*
                Input 1:

                 A = 5


                Example Output

                Output 1:

                 [1 2 Fizz 4 Buzz]

*
* */
public class FizzBuzz {
    public static void main(String[] args) {
        int input = 15;
        String[] res = findFizzBuzz(input);
        System.out.println("Result is : ");
        for(int i=0;i<input;i++){
            System.out.print(res[i] + " ");
        }
    }
    private static String[] findFizzBuzz(int input){
        String[] res = new String[input];
        for(int i=1; i<= input;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res[i-1] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                res[i-1] = "Fizz";
            }
            else if (i % 5 == 0) {
                res[i-1] = "Buzz";
            }else{
                res[i-1]=String.valueOf(i);
            }
        }
        return res;
    }

}

