package OfficeHours_wSaim.Practice_06_03_2020;

import java.util.Arrays;

public class c05_CountUpperLower_String {
    /*
    7) Create a method that will accept a String of multiple words separated by a space and return a 2D array.
    Each array in the multidimensional array will have two elements:
    the number of uppercase letters and the number of lowercase letters
     */

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(countAll("The hOusE IS biG how mAnY words")));
    }
    public static int [][] countAll(String str){
        // since it had two words separated by a space..>
        // we can create an array by splitting our string and create an array
        String [] words = str.split(" ");
        // here we will declare our multi dimensional array:
        // we know the size is how many words we have in our array
        // important not to use length of String but to use length of array
        int [][] count = new int[words.length][];
        int index = 0; //because we are using for each loop
        for (String word : words){
            int upper = 0;
            int lower = 0;
            // this loop will check for capital and small letters
            for (int i = 0 ; i < word.length() ; i++){
                if (Character.isUpperCase(word.charAt(i))){
                    upper++;
                }else{ // assuming we only have letters
                    lower++;
                }
            }
            // now we need to store our values in our multi dimensional int array
            int [] each = {upper, lower};
            count[index++] = each;

        }
        return  count;
    }
}
