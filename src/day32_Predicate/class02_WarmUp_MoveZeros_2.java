package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists
 */
public class class02_WarmUp_MoveZeros_2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);

        // This array list is part of collection
        // what the utility class for collection in Java? the Collections class
        // if we import this class, we can call method called frequency
        // Collections.frequency(CollectionType, Object); returns the frequency of the given
        // object from the collection
        // is arraylist part of collectiontype? yes it is. we can pass it for CollectionType
        // if it returns me an int, can I assign it to int? yes I can
        int count = Collections.frequency(list, 0);
        System.out.println(count);
        // now we have the count of 0s
        // we use the removeAll() method to remove 0s from list
        list.removeAll(Arrays.asList(0));  // remove all 0s from list
        System.out.println(list);         //  [1, 2, 3, 4]
        // Now I can add the 0s I removed to the list
        // using a loop, I can add. Number of execution depends on count
        for (int i = 0 ; i <count ; i ++){
            list.add(0);
        }
        System.out.println(list);   //  [1, 2, 3, 4, 0, 0, 0, 0]


    }
}
