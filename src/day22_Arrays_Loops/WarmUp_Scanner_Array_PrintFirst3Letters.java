package day22_Arrays_Loops;
/*
  1. Write a program that will take five Strings and save them into an array called arr.
  2. use for each loop to print out the first three letter of each element of arr,
        one per line. You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
        We will need Arrays, Scanner, for loop, for each loop, substring
 */
import java.util.Arrays;
import java.util.Scanner;

public class WarmUp_Scanner_Array_PrintFirst3Letters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [] arr = new String[5];

        for (int i = 0 ; i < arr.length ; i ++){
           arr[i] = s.next();   // we place this here becuase we need to repeat it 5 times to enter 5 words
        }
        System.out.println(Arrays.toString(arr)); // this will print words we entered in this array

        // to print the first three letters of each word, we can use for each loop,
        // we need to declare a variable for each element in this array which is a string
        for (String eachWord : arr){
   //       System.out.println(eachWord); // this will print us each word in the array on each line
            System.out.println(eachWord.substring(0, 3)); // this prints the first 3 letters of each word (indexes 0,1,2)
        }










    }
}
