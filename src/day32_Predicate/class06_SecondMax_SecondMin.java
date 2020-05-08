package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
1. write program that returns the second max number from ArrayList
                    Ex: {1,2,3,4,5,6,7,8,8}
                    output: 7
        2. write program that returns the second min number from ArrayList
                    Ex: {1,1,2,3,4,5,6,7,8}
                    output: 2
 */
public class class06_SecondMax_SecondMin {
    /*
    max(CollectionType)     : return the max object from collectiontype
    min(CollectionType)     : return the min object from collectiontype
    swap(CollectionType, index1, index2)    : swaps elements at the given indexes without adding or removing
            list: {1,2,3,4,5,6}
            Collections.swap(list, 1, 2); ==> list: {1,3,2,4,5,6}
     replaceAll(CollectionType, oldValue, newValue)   : replaces old value by new values
            list: {1,1,1,2,3,4,5}  // replace all 1 by 10
            Collections.replaceAll(list, 1, 10); ==> list {10,10,10,2,3,4,5}
     */
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,8,8));
        System.out.println(list1);      //  [1, 2, 3, 4, 5, 6, 7, 8, 8, 8]
        Integer max = Collections.max(list1);
        System.out.println(max);        // 8

        list1.removeAll(Arrays.asList(max)); // will remove all numbers that match max which is here 8
        System.out.println(list1);      //  [1, 2, 3, 4, 5, 6, 7] list after removing first Max number
        Integer secondMax = Collections.max(list1);
        System.out.println(secondMax);      // 7 is the second minimum number in this list

        System.out.println("=========================================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));
        System.out.println(list2);      //  [1, 1, 2, 3, 4, 5, 6, 7, 8]
        Integer min = Collections.min(list2);
        System.out.println(min);        //  1

        list2.removeAll(Arrays.asList(min)); // will reomve all numbers that match min which is here 1
        System.out.println(list2);      //  [2, 3, 4, 5, 6, 7, 8]
        Integer secondMin = Collections.min(list2);
        System.out.println(secondMin);      // 2 is the second minimum number in this list

        System.out.println("=======================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list3);                  //  [1, 2, 3, 4, 5]
        // I want to switch elements at index 0 with element at index 4
        // I can call the swap method:
        Collections.swap(list3, 0,  4);
        System.out.println(list3);                  //  [5, 2, 3, 4, 1]

        System.out.println("=======================================================");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("reem","reem","nana", "lulu", "reem"));
        System.out.println(names);      //  [reem, reem, nana, lulu, reem]
        // replace all "reem" with "fun"
        /*
        //  first try it with the set method:
        names.set(0, "fun");
        names.set(1, "fun");
        names.set(4, "fun");

         */
        Collections.replaceAll(names, "reem", "fun");

        System.out.println(names);      // [fun, fun, nana, lulu, fun]



    }

}
