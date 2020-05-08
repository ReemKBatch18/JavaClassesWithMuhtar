package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class class01_WarmUp_Uniques {
    /*
    1. write a program that can return the unique objects from a anArray List of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {2,3,4};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. do not use any sort method
			  4. use predicate only and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency == 1)  can keep the unique objects in arrayList
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,4,5,5));      //  [2,3,4] are unique
        // which method to use if we add the predicate? the removeIf() method
        // this predicate will represent each element in this list
        // p in lumbda expression represents each element
        // under what condition do I need to remove this p? if frequency is greater than 1
        // in the predicate, we have to provide a boolean expression ( in our case: frequency > 1)
        list.removeIf( p-> Collections.frequency(list,p) >1);
        // the expression above will remove each object (represented here by p) if its frequency is greater than 1
        System.out.println(list);       //  [2,3,4]








    }

}
