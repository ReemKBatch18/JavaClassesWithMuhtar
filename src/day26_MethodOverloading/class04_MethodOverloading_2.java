package day26_MethodOverloading;

import java.util.Arrays;

    /*
    Create 3 methods:
    1st method: prints sum of 2 int numbers
    2nd method: prints sum of 3 int numbers
    3rd method: prints sum of 4 int numbers
     */
    public class class04_MethodOverloading_2 {
        public static void main(String[] args) {
            // we will call sum method, Now it depends on how many parameters we pass==> the correct method will be used
            sum (10,5);             // ==> 15 // when I pass 2 parameters it will execute 1st method with 2 parameters
            sum (10,5,20);      // ==> 35 // when I pass 3 parameters it will execute 2nd method with 3 parameters
            sum (10,5,20,5); //==> 40 // when I pass 4 parameters it will execute 3rd method with 4 parameters


            // The sort method of array applies to all types of arrays: int[] or char[] or double[] or String[], they will all be sorted
            int[] arr1 = {1,2,3};
            char[] arr2 = {'d','s','r'};
            double[] arr3 = {8,9,4,22,5};
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            Arrays.sort(arr3);
            // sort method is an overloaded method that can be used for different data types

        }
//=====================================================================================================================

        // BENEFITS OF OVERLOADING METHODS: 1. Readable
        //                                  2. Reusable
        //                                  3. Easy to remember
        //                                  4. Easy to run the correct one (system will choose which matches better to be used)
//=====================================================================================================================

        // 1st method with void
        public static void sum (int a, int b){
            System.out.println(a + b);
        }
        //==============================================
        // 2nd method with void
        public static void sum (int a, int b, int c){
            System.out.println( a + b +c);
        }
        //==============================================
        // 3rd method with void
        public static void sum (int a, int b, int c , int d){
            System.out.println( a + b + c + d);
        }

        //==============================================
        // 1st method with return int
        public static int sum1 (int a, int b){
            return a + b;
        }
        //==============================================
        // 2nd method with return int
        public static int sum1 (int a, int b, int c){
            return a + b +c;
        }
        //==============================================
        // 3rd method with return int
        public static int sum1 (int a, int b, int c , int d){
            return a + b + c + d;
        }





}
