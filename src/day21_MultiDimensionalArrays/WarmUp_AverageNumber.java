package day21_MultiDimensionalArrays;

import java.text.DecimalFormat;

/*
1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
 */
public class WarmUp_AverageNumber {
    public static void main(String[] args) {
        // we import DecimalFormat class from java.text.DecimalFormat to decide on what format is my double number (how many decimals)
        DecimalFormat DF = new DecimalFormat("0.00");

        double [] arr = {10,20,30,40,50};
        //average = sum of all numbers / length
        // first : find sum of all numbers in the array
        // secon: devide sum by number of elements in array = average

        int length = arr.length; // we create this variable to represent how many elements do we have in our array
        // double sum = arr[0]+arr[1]+arr[2]+....
        /* because we have a repeated action of adding first element at index 0 to second element at index 1
         to third element at index 2.... etc ==> we can use a loop to add all values of elements and add them to sum
         like this:
         */
        double sum = 0;

        for (int i = 0 ; i <= length-1 ; i++ ){// or we can use i < length. length = arr.length
            double eachNum = arr[i]; // we can ommit this step and put sum += arr[i]
            sum += eachNum;
        }

        System.out.println(sum);        //  150: This will print the sum of the numbers in our array

        double average = sum/length; // because average most likely will have decimals
        // average = (double)sum/length ..... if both are int
        //OR average = sum / (double) length;     // we need to (double)before one of the numbers because dividing int/int =int.0
        System.out.println(average);    // 30.0
        System.out.println(DF.format(average)); // 30.00 this method sets decimals to 2





    }
}
