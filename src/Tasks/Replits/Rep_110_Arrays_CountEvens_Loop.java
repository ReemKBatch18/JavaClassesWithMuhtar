package Tasks.Replits;
/*
Given an array nums, calculate count of even numbers in nums (not their values!)
 and print out to console.
Note: MUST USE For Each Loop
nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0
 */
import java.util.Scanner;

public class Rep_110_Arrays_CountEvens_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int count = 0;

        for (int eacheven: nums){
            if (eacheven % 2 ==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
