package RESOURCES;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    public static int [] sortDescend (int[]arr){
        // first sort
        Arrays.sort(arr);
        // then we create another array to contain elements in descending order
        int [] RevArr = new int [arr.length];
        // last index of arr == first index of RevArr

       /*//    i        j
        RevArr[0] = arr[3];
        RevArr[1] = arr[2];
        RevArr[2] = arr[1];
        RevArr[3] = arr[0];
        i is increasing starting from 0
        j is decreasing starting from last index
        We can apply a loop
      */
        int j = arr.length-1;
        for (int i = 0 ; i <arr.length ; i++){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;
    }


    
    public static String Reverse2 (String str) {
        String Reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse += str.charAt(i);
        }

        return Reverse;

    }


    //More Methods to create and save here to be used later:

    //REMOVE DUPLICATES FROM STRING
    // to create a method that removes duplicate, we need to make the return typ STring:
    public static String RemoveDuplicates(String str){

        String result = ""; // we will store the String after removing duplicates
        // I need to check characters by creating loop
        // I will check first character in str if it is contained or not in result. If not I will add it into the result
        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if (!result.contains(""+ch)){ // we add "" to make char a string to be able to check if it is contained
                result += ch;
            }
        }
        return result;
    }

    // FREQUENCY OF STRING
    public static int Frequency (String str1, String str2){
        int count = 0;
        while (str1.contains(str2)){
            count++;
            str1= str1.replaceFirst(str2, "");
            // we need to make sure that we are not counting the same index over and over again
        }
        return count;
    }


    // THIS METHOD WILL RETURN US FREQUENCY OF CHARACTERS FROM ANY STRING
    public static String FrequencyOfChars(String str){
        String NonDup = Library.RemoveDuplicates(str);
        String result = "";     //  this will contain the frequency of chars
        for (int i = 0 ; i < NonDup.length(); i++){
            String ch = ""+NonDup.charAt(i);
            int num = Library.Frequency(str,ch);
            result += ch +num;
        }
        return result;
    }

    public static int frequency(String str, char ch) { //This method counts char's frequency
        // even though we have another method called frequency, but parameters are different, so it is okay
        char[] arr = str.toCharArray();

        int count = 0;
        for (char each : arr) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }

    // MERGE TWO ARRAYS INTO A THIRD ONE

    // MAX NUM FROM ARRAY

    // MIN NUM FROM ARRAY

    // CALCULATOR

    // Return max number from Array list
    public static int max(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <list.size(); i++){  // i : represents the index number
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }



}
