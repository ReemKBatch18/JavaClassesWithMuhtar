package day22_Arrays_Loops;

public class NestedLoops_Practice_NestedLoop {
    public static void main(String[] args) {

        //  [k]                0           1                2                    3
        int [][] nums = {  {1,2,3}, {4,5,6,7,8,9}, {10,11,12,13,14}, {15,16,17,18,19,20,21} };
        //    [i]           0 1 2    0 1 2 3 4 5    0 1  2   3  4     0  1  2  3  4  5  6

        // Task 1. print all even numbers in the same line
        // Task 2. count odd numbers ==> return the total odd numbers

        //Task 1.
        for (int k = 0 ; k < nums.length ; k ++){       //      k : index number of each single dimensional array
            for (int i = 0 ; i < nums[k].length; i++){    //    i : index number of each element in each 1D array
                if (nums[k][i] % 2 == 0 ){
                    System.out.print(nums[k][i] + " ");
                }

            }
        }
        System.out.println();
        System.out.println("==============================================================");

        // Task 2.
        int countOdds = 0;
        for (int k = 0 ; k < nums.length ; k++){
            for (int i = 0  ; i < nums[k].length ; i++){
                if (nums[k][i] % 2 != 0){
                    countOdds ++;
                }
            }
        }
        System.out.println(countOdds);







    }
}
