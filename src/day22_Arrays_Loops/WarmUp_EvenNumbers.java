package day22_Arrays_Loops;

import java.util.Arrays;

/*
1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array's indexes
        3. use for each loop to print out all the even numbers.
                MUst use continue statement
 */
public class WarmUp_EvenNumbers {
    public static void main(String[] args) {

        int[] numbers = new int[100]; // index 0~99
        // to print this array to see its numbers we use Arrays.toString method [0,0,0,0,0,0,0,0,0,0.....]
        System.out.println(Arrays.toString(numbers)); // this array now has default values of 0 for each index
            //    i :index number of each number in this array
    /*    numbers[0]= 1; when i = 0, I need to initialize 1 to it ==> i+1
        numbers[1]= 2;   when i = 1, I need to initialize 2 to it ==> i+1
        numbers[2]= 3;   when i = 2, I need to initialize 3 to it ==> i+1
        .... etc
        numbers[99]= 100; when i = 99, I need to initialize 100 to it ==> i+1
        since this is a repeated action.. we can use loop to apply it   */

    // we can use for each loop for our task, but first we need to declare values to the array's elements before we start...
        // so best loop is the regular for loop
        for(int i = 0 ; i <numbers.length ; i++){ // this loop can execute for 100 times..
            //  i : index number
            numbers [i]= i+1;
        }

        System.out.println(Arrays.toString(numbers));// now it will print out all numbers 1 ~ 100

        for( int evenNum : numbers){
            if (evenNum % 2 != 0){   // formula for odd numbers
                continue;           // continue; ==> skips all odd numbers
            }
            System.out.print(evenNum + " "); // prints even numbers with spaces (skipping all odd nums from array)
        }




    }
}
