package day22_Arrays_Loops;

import java.util.Arrays;

public class Multi_D_Arrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
                //    0 1 2

        // n dimensional array contains (n-1) dimensional arrays
        // 2 dimensional array contains 2-1 = 1 dimensional arrays
        // 3 dimensional array contains 3-1 = 2 dimensional arrays==> each 2 dimensional array contains 1 dimensional arrays

        // 2D array :[index num of 1D array][index num of elements]
        int [][] arr2D = { {1,2,3} , {4,5,6}};
                //            0         1

        int[] arr1D = arr2D[0];  // the first index of the 2 dimensional array is a 1 dimensional array
        System.out.println(Arrays.toString(arr1D)); // 1st single dimensional array from arr2D //    [1,2,3]
                        // Arrays.toString(1DArrayName) : prints 1D array

        System.out.println( arr2D[0][2]);         // 3rd element in the 1st 1D array --> 3

        System.out.println(Arrays.deepToString(arr2D)); //     [ [1,2,3], [4,5,6] ]
                        //  Arrays.deepToString(2DArrayName): prints 2D, 3D, 4D,... arrays

        System.out.println(Arrays.toString(arr2D[1]));   // [ 4,5,6]


        // To print each element in the first array in the  2D array we will use for each loop
        for( int each : arr2D[0]){
            System.out.println(each);
        }

      // we can also use regular for loop to print each element from the first array
      for(int i = 0; i < arr2D[0].length ; i++){
          System.out.println(arr2D[0][i]);
      }



    }
}
