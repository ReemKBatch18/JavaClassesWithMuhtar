package day29_Wrapper_ArrayList;

import org.omg.PortableInterceptor.INACTIVE;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class class_09_ArrayList_Practice_Max {
    public static void main(String[] args) {

        /*
        1. create list of Integers
        2. add 5 Integers to it
        3. Return the maximum number from the list
        Do not use sort method
         */

        // let's create ArrayList of Integers:
        ArrayList<Integer> list = new ArrayList<>();
        // Now we add elements to it:
        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);
        System.out.println(list.size()); //5

        //write a function that will always return me the max element in an ArrayList
        // Can we apply the same approach we did with arrays to find max?? yes we can
        int max = Integer.MIN_VALUE; // This number is the smallest for int variable -2147483648
         // We can assume that any number in this arraylist will be greater than Integer.MIN_VALUE
        // or assume max is the first element in the list : int max = list.get(0);
        // I use the loop to compare each element and see which is the greatest to be assigned to max
        for(int i = 0; i <list.size(); i++){  // i : represents the index number
            if (list.get(i) > max){
               max = list.get(i);
            }
        }
        System.out.println(max);

        System.out.println("=========================================================");

        int max2 = Integer.MIN_VALUE;
        for( Integer each: list) {
            if (each > max2) {
                max2 = each;
            }
        }
        System.out.println(max2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(-10);
        list2.add(222);
        // Now I can pass the method we created below to return max number
        // it will return us an int ==> we can assign it to an int variable
        int max3 = max(list2);
        System.out.println(max3); // 222

    }



        // I WANT TO CREATE A CUSTOME METHOD THAT WILL RETURN US MAX VALUE FROM ANY ARRAYLIST

    // what parameter do we need to pass? The ArrayList of Integers
    // we can return int because we can assign Integer to int
        public static int max(ArrayList<Integer> list){
            int max = Integer.MIN_VALUE;
            for(int i = 0; i <list.size(); i++){  // i : represents the index number
                if (list.get(i) > max){
                    max = list.get(i);
                }
            }
            return max;
        } // Let's test it above




}
