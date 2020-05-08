package day24_Methods;

import java.text.DecimalFormat;
import java.util.Arrays;

/*
4. creata a function that can print the maximum number from any given array
5. creata a function that can print the minimum number from any given array
6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
 */
public class C_01_WarmUps_MethodsPractices_CallMinMax_DescendingArray {

   //Task 4. Return Max number from Array
    // we will use a parameter: single dimensional array in this method
    public static void MaxNum(int[] array){
        // first we sort array
        Arrays.sort(array); // Now array is sorted in ascending order from minimum to maximum
        System.out.println("Maximum number in this array is: " +array[array.length - 1]);// we print last index = array.length-1 to get maximum number
        System.out.println("=========================================================");
    }

    // Task 5. Return Min number from array
    // we will use a parameter: single dimensional array in this method
    public static void MinNum(int[] array){
        // first we sort array
        Arrays.sort(array); // Now array is sorted in ascending order from minimum to maximum
        System.out.println("Minimum number in this array is: " +array[0]);// we print first index = 0 to get minimum number
        System.out.println("===========================================================");
    }

    // Task 6. Print array in Descending order
    // we will use a parameter: single dimensional array in this method
    public static void DescendingArray(int[] array){
        // first we sort array by calling sort method
        Arrays.sort(array);
        // Now we create a regular for loop to repeat printing indexes in reversed order
        // we start i from last index of array and decrement i-- till 0 (0 is the first index)
        for (int i = array.length-1 ; i >= 0 ; i-- ){
            System.out.print(array[i]+ " "); // this will print number on one line with a space

        }
        System.out.println(); // we need to add this println to move to next line
        System.out.println("==========================================================");
    }




//Here we create our main method to call the methods we created
    public static void main(String[] args) {

        // This is the example array --> we need to find the max number in this array:
        int [] arr = {10,8,9,7,6,5,100,74};
        // Now we call the method
        // But we have to pass the parameter to the method we are calling which is the arr in the line above
        MaxNum(arr); // ==> max 100

        MinNum(arr);//==> min 5

        DescendingArray(arr);   //  100 74 10 9 8 7 6 5

        // Now if I have another array, I can still call these methods. Just change the parameter (name of array)
        int [] arr2 = {12,358,654,751,922,100};
        MaxNum(arr2);       //  922
        MinNum(arr2);       //  12
        DescendingArray(arr2);  //  922 751 654 358 100 12
    }

}
