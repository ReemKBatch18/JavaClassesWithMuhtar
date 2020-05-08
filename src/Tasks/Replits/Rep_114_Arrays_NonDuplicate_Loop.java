package Tasks.Replits;

import java.util.Scanner;

/*
Given an array nums with 7 integers every element is repeated twice - except one.
Find that element and print it to console.
Example:
nums -> [1, 1, 2, 3, 4, 3, 4]
         2
 */
public class Rep_114_Arrays_NonDuplicate_Loop {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        for(int i = 0; i < nums.length ; i++){
            int count = 0;
            for (int j = 0; j <nums.length; j ++){
                if (nums[j] == nums[i]){
                    count++;
                }
            }
            if (count == 1 ){
                System.out.println(nums[i]);
            }
        }


    }
    }







