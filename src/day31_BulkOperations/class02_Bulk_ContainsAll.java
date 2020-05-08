package day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class class02_Bulk_ContainsAll {
    public static void main(String[] args) {
          /*
        Bulk Operations:
            containAll(CollectionType):
            addAll(CollectionType):
            removeAll(CollectionType):
            retainAll(CollectionType):
         */

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
      //I want to identify if 10,20,60 are all contained in ArrayList ==> true otherwise false
        // instead of creating a boolean expression for each object to check whether it is contained or not==>
        // ==> we can use containAll() method: it accepts collections type which is like an ArrayList
        // from Arrays utility we call a method called asList() method instead of creating another ArrayList:
        // Arrays.asList(object, object, object,...); it can convert object array to the list
        list1.containsAll(Arrays.asList(10,20,60));
        // since we don't have all the objects in the ArrayList we have, the result will be false
        boolean r2 = list1.containsAll(Arrays.asList(10,20,60));
        System.out.println(r2);     // false

        // let's say we want to identify if 10, 20, 40 are contained in the ArrayList.
        // since all objects must be Integers, we can create an Array of Integers (it has to be an array of objects like Integers not of primitives):
            Integer[] data = {10,20,40};
        list1.containsAll((Arrays.asList(data)));
        boolean r3 = list1.containsAll(Arrays.asList(data));

        // containAll(): method  will identify if all objects in CollectionsType is contained then returns us boolean.
        //Arrays.asList() it returns the data as data collectionType, because containAll() only accepts CollectionType



    }
}
