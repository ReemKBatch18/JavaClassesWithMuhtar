package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class class01_ArrayList_Methods {
    public static void main(String[] args) {

        // .contains() method: checks whether an object is contained in another object
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");

        boolean r1 = list1.contains("c");
        System.out.println(r1); // true

       // .equal() method: to compare two arrayLists
        // we will create list2 that's is exactly like list1
        ArrayList <String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");

        boolean r2 = list1.equals(list2); // true
        System.out.println(r2);

        /* In java we 3 date structures:
        1. Array: ==>Arrays() Array class is presented in package java.util
        2. Collection: Collections(). Collections class is presented in package java.util.
                        ArrayList is part of collections.
                        Sort method is called through the Collections class name
        3. Maps:
         */
        // We can use sort method to sort ArrayLists like this:
        Collections.sort(list1); // will sort ArrayList in ascending order
        Collections.sort(list2);
        // After sorting ArrayLists we can compare equality

        System.out.println("=========================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);
        // Descending order = 1000, 100, 20, 10
        // first we sort the ArrayList (in ascending order) by calling sort method from Collection class
        Collections.sort(list3);
        System.out.println(list3);  //  ascending order [10, 20, 100, 1000]


        // we need to use a loop to reverse the order of elements starting from last index:
        for (int i = list3.size()-1; i >= 0 ; i--){
            // now how can we retrieve the elements from the arraylist by using i as the index number?
            // we retrieve elements by using the get method:
            System.out.print(list3.get(i) +" ");    //  1000 100 20 10
        }
        System.out.println();       /// this is just to move printing to next line

        // in order to store elements in reversed order in another ArrayList we need to create a new list:
        ArrayList<Integer> reversedList3 = new ArrayList<>();
        for (int i = list3.size()-1; i >= 0 ; i--){
            reversedList3.add(list3.get(i));
            // after this loop is executed, all elements in list3 will be contained in reversedList3 in descending order
        }
        System.out.println(reversedList3);  //  [1000, 100, 20, 10]
        System.out.println(list3);          //  [10, 20, 100, 1000]

        // or we can assign new list to list3 like this:  list3 = reversedList3;

        // isEmpty() : returns boolean. returns true if size of ArrayList is 0
        boolean r4 = list3.isEmpty();   //  false

        // but if we give this comment:
        list3.clear(); // this sets the size of list3 to 0, everything is removed
        boolean r5 = list3.isEmpty();   //  true














    }
}



