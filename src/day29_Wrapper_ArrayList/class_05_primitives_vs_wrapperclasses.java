package day29_Wrapper_ArrayList;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.Arrays;

public class class_05_primitives_vs_wrapperclasses {

    public static void main(String[] args) {

        int [] arr = new int [3];
        System.out.println(Arrays.toString(arr)); //[0, 0, 0]
        // default values [0,0,0]
        double[] arr1 = new double [3];
        // default values 0.0
        System.out.println(Arrays.toString(arr1));//[0.0, 0.0, 0.0]

        boolean [] arr2 = new boolean[3];
        // default value is false
        System.out.println(Arrays.toString(arr2));//[false, false, false]

        //ALL OF WRAPPER CLASS DEFAULT VALUE ARE NULL
        Integer [] arr3 = new Integer [3];
        System.out.println(Arrays.toString(arr3)); //[null, null, null]

        // Default values of primitives:
                // byte, short, int, long : 0
            // boolean: false
            // double, flaot: 0.0
            // char (empty space)

        // Default values for all Wrapper classes are null
    }
}
