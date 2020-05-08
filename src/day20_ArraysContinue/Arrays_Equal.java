package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Equal {

    public static void main(String[] args) {

       // Arrays.equals(array1, array2) method: compares two arrays to each other and returns a boolean expression
        // since .equals(,) returns boolean, can we assign it to a boolean variable? yes we can

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        boolean result1 = Arrays.equals(arr1 , arr2);
        System.out.println(result1);    // true

        int[] arr3 = {1,3,2};
        int[] arr4 = {3,2,1};
        boolean r2= Arrays.equals(arr3,arr4);
        System.out.println(r2); // false because different element at each index

        Arrays.sort(arr3);      // Arrays.sort() method sorts array in ascending order
        Arrays.sort(arr4);      // Arrays.sort() method sorts array in ascending order
        boolean r3 = Arrays.equals(arr3,arr4);
        System.out.println(r3); //true after they are both sorted in ascending order

    }
}
