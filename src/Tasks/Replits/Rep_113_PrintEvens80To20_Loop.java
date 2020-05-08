package Tasks.Replits;

import java.util.Arrays;

/*
Write a for loop that prints all the even integers from 80 through 20 inclusive, separated by spaces.
MUST USE FOR EACH LOOP
 */
public class Rep_113_PrintEvens80To20_Loop {
    public static void main(String[] args) {

        int[] numbers = new int[61];
        for (int n =  0; n <= numbers.length-1; n ++) {
            numbers[n] =  80 - n;
        }

        for (int even : numbers) {
            if (even % 2 == 0) {
                System.out.print(even + " ");
            }
        }


    }
}


