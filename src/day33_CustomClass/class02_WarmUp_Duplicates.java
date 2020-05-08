package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class class02_WarmUp_Duplicates {
    /*
    2. write a program that can return the duplicated objects from a an ArrayList of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {1,1,5,5};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. DO NOT use any sort method
			  4. Use predicate and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency > 1)  can keep the duplicated objects in arrayList
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,4,5,5));
        // we need to remove only the unique ones ==> remove any element with frequency = 1
        // keep all duplicate elements ==> keep any element with frequency > 1

        // we call removeIf() method
        // create our predicate : with condition : if frequncy = 1 then remove
        // in predicate ==> provide boolean expression

        list.removeIf( p -> Collections.frequency(list, p) == 1 );
        System.out.println(list);       //      [1, 1, 5, 5]

        // to have one element only of each duplicate, we can apply what we did in day32 duplicate task.



    }

    }
