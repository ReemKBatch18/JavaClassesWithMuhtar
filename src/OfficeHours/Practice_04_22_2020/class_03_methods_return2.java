package OfficeHours.Practice_04_22_2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class class_03_methods_return2 {
// 1. write a return method that can return the second maximum from int array:

    public static void main(String[] args) {

        //This is how we return second max num from an int array without returning
    int [] arr = {100,46,57,500,448,991,-7,-55};    //  [-55, -7, 46, 57, 100, 448, 500, 991]
    Arrays.sort(arr);
  //  System.out.println(Arrays.toString(arr));
    int lastIndexnum= arr.length-1;
    int secondlastindexnum = lastIndexnum-1;    // arr.length-2
        int secondMaxNum = arr[secondlastindexnum];
        System.out.println(secondMaxNum);       // 500

        // This is how we return second max num from any int array using return method:
        secondMax(arr);
        System.out.println(secondMax(arr));     // 500


    }

    // THIS METHOD WILL RETURN THE 2ND MAX FROM INT ARRAY:
    public static int secondMax(int[] arr){
        Arrays.sort(arr);
      //  System.out.println(Arrays.toString(arr));
        int lastIndexnum= arr.length-1;
        int secondlastindexnum = lastIndexnum-1;    // arr.length-2
        int secondMaximum = arr[secondlastindexnum];
        return secondMaximum;
    }
}
