package Tasks.Replits;
/*
Given an array nums, calculate count of even numbers in nums and print out to console.
nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0
 */
import java.util.Scanner;

public class Rep_107_Arrays_CountEvens_LoopArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below
        int count = 0;
        for (int eachNum : nums){
            if (eachNum % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

        /*
        OR WE CAN TRY THIS WAY WITH REGULAR LOOP:
        for (int i = 0 ; i < nums.length; i ++){
            int eachNum = nums[i];
            if (eachNum %2 == 0 ){
                count++;
            }
        }

        System.out.println(count);
        */




    }
}
