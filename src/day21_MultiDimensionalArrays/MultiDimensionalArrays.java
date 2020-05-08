package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };   // Array's purpose is to store multiple data
    // multi Dimensional Array : is a variable that can store multiple arrays
    //math formula is:
    // n dimensional array MUST contain (n-1) dimensional arrays
    // so 2 dimensional array contains 1 dimensional arrays

    //                     0 1 2      0  1  2  3
        int [][] arr2D = {{1,2,3}  , {4 ,5 ,6, 7 }   };
    //  indexes are          0     ,       1
    // int [][] arrayName = { {   } , {   } }

        System.out.println(arr2D.length); // length of 2D array is 2 because it has 2 1D arrays
            // each index represents one dimensional array ==> index 0 is first array, index 1 is second array
        int [] arr1D = arr2D[0]; // {1, 2, 3}
        // we can assign it to single dimensional array because that's what each index returns us

        // we can print the single dimensional array using Arrays.toString() method
        System.out.println(Arrays.toString(arr1D));

        int num1 = arr2D[1] [3]; // 7
        // [1] represents the second index in the 2D
        // [3] represents the fourth index in the 1D
        System.out.println(num1);


        //                   0    1       0    1    2         0    1    2
        char [][] ch2D = { {'A', 'B'} , {'C', 'D', 'E'}  ,  {'F', 'G', 'H'}};
        // index               0               1                   2

        // in order to return character D from this 2D array, we use index of 2D array and index of 1D array
        // since it returns us a char ==> we can assign it to char:
        char c1 = ch2D[1][1];
        System.out.println(c1);     // D

       // to print the last index in the 2D array ch2D which represents the 1D array {F  G  H}:
        char [] third = ch2D[2];
        // to print we use Arrays.toString method
        System.out.println(Arrays.toString(third));











    }
}
