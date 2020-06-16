package OfficeHours_wSaim.Practice_06_03_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class c03_ReturnLongestString_ArrayList {

    /*
    5) Create a method that will accept an ArrayList of Strings and
    return the String that has the biggest length
     */

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("car", "house","java","mike"));
        System.out.println(longest(list));
    }
    public static String longest(ArrayList<String> list){

        String biggest = "";
        for (String word: list){

            if (word.length() > biggest.length()){
                biggest = word;
            }

        }
        return biggest;
    }
        

}
