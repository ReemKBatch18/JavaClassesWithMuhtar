package day24_Methods;

import java.util.Arrays;

public class C_09_ReturnMethods_Practice_DescendingArray {

    //THIS IS OUR MAIN WHERE WE CALL METHODS
    public static void main(String[] args) {
        int [] arr1 = {1,20,9,8,4,15};
        int [] arr2 = {2,5,87,955,122,};
        int [] arr3 = {1234,456,4785,5478,2000};


        sortDescending(arr1);  // we can only print this reversed array but we can not reassign it or re-use it

     // Here we will reassign arrays and use the return method to call in descending order
        arr1 = sortDescend(arr1);
        arr2 = sortDescend(arr2);
        arr3 = sortDescend(arr3);

        System.out.println(Arrays.toString(arr1)); // [20, 15, 9, 8, 4, 1]
        System.out.println(Arrays.toString(arr2)); // [955, 122, 87, 5, 2]
        System.out.println(Arrays.toString(arr3)); // [5478, 4785, 2000, 1234, 456]

    // Or we can create new int arrays
        int[] arr1Rev = sortDescend(arr1);
        int[] arr2Rev = sortDescend(arr2);
        int[] arr3Rev = sortDescend(arr3);
    }


   // First we will try with void method (no Return)
    public static void sortDescending (int[]arr){
        // first sort
        Arrays.sort(arr);
        // then we create another array to contain elements in descending order
        int [] RevArr = new int [arr.length];
        // last index of arr == first index of RevArr

       /*//    i        j
        RevArr[0] = arr[3];
        RevArr[1] = arr[2];
        RevArr[2] = arr[1];
        RevArr[3] = arr[0];
        i is increasing starting from 0
        j is decreasing starting from last index
        We can apply a loop
      */
       int j = arr.length-1;
       for (int i = 0 ; i <arr.length ; i++){
           RevArr[i] = arr[j];
           j--;
       }

       // In this method I can only print out the reversed array
        // I can't in this method "void" when I call it in the main method to assign this reversed array to an array
    }

    //Here we will do it with Return type: We use int[] because we want it to return us an int array
    public static int [] sortDescend (int[]arr){
        // first sort
        Arrays.sort(arr);
        // then we create another array to contain elements in descending order
        int [] RevArr = new int [arr.length];
        // last index of arr == first index of RevArr

       /*//    i        j
        RevArr[0] = arr[3];
        RevArr[1] = arr[2];
        RevArr[2] = arr[1];
        RevArr[3] = arr[0];
        i is increasing starting from 0
        j is decreasing starting from last index
        We can apply a loop
      */
        int j = arr.length-1;
        for (int i = 0 ; i <arr.length ; i++){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;
    }
}
