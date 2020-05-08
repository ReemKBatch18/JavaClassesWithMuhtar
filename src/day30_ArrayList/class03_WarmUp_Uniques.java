package day30_ArrayList;

import java.util.ArrayList;

/*
3. write a program that can print out the unique elements from an int array
		   HINT: store all the unqie elemenbts of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5} // we will not do this one. we will only do number 4
    4.	write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
 */
public class class03_WarmUp_Uniques {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // {1,2,1}
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        // how do I retreive the first element from the ArrayList? using the get method
        // list.get(0) ==> 1
        // how can I count the occurrences of each element? we need to compare with every single element and add int variable count

        // we need to create an ArrayList called uniques to store uniques
        ArrayList<Integer> uniques = new ArrayList<>();

        // This loop will repeat as many times as the size of ArrayList. It will repeat the below steps for each element in the ArrayList
        for (int i =0 ; i < list.size(); i ++) {
            int count = 0;
            // if using for each loop: my collection of data is list, and each element is an Integer
            // This loop will check how many times each element is repeated in the ArrayList
            for (Integer each : list) {
                // how can I create the condition to compare each with every element? by if statement:
                if (each == list.get(i)) {
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(list.get(i));
            }
        }
        // Let's print out uniques ArrayList to see if uniques were stored
        System.out.println(list);
        System.out.println(uniques);
/*
        // if we need to apply for each loop for the first loop:

        for (Integer each2 : list ) {
            int count = 0;
            for (Integer each : list) {
                if (each == each2) {
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(each2);
            }
        }
        System.out.println(list);
        System.out.println(uniques);
*/
    }
}
