package OfficeHours_wSaim.Practice_06_03_2020;
/*


4) Overload the method to accept an ArrayList of integers and reverse the order of the elements.
Return the reversed ArrayList
 */


import java.util.Arrays;

public class c02_Reversed_Array_ArrayList {

    /*
    3) Create a method that will accept an int array and reverse the order of elements.
        Return the reversed array.
     */
    public static int[] reverse(int [] arr){
        // if we just want to reverse, we will go from end to beginning
        // but what if we take one element at a time and swap it with the one to swap with
        // so we want to swap the last one with the first one.
        for (int i = 0 ; i < arr.length/2 ; i++){
            int temp = arr [i];
            arr [i] = arr [arr.length-1 - i];
            arr [arr.length-1 -i] = temp;
        }

        return arr;
    }


    public static void main(String[] args) {
        int a[] = {1,5,7,4,3};
        System.out.println(Arrays.toString(reverse(a)));
    }
}
