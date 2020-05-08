package day22_Arrays_Loops;

public class NestedLoops_ForEach_Practice_2DArrays {
    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
        // 1. print all even numbers in a same line
        // 2. count odd numbers ==> return the total odd number
        // for task 2 we need another variable countOdds to count odds
        // 3. find sum of odds --> need variable sumofOdds
        // 4. find sum of evens --> need variable sumofEvens
        int countOdds = 0;
        int sumofOdds = 0;
        int sumofEvens = 0;


        for (int [] each1DArray : numbers){         // each1DArray:  each of the single dimensional arrays
            for (int eachnumber : each1DArray){   //   eachnumber: each element in each single dimensional array
                if (eachnumber % 2 ==0 ){
                    System.out.print(eachnumber + " ");     // printing even numbers on one line
                    sumofEvens += eachnumber;       // adding even numbers to variable sumofEvens
                }else{
                    sumofOdds +=eachnumber;         // adding odd numbers to variable sumofOdds
                    countOdds++;                    // counting how many odd numbers
                }
            }
        }

        System.out.println();
        System.out.println(countOdds);
        System.out.println("sum of odd numbers is: "+ sumofOdds);
        System.out.println("sum of even numbers is: "+ sumofEvens);










    }
}
