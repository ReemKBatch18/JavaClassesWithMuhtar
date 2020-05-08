package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Sorting_DescendingOrder {

    public static void main(String[] args) {

        int[] arr1 = {9,5,6,8,4,2,7,3};
        Arrays.sort(arr1);
        // we call the Arrays.sort() method to sort the array
        // now we print the array by calling the toString method
        System.out.println(Arrays.toString(arr1)); // [2,3,4,5,6,7,8,9]

        // After array is sorted in ascending order ==> first element at index 0 is the minimum number

        // how to return first minimum number?
        System.out.println("First min number is: "+ arr1[0]); // 2
        System.out.println("Second min number is: "+ arr1[1]); // 3

        System.out.println("First max number is: "+arr1[ arr1.length - 1 ] ); //9
        System.out.println("Second max number is: "+ arr1 [arr1.length -2 ]); // 8

        char[] ch = {'z', 'd', 't','r', 'u','e'}; // [z, d, t, r, u, e]
        System.out.println(Arrays.toString(ch));
        // if we sort it, it will be in ascii table order
        Arrays.sort(ch);        // sorts characters in alphabetical order
        System.out.println(Arrays.toString(ch)); //[d, e, r, t, u, z]

        String[] names = {"Reem", "Anas", "Ashraf", "Razan" ,"Amjad"};
        System.out.println(Arrays.toString(names));//[Reem, Anas, Ashraf, Razan, Amjad]
        Arrays.sort(names);     // sorts strings in alphabetical order
        System.out.println(Arrays.toString(names));//[Amjad, Anas, Ashraf, Razan, Reem]
        //but if we have 2 upper case letter like ANas will come before Amjad because of ascii table

        // write a program that will write alphabet in descending order z to a..

        // This is a program to write an array in descending order:
        int[] arr = {3,8,44,69,2,51,-70,1};
        Arrays.sort(arr);   //   first step: we sort our array in ascending order using Arrays.sort() method
        // next step: we create an array arrDesc, that has the same length like our original array, to store elements in descending order.
        int[] arrDesc = new int[arr.length];// now this array has capacity to contain all elements from the first array arr

        System.out.println(Arrays.toString(arr)); //[-70, 1, 2, 3, 8, 44, 51, 69] array in ascending order

        // to print in opposite order, we need to assign the element at last index of arr to the first index of arrDesc,
        // then assign the element before last index of arr to the second index of arrDesc... and so forth
        // To do that for all indexes of arr, we need a loop,
        // Our loop must start from last index and end at index 0

        int j = 0; // we need this variable to refer to arrDesc indexes

        for (int i = arr.length -1; i >=0 ; i--){
            //System.out.print( arr[i]+ " ");
            arrDesc[j] = arr[i]; // i will keep decreasing and j will keep increasing from 0 going up
            // we pass j here (arrDesc[j] ) so that we don't have to change 0 then 1 then 2 ...

            j++; // we add this to make sure j is increasing from 0 up
            //i stops when it reaches 0 due to i-- (decrement of i)
            // j stops when it reaches last index due to j++ (increment of j)
        }

        System.out.println(Arrays.toString(arrDesc)); // [69, 51, 44, 8, 3, 2, 1, -70] array in descending order


    }
}
