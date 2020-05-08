package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class class06_RemoveDuplicates {

    public static void main(String[] args) {

          /*
        1. write a program that can remove duplicates from an arrayList
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3));
        // expected result : [1,2,3]
        // if we look back at day16 RemoveDuplicates ==> we need to create a list to contain result:
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list){
            if (! result.contains(each)){
         // when the loop executes for the 1st time: each = 1==> the condition is true ==> 1 will be added
                result.add(each);
       // after the 2nd execution of the loop the condition is false because we already have 1 in the result list
        // 3rd time execution, each = 2 ==> the condition is true ==> first 2 will be added to result
                // 4th execution, each = 2 ==> condition is false ==> second 2 will not be added to result
                // 5th execution, each = 3 ==> condition is true ==> first 3 will be added to result
                // 6th execution, each = 3 ==> condition is false ==> second 3 will not be added to result
             }
        }

        System.out.println("==================================================");
        /*
        write a program that can remove duplicates from an ARRAY of integer:
         */
        Integer[] arr1 = {1,1,2,2,3,3}; // this is an array not an ArrayList
        ArrayList<Integer> nonDuplicates = new ArrayList<>();
        // I can apply for loop:

        for (int i = 0  ; i < arr1.length; i ++){
            // in order to retrieve element in array, we use arr1[i]
            // to retrieve element from ArrayList we use get() method
            if (! nonDuplicates.contains(arr1[i])){
                nonDuplicates.add(arr1[i]);
            }
        }
        System.out.println(nonDuplicates);

        // IMPORTANT: we can NOT use +=, or [] , or + in the ArrayList









    }
}
