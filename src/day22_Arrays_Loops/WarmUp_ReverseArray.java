package day22_Arrays_Loops;

import java.util.Arrays;


//   1. write a program that can reverse the array

public class WarmUp_ReverseArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
                    //0 1 2 3 4
        // last index needs to print out first and so forth
      /* this is what we have to do five times..
        System.out.println(arr[4]); // starting with last index first
        System.out.println(arr[3]);
        System.out.println(arr[2]);
        System.out.println(arr[1]);
        System.out.println(arr[0]); // printing first index last
        that's why we can use loop that repeats 5 times
       */

        // we have to start index number from last index
        // we can't use "for each" use because the index we're starting the loop with is not index 0
        // in all "for each" loops: index we start executing loop with must be 0
        //
        for (int i = arr.length-1 ; i >= 0 ; i --){ // this is a loop that starts executing from the last index
            // this loop will execute as many times as the length of this array ==> 5
            // in order to get each element from this array to print separately==> we can assign int eachNum to each element then print:
            int eachNum = arr[i];
            System.out.println(eachNum); // prints each element in this array separately starting with last one first
        }

        System.out.println("=============================================================");

        // now we need to store the above values (that are now in reversed order) in a new array

        int[] revArr = new int[arr.length]; // now I have default values 0s in this array [0,0,0,0,0]
        // first index [0] of this revArr will be last index [4] of the original array

      /*
        revArr [0] = arr[4];
        revArr[1] = arr[3];
        revArr[2] = arr[2];
        revArr[3] = arr[1];
        revArr[4] = arr[0];
        So:
        revArr[i] = arr[length-1 - i]

        System.out.println(Arrays.toString(revArr)); // will print [5,4,3,2,1]
        Since we need to repeat so we can apply loop
       */

      // we can declare another variable j to represent the indexes at the original array like this:
     //   int j = arr.length-1; and decrement j -- .... OR: since j = arr.length-1 - i ===>
      for (int i = 0 ; i <revArr.length ; i ++){ // i : index number of reversed array: revArr
          revArr[i] = arr[arr.length-1-i];      // we can use revArr.length or arr.length because they are the same
      }
        System.out.println(Arrays.toString(revArr));

// whatever the size of the array, it will still be executed correct using the above loops.




    }
}
