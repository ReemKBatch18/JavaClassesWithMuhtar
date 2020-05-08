package day22_Arrays_Loops;

import java.util.Arrays;

public class NestedLoops2_2DArrays {
    public static void main(String[] args) {

        int [][] numbers = {{9,8,7},{6},{5,4,3,2,1,0}};
                //             0     1       2
        /*
        numbers[0]===> {9,8,7}; numbers [0][i]==> represents each element, i needs to be repeated 3 times
        numbers[1] ===> {6};    numbers [1][i]==> represents each element,  i needs to be repeated 1 time
        numbers [2]===> {5,4,3,2,1,0}; numbers [1][i]==> represents each element,  i needs to be repeated 6 times
        we have 3 single dimensional arrays ==> Declare a loop that will execute 3 times: That's the outer loop.
        Outer loop: will execute as many times as the length of the two dimensional array
        then inside it we create another loop - inner loop
        Inner loop: will execute as many times as the length of each single dimensional array
         */


        for (int k = 0 ; k < numbers.length ; k++){         // k : index number of each 1D array
            for (int i = 0 ; i < numbers[k].length ; i++) { // i : index number of each element in each 1D array
                System.out.print(numbers[k][i] + " ");  // prints all elements on one line // 9 8 7 6 5 4 3 2 1 0
            }
          //  System.out.println(); // breaks the line after printing each loop ==>
                                    //  Elements of  each 1D array are on separate line
        }
        System.out.println();
        System.out.println(Arrays.deepToString(numbers)); //  prints the 2D Array: [[9, 8, 7], [6], [5, 4, 3, 2, 1, 0]]
        // Arrays.deepToString() method prints multidimensional array

        System.out.println("=======================================================================");

        for (int k = 0 ; k < numbers.length ; k++){
            for (int i = numbers[k].length - 1 ; i >= 0; i--){  // starting with last index: length-1 ==> descending order
                System.out.print(numbers[k][i]+" ");        //      7 8 9  6  0 1 2 3 4 5
            }
            //  System.out.println(); // breaks the line after printing each loop-->
            //  Elements of  each 1D array are on separate line
                    }
        System.out.println();

        System.out.println("===============================================================");

        for (int k = numbers.length-1 ; k >=0 ; k--){ // prints elements of last 1D array first - descending order of 1D arrays
            for (int i = 0 ; i <numbers[k].length ; i ++ ){ // still ascending order of elements in each array
                System.out.print(numbers[k][i]+" ");        //      5 4 3 2 1 0  6  9 8 7
            }
        }
        System.out.println();
        System.out.println("=============================================================");

        for (int k = numbers.length-1 ; k >=0 ; k--){       // descending order (reversed order) of 1D arrays
            for (int i = numbers[k].length-1 ; i >= 0 ; i --){ // descending order of elements in each array
                System.out.print(numbers[k][i]+" ");        //      0 1 2 3 4 5  6  7 8 9
            }
        }







    }
}
