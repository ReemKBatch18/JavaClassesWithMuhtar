package OfficeHours_wSaim.Practice_06_03_2020;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class c01_SumOf_Array_ArrayList {

    /*
    1) Create a method that will accept an int array
     and return the sum of all the numbers in the given array
    2) Overload the method to accept an ArrayList of integers
    and return the sum of all the numbers in the given ArrayList
     */


        public static void main(String[] args) {

            int [] a = {1,3,2,4};
            System.out.println(sumElements(a));
            ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,3,12));
            System.out.println(sumElements(list));
        }

        // 1

        public static int sumElements(int [] arr) {

            int sum = 0;

            for(int i=0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum;
        }

        // 2

        public static int sumElements(ArrayList<Integer> list) {

            int sum = 0;

            for(int i=0; i < list.size(); i++) {
                sum += list.get(i);
            }
            return sum;
        }



    }
