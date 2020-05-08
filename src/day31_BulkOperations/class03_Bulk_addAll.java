package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class class03_Bulk_addAll {
    public static void main(String[] args) {

        // addAll() : will let you add multiple elements into the arrayList
        // addAll() : adds multiple objects from collectionType
        ArrayList<Integer> list1 = new ArrayList<>();
        // add 30, 20, 40, 50, 45, 35, 200
        // instead of adding one by one best is to use bulk operation addAll()
        // we need  to call the method Arrays.asList()  because our method accepts collectionType

        list1.addAll(Arrays.asList(30, 20, 40, 50, 45, 35, 200));
        System.out.println(list1);
        // or we can create an Integer[] array arr1 {30, 20, 40, 50, 45, 35, 200}, and use arr1 w/ asList()

        System.out.println("============================================================");
        String[] names = {"reem", "ana", "ash", "hala"};
        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
        System.out.println(nameList);   //  [reem, ana, ash, hala]
        // since size is dynamic we can always add or remove from ArrayList
        nameList.add("maya");
        System.out.println(nameList);   //  [reem, ana, ash, hala, maya]
        nameList.remove("reem");
        System.out.println(nameList);   //  [ana, ash, hala, maya]
        // it is case sensitive of course.

        System.out.println("=========================================================");

        // there is an easier way that we can use:
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10};
        // I want to take everything from this array and put it in another arrayList
       // we can pass the CollectionType in here : new ArrayList<>(CollectionType)
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(nums));
        System.out.println(numList);        //  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        // To use this way, we MUST have the array as an object array, we can NOT use this way with primitives arrays














    }

}
