package OfficeHours.Practice_04_15_2020;
import java.util.Arrays;
public class ArraysUtility {
    /*
    Arrays.sort():  sorts the array elements in Ascending order
    Arrays.equal(arr1,arr2): checks if arr1 is equal to arr2
    Arrays.toString(): converts Single Dimensional array to string

    for multiDimensional array:
    Arrays.deepToString(): converts any multidimensional array to string
     */
    public static void main(String[] args) {
        int[] arr = {9,10,8,65,8,6,5};

        System.out.println( Arrays.toString(arr) );

        Arrays.sort(arr);  //[5, 6, 8, 8, 9, 10, 65]

        System.out.println( Arrays.toString(arr) );

        int[] salaries = { 9,8,10,2,3,4,5,6 };
        //int length =  salaries.length;
        // int lastIndex = length -1;

        Arrays.sort(salaries); // ascending

        System.out.println( Arrays.toString(salaries));  // [30, 432, 5000, 10000, 123123, 200000, 2000000]

        System.out.println("Minimum salary: " + salaries[0] );
        System.out.println("Maximum salary: "+ salaries[ salaries.length-1 ]);

        System.out.println("===================================");
        int[] arr1 = {3,2,1};
        int[] arr2 = {2,1,3};

        Arrays.sort(arr1); // {1,2,3};
        Arrays.sort(arr2);//  {1,2,3};

        System.out.println( Arrays.equals(arr1, arr2)  );







    }
}
