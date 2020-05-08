package day22_Arrays_Loops;

import java.util.Arrays;

// Task:  Create a program that will print array in descending order

public class WarmUp_DescendingOrder_Array_Loop {
    public static void main(String[] args) {
        // 1. Sort Array first. We call Arrays.sort() method from Arrays class (import java.util.Arrays;)
        // 2. Reverse Array (sorted in ascending order ) using loops

        int [] arr = {10,20,54,87,96,-45};
        Arrays.sort(arr);       // array arr is now sorted in ascending order from small to large

        System.out.println(Arrays.toString(arr)); //      [-45, 10, 20, 54, 87, 96]

        // in order to reverse array we need to declare another array to include same elements in reversed order:
        // reversed order array is initialized the same length of original array
        int[] revArr = new int[arr.length];

        // the last index of the original array needs to be initialized to first index of revArray
        // the first index of original array: arr needs to be initialized to last index of reversed array: revArray


        // we can declare another variable j to represent the indexes at the original array like this:
        //   int j = arr.length-1; and decrement j -- .... or do the following:
        for (int i = 0 ; i <revArr.length ; i ++){ // we can use revArr.length or arr.length because they are the same
            revArr[i] = arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(revArr));  //      [96, 87, 54, 20, 10, -45]








    }
}
