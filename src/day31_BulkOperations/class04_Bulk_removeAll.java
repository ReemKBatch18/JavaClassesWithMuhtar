package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class class04_Bulk_removeAll {
    public static void main(String[] args) {



        /*
        1. write a program that can remove duplicates from an arrayList
         */
      //  removeAll(CollectionType): removes multiple objects, removes all the matching objects

        ArrayList<Integer> list = new ArrayList<>();
        // to add we can use addAll() method but we need to pass the data through Arrays.asList()
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,3));
        // remove 1,3,5,8
        Integer a = 1; // is a an object?? Yes it is
        list.remove(a); // this will remove the first a = 1 in the list
        // if we have to remove the second 1 in the list we need to repeat the step again
        list.remove(a);
        System.out.println(list);
        // to remove 3 :
        Integer b = 3;
        list.remove(b); // this will remove the first matching object.
        // to remove the second 3, we have to repeat this step:
        list.remove(b);
        // But since we have the bulk operation: removeAll(), we can use it to remove multiple objects ==>
        // ==> using the Arrays.asList() to convert the objects to a collectionType
        // list.removeAll(Arrays.asList(1,3)) will remove all 3s and all 1s in the list

        System.out.println("==========================================================");
        String [] names = {"reem", "ana", "ash","reem", "hala"};

        // to create an ArrayList using the elements from the array above:
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);

        // tp remove "reem" from the list:
        nameList.removeAll(Arrays.asList("reem"));
        System.out.println(nameList);
        // removeAll() method is not to be used in the loop yet.




    }
}
