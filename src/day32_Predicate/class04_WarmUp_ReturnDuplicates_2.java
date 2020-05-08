package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*

 */
public class class04_WarmUp_ReturnDuplicates_2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "B", "C", "D", "D"));
        System.out.println(list);

        // we will create array list to store all duplicated objects in it:
        ArrayList<String> result = new ArrayList<>();
        // in Collections class ( we need to import) we have  a method called frequency
        // we have to pass in it collectiontype then object ==> it will return me how many times object occurred
        // to retrieve first eleement, we use list.get(0)
        // this method will return me an int number for frequency so I can assign it to int variable called count
        //int count  = Collections.frequency(list, list.get(0));
        // our condition is : if count>1 ==> element is duplicated ==> add element at index 0 to result list
        /*
        if (count >1){
            result.add(list.get(0));
        }

         */
        // in order to repeat these steps for all elements in list we need to use a for loop
        // we can use for each loop
        // we want to find out the frequency of every single element = each
        // if count >1, we have to check if element is already contained in result ==> if so, we need to skip instead of adding
        // To do that we can add another if statement


        // THIS IS THE SOLUTION USING FOR EACH LOOP:

       /*
        for (String each: list) {
            int count = Collections.frequency(list, each);
            if (count > 1) {
                if (result.contains(each)) {
                    continue;
                }
                result.add(each);
            }
        }

        System.out.println(result);

        */

       // THIS IS THE SOLUTION USING REGULAR FOR LOOP:

        for (int i = 0 ; i < list.size() ; i ++){
            int count = Collections.frequency(list, list.get(i));
                    if (count>1 && ! result.contains(list.get(i))){
                        result.add(list.get(i));
                    }
        }

        System.out.println(result);



    }
}
