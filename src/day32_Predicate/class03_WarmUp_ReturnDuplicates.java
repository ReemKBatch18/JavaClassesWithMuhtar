package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

/*
write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
 */
public class class03_WarmUp_ReturnDuplicates {
    public static void main(String[] args) {
        // can we apply the same approach we used for finding uniques? Yes we can
        // if frequency is >1 then it is duplicated
        //
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));
        System.out.println(list);   //[A, B, A, C, D]
        // what approach should we take to decide which element is duplicated? to find out the frequency of each element
        // how do I retrieve the element from each list? by giving the index number
        // we can use the get method like: list.get(0) ==> A,
        // to find the frequency of A we need to check it with each element one by one
        // let's create a variable called count

        // to compare with every single index, we need to use a for loop:

        /*
        for (String each : list) { // this loop will iterate as many times as many elements there are in the list
            if (each.equals(list.get(0))) { // if this element has occurred, I will increase count by 1
                count++; // if count becomes more than one, element is duplicated==>
                // we need to create a new arraylist called duplicates to carry all duplicated elements in the list
                // we have to add element at index 0 to the list duplicates if its count is > 1
                // we create if statement:
                // if (count>1){        // if frequency is greater than 1 , add character to the list
                //            duplicates.add(list.get(0));
                //        }
                // in order to repeat all these steps for each element at each index of the list ==> we need a loop
                // our loop will iterate as many times as size of list to repeat steps for each element: check frequency+add to duplicates list
            }
        }

         */


        ArrayList<String> duplicates = new ArrayList<>();
        for (int i = 0 ; i <list.size() ; i ++) {
            int count = 0;
            for (String each : list) {
                if (each.equals(list.get(i))) {
                    count++;
                }
            }
            // we need to make sure frequency is > 1 AND if character is not yet contained in duplicates ==> add object to duplicates
            if (count > 1 && ! duplicates.contains(list.get(i))) {
                // we give this condition: && ! list.contains(list.get(i)) to make sure we do not add the character twice to the list
                duplicates.add(list.get(0));
            }
        }
        System.out.println(duplicates);





    }

}
