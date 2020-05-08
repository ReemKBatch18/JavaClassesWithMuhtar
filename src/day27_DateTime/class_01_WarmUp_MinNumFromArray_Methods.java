package day27_DateTime;

public class class_01_WarmUp_MinNumFromArray_Methods {

    // THIS IS OUR MAIN METHOD
    public static void main(String[] args) {
        // here we will find min number regularly without return method
        int [] arr = {13,2,23,14,55};       // 2
        double [] arr2 = {15.2,5.1,6,7,11,3.2};   // 3.2
        // first we assign min to the first index of the int array then we compare each element with min and reassign to smallest
        int min = arr[0];
        for (int each :arr){ // each : each element of the int array

            if (each<min){
                min = each;
            }
        }
       // here we print our min number from the top loop
        System.out.println(min);    // 2
        // here we will use the method we created below to find min number from int array:
        System.out.println(minNum(arr));       //2

        // here we will use the method we created below to find min number from double array:
        System.out.println(minNum(arr2));       // 3.2
    }
// THIS METHOD RETURNS MIN NUMBER FROM ANY INT ARRAY:
    public static int minNum(int[] arr){  // we must provide int[] arr as our parameter
        // first we assume that min is first index arr[0] then we compare with other numbers in the int array
        int min = arr[0];
        for (int each: arr){    // each : each element of the int array
            if (each < min){
                min = each;
            }
        }
        return min;     // RETURN VALUE IS MANDATORY
    }
    // THIS METHOD RETURNS MIN NUMBER FROM ANY DOUBLE ARRAY:
    public static double minNum(double [] arr){ // we must provide double[] arr as our parameter
        // first we assume that min is first index arr[0] then we compare it with other numbers in the double array
        double min = arr[0];
        for (double each: arr){ // each : each element of the double array
            if (each < min){
                min = each;
            }
        }
        return min;     // RETURN VALUE IS MANDATORY
    }
    }

