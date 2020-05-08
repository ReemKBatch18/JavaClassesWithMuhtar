package day22_Arrays_Loops;

import java.util.Arrays;

public class NestedLoop_ForEach_2DArrays {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        for (int each : arr){
            System.out.println(each);
        }

        int [][] arr2D = {{1,2,3},{4,5,6}};
                //          0         1

        for ( int [] each1DArray : arr2D){
            System.out.println(Arrays.toString(each1DArray));
        }
        System.out.println("======================================================");
        // can we apply for each to the top for each?? yes we can ==> nested for each loop for 2DArray
        for ( int [] each1DArray : arr2D) {       // each1DArray : each single dimensional array in the two dimensional array
            for (int eachElement : each1DArray) {  // eachElement: each element in each single dimensional array
                System.out.println(eachElement); // prints all elements of 2D array

            }
        }
        System.out.println("========================================================");
        // now let's do it with multidimensional char array
        char[][] ch2D = { {'a','b',}, {'c','d','e'}, {'f','g','h','i'}};
                //              0            1               2

        //what variable do we need to declare for a "for each" loop? a single dimensional char array:
        for (char[] ch1D : ch2D){
            System.out.println(Arrays.toString(ch1D));
        }

     // Can I declare a for each loop for the above array to retrieve the elements from arrays? yes I can:

        for (char[] ch1D : ch2D){
            for (char eachElement :ch1D){
                System.out.println(eachElement);
            }
        }







    }
}
