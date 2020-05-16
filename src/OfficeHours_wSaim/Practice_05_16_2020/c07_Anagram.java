package OfficeHours_wSaim.Practice_05_16_2020;

import java.util.Arrays;

public class c07_Anagram {

    // words like : "listen" and "silent"  are anagram == they share same characters

    // arrays are used to store multiple data
    // what if we have 10 numbers  ==> better to use array
    // if I had 5 variables to keep track of ==> I will need 5 variables
    // But I can make an array (same data type) that has 5 elements
    // Alphabet has 26 characters... what if I wanted to check all 26 characters?
    // can I make an array that has 26 places? yes I can
    // int [] count = new int [26] ==> means I have an int array that all its 26 values are 0 by default
    // if we're counting a we know that a is in first position. we will use ascci table to place it at index 0 correctly
    // if we're counting z we know that z is in last position. We will use ascci table to place it at index 25 correctly
    // To check whether two words are anagram:
    // when we check each character in the first word with the array of alphabet we will increment counter of letter by 1
    // when we check each character in the second word with the array of alphabet we will decrement counter of letter by 1
    // then at the end, our

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
    }



    public static boolean isAnagram(String one , String two){
        if (one.length() != two.length()){
            return false;
        }

        int [] count = new int[26]; // default values for all elements are : 0
        // in this int array, I will add 1 for every character's occurrence from word one
        // in this int array, I will subtract  1 for every character's occurrence from word two

        // i want a to be stored at index 0 so count[0] = a
        // a at ascci table is 97 so 97 - 97 = 0 so : count[c-97]

        for (int i=0 ; i<one.length(); i++){
            char c = one.charAt(i);  // c from word one
            char d = two.charAt(i);

            // count [0] = count[0] +1;
            // a ==> 97 , b ==> 98

            count [c-97] = count [c-97] +1;
            count [d-97] = count[d-97] -1;

      //      System.out.println(Arrays.toString(count)); // this will show us
        }
        return Arrays.equals(count, new int[26]); // we are comparing our count[] to an array with 26 zeros
    }






}
