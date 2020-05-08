package day20_ArraysContinue;

import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};

        int[] arr3 = new int[arr1.length + arr2.length]; // contains all elements from array1 and array2

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i]; // now it looks like [1,2,3,0,0,0,0,]
        }
        for(int i =0 ; i <arr2.length; i++){
            // arr3[arr1.length +i] is the index right after the elements of arr1 in arr3
            arr3[arr1.length+i] = arr2[i];
                // we start where we left at arr1.length+0 = 3 (our index number at arr3) with is the fourth index in arr3
        }


        System.out.println(Arrays.toString(arr3));      //  [1, 2, 3, 4, 5, 6, 7]





    }
}