package day20_ArraysContinue;

import java.util.Arrays;

public class ArraysUtilities {
// Arrays.toString(arrayName) method: converts any array into a string ==> returns us string ==> we can assign it to string
    // we use this method to PRINT  any array like this: System.out.println( Arrays.toString(nums))
    //OR we assign to a string then we print that string
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        String r = Arrays.toString(arr); // we only need this method for printing the Array
        System.out.println(r);
        //Arrays.toString(arrayName): //converts the array to String and return a string.. so we can assign it to string
        System.out.println(arr);// [I@1b6d3586 //Array must be converted to String before we print
        String fruits[]= {"apple","pear", "orange"};
        System.out.println(fruits);// will not print-->[Ljava.lang.String;@4554617c
        System.out.println(Arrays.toString(fruits));// --> [apple, pear, orange]

        double[] nums = {10, 20, 30, 40, 50};
        System.out.println(nums);// nums is an array. we can't print directly, this is result of printing directly: [D@74a14482
        System.out.println( Arrays.toString(nums)); //--> [10.0, 20.0, 30.0, 40.0, 50.0] .0 becuase it's double
        //or we can retrieve elements in this double array like this :
        // To print first element of array at index 0:
        System.out.println(nums[0]); // --> 10.0
        // since each element is a number so if we add +1 and print ==> result will be addition of our value at index 0 and the number 1
        // ==> value at index 0 = 10.0, 10 +1 = 11.0
        System.out.println(nums[0]+ 1); // -->11.0 when you apply + to two numbers it does addition





    }
}
