package OfficeHours.Practice_04_15_2020;

public class NestedLoop_Multi_D_Arrays {

    public static void main(String[] args) {

        int [][] nums = {
                {5,4,3,2,1},
                {10,11,12,13,14,15},
                {16,17,18,19,20},
        };

        // print all odd numbers with regular for loop. MUST use continue;
        for (int j = 0; j < nums.length ; j ++){        // j : index number of 1 D Arrays

            for (int i = 0 ; i < nums[j].length ; i++ ){        // i : index number of elements

                if (nums[j][i] % 2 == 0 ){
                    continue;

                }
                System.out.print(nums[j][i] + " ");
            }


        }
        System.out.println();
        System.out.println("=============================================================");

        // print all even nums with for each loop

        for (int[] each1Darr : nums){
            for (int eachNum : each1Darr){
                if (eachNum % 2 != 0 )
                    continue;
                System.out.print(eachNum+ " ");
            }

        }

    }
}
