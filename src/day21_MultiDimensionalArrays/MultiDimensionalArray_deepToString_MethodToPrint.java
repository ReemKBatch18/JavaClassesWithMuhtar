package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArray_deepToString_MethodToPrint {

    public static void main(String[] args) {

        int [] arr1D = {1,2,3};
        // to print this array we use Arrays.toString() method

        System.out.println(Arrays.toString(arr1D)); //  [1,2,3]

        //but if we have 2 dimensional array, we can not use toString method but we use deepToString method:

        int [][] arr2D = { {1,2,3}, {4,5,6} };
        System.out.println(Arrays.deepToString(arr2D)); //  [ [ 1,2,3 ], [4,5,6] ]

        // 3 dimensional array contains 2 dimensional arrays:

        //                       0         1           0            1
        int [][][] arr3D = { {{1,2,3}, {4,5,6}} , {{12,12,13}, {14,15,16}}   };
        //                             0                     1


        // in order to print 3 dimensional array, we use deepToString method
        System.out.println(Arrays.deepToString(arr3D));

       //  [] [] [] refer to the following:
        // [index num of 2D Array][index num of each 1D Array that exists in 2D Array][index num of each element that exists in each 1D Array]

        // this :  arr3D[0][1] will return us the 1D array which ...
        // so that we can print it with toString method like this:
        System.out.println(Arrays.toString(arr3D[0][1])); //  [4,5,6]


        // this arr3D[1][1][2] will return us a single element so we can print normally without any methods
        System.out.println(arr3D[1][1][2]); // 16



    }
}
