package day32_Predicate;
/*
Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists
 */
import java.util.ArrayList;
import java.util.Arrays;

public class class01_WarmUp_MoveZeros {
    public static void main(String[] args) {


        // first thing I need to know how many 0 I have in the arraylist
        // How can I find out the frequency of 0 in the list? we need to check each index of the list:
        // I want to add these elements into the list ==> I can use addAll method ==> use Arrays.asList() method

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);   // [1, 0, 2, 0, 3, 0, 4, 0]
        // is there anyway to do it with this list without creating a new one?
        // to find frequency of 0 : use loop to compare each element if it is 0
        // I need a variable to count the occurrences of 0:
        int count = 0;
        for (Integer each : list){ // each : every single element in the loop
            if (each == 0){
                count++;
            }
        }
        // now if we print count ==> will give us how many 0s are there in our list even if we add more 0s
        // next step is: I will remove all 0s from the list
        // after removing I will add the number of 0s (depending on count) to the end of the list
        // which method to use to remove all 0s??
        // should we use removeAll? or retainAll? we should use removeAll method to remove 0s
        // how can we retain 0 to represent a collectionType? by using Arrays.asList(0)
        list.removeAll(Arrays.asList(0));  // remove all 0s from list
        System.out.println(list);   //  [1, 2, 3, 4]
        // whatever the frequency of 0 is, we need to add that number of 0s to the list.
        // we need to assume that we have no idea what the elements in the list are
        // our list is missing the number of 0s to be added to it at the end.
        // instead of adding the number of 0s one by one, we can use a loop that will execute as many times as the frequency of 0
        for (int i = 0 ; i <count ; i ++){
            list.add(0);
        }
        // this way all 0s will be added at the last index
        System.out.println(list);       //  [1, 2, 3, 4, 0, 0, 0, 0, 0]
        // 1. we find out how many 0 we have in list
        // 2. remove all of them
        // 3. create a loop to add 0 to execute as many time as number of 0

        /* what if we want all 0s to be place at the begining? we can do this requirement in the loop
        list.add(0, 0); this way each 0 will be placed at index 0

         */

    }
}
