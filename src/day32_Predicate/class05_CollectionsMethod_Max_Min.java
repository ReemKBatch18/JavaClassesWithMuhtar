package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class class05_CollectionsMethod_Max_Min {
    public static void main(String[] args) {

        /*
         COLLECTIONS CLASS METHODS:

        sort(CollectionType)    : sorting any give collectionType
        frequency( CollectionType, object): returns the frequency of the given object from give collectionType
        max(CollectionType)     : return the max object from collectiontype
        min(CollectionType)     : return the min object from collectiontype
        swap(CollectionType, index1, index2)    : swaps elements at the given indexes without adding or removing
            list: {1,2,3,4,5,6}
            Collections.swap(list, 1, 2); ==> list: {1,3,2,4,5,6}
        replaceAll(CollectionType, oldValue, newValue)   : replaces old value by new values
            list: {1,1,1,2,3,4,5}  // replace all 1 by 10
            Collections.replaceAll(list, 1, 10); ==> list {10,10,10,2,3,4,5}
         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        // in Collections class we have a method called max: Collections.max(list);
        // since it returns us an Integer, we can assign it to int

        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        /*
        1. write program that returns the second max number from ArrayList
                    Ex: {1,2,3,4,5,6,7,8,8}
                    output: 7
        2. write program that returns the second min number from ArrayList
                    Ex: {1,1,2,3,4,5,6,7,8}
                    output: 2
         */





    }
}
