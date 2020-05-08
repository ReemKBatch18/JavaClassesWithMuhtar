package day29_Wrapper_ArrayList;

import java.util.Arrays;

/*
Given:
	String[] arr = {"1","2.5", "3", "3.5", "4.5"}
	find thhe maximum and minimum numbers
		NOTE: Do not use sort method
 */
public class class_06_WrapperClass_Practice_Max_Min {
    public static void main(String[] args) {

        double [] arr = {1,2,3,2.5,3.7,4.6};
        double max = Double.MIN_VALUE;

        // let's apply the for each loop
        // this loop will get executed 5 times
        // during each execution the value of each will be one of the elements 1, 2, 3, 2.5, 3.7, 4.6
        for (double each: arr){
            if (each > max){
                max = each;
            }
        }
        System.out.println(max);

        String [] arr2 = {"1","2","3","2.5","3.7","4.6"};
        double max2 = Double.MIN_VALUE;

        // let's apply the for each loop
        // this loop will get executed 5 times
        // during each execution the value of each will be one of the elements 1, 2, 3, 2.5, 3.7, 4.6
        for (String each: arr2){
            double num = Double.parseDouble(each);
            if (num > max2){
                max2 = num;
            }
        }
        System.out.println(max2);

        System.out.println("==========================================");

        String [] arr3 = {"100", "1", "2.5", "3" , "3.5" , "4.5"};

        // I need to store this array in a new double array
        // I need to make sure my new array can contain the values above ==> we initialize same size

        double [] numbers = new double [arr3.length]; // [0.0, 0.0, 0.0, 0.0, 0.0, 0.0] default values
        // I want to assign index 0 from new array to index 0 from String array numbers[0] = arr3[0]

        for (int i = 0 ; i < arr3.length; i ++){
            numbers[i] = Double.parseDouble(arr3[i]);
        }

        System.out.println(Arrays.toString(numbers)); //[100.0, 1.0, 2.5, 3.0, 3.5, 4.5]

        // how can we find the max? by using sort method
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [1.0, 2.5, 3.0, 3.5, 4.5, 100]
        System.out.println(numbers[numbers.length-1]); //100  max

    }
}
