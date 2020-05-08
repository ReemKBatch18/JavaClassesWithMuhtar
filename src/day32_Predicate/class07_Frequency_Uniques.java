package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class class07_Frequency_Uniques {
    public static void main(String[] args) {

        Character [] chars = {'a','a','b', 'c', 'd','d'};
        // how can I add all elements from this chars array into this ArrayList?
        // I can give Arrays.asList(chars)
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));
        System.out.println(charList);       //[a, a, b, c, d, d]
        // if I want to add uniques to another data structure which one should I use?
        // I can use another ArrayList:
        ArrayList<Character> result = new ArrayList<>(); // to store unique characters
        // in order to find uniques from the Arraylist, what approach to take?
        // 1. to find frequency of every single element in the list ==> use frequency method
        // 2. if I want to return the frequency of the first element, what do I give in the frequency method?
        // I will need to use the get() method ==>
        //int count =  Collections.frequency(charList, charList.get(0));
        // this will count how many times the element at index 0 has occurred in the list
        // if count == 1 ==> element is unique ==> we apply if statement like this:
        /*
         if (count == 1){
           result.add(charList.get(0))
       } */
       //this if statement will add the character at index 0 to the result list if it was unique
       // we need to repeat this step for each character
       // we need ot use a loop that will iterate as many times as the size of the original list
       // we have to pass i instead of 0 for the index number like this then:

        for (int i = 0 ; i <charList.size(); i++) {     // i : index number of each element in the list

            int count = Collections.frequency(charList, charList.get(i));
            if (count == 1) {
                result.add(charList.get(i));
            }
        }
        System.out.println(result);     //  [b, c]

        // we can do it with for each loop too
        /*
        for (Character each : charList) {     // each :  each element in the list

            int count = Collections.frequency(charList, each);
            if (count == 1) {
                result.add(each);
            }
        }
         */





    }
}
