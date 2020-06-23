package day52_Collection;


import org.omg.PortableInterceptor.INACTIVE;
import sun.reflect.generics.tree.Tree;

import java.util.*;

/*
To sort any array => we used Arrays.sort(arrayname) method
To sort any collection ==> we can use Collections.sort(collectionname) method

Collection is an interface
Collections is a utility class of the collection framework
 */
public class c06_Collections_Utilities {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        // used bulk operation addAll
        list1.addAll(Arrays.asList(10,2,3,4,9));
        System.out.println(list1); // is this sorted? NO it is not

        // to sort I can import Collections class from java.util to use its sort() method
        // sort() method is a static method==> can be called from class name
        Collections.sort(list1);
        System.out.println(list1);

        // if we can not use this method==> another option is to use TreeSet

        // write a program that can remove duplicates and print out in sorted order
        // we can use TreeSet

        // here are example from tasks_solutions channel

        Integer [] arr = {1, 2,5, 3, 1, 1, 4, 3};
        LinkedHashSet<Integer> list2 = new LinkedHashSet<>(Arrays.asList(arr));
        HashSet<Integer> list3 = new HashSet<>(Arrays.asList(arr));
        System.out.println(list2);
        System.out.println(list3);


        TreeSet<Integer> list4 = new TreeSet<>();
        list2.addAll(Arrays.asList(10,10,10,9,5,8,6,6,8,7,7,3,1,2,1,3,4,5));
        System.out.println(list4);

        /* this one is wrong
        Integer [] arr2 ={34,456,657,78,6,546,435,456,456};
        Set<Integer> set = new TreeSet<>(Arrays.asList(arr));
        System.out.println(set);
         */
        TreeSet<Integer>list=new TreeSet<>(Arrays.asList(5,8,4,1,3,8,2,6,7,7,7));
        System.out.println(list);

        // ex by Muhtar
        ArrayList<Integer> nums =  new ArrayList<>();
        nums.addAll(Arrays.asList(5,6,1,4,8,2,5,1,6,2,4,8));
        // I need to remove duplicates then sort in ascending order
        // treeset is the best option
        // what should be the reference type we are declaring? it should be Integer

        // in the collection, any class has a constructor that accepts a collection type
        //as soon as we say remove duplicates, which data structure can we apply here? the set
        // as we want to sort it, which class should we use? the TreeSet class
        TreeSet<Integer> sorted = new TreeSet<>(nums);

        System.out.println(sorted); // [1, 2, 4, 5, 6, 8]
        System.out.println(nums);   // [5, 6, 1, 4, 8, 2, 5, 1, 6, 2, 4, 8]
        // I need to reinitialize nums to reference to sorted values
        // so to do that: we need to store this treeset into the arraylist
        // as we said in each collection class there is a constructor that accepts a collection type
        // we need to use the constructor to add the treeset into the arraylist

        nums = new ArrayList<>(sorted); // [1, 2, 4, 5, 6, 8]
        // now we reinitialized nums to have the values that were in sorted
        System.out.println(nums);       // [1, 2, 4, 5, 6, 8]

        // there is also easy way which is no need to initialize new TreeSet<>(nums) to a variable
        // I can do this:
        // in order to add it I will pass it into the parameter of the arrayList
        nums = new ArrayList<>(new TreeSet<>(nums));
        System.out.println(nums);       // [1, 2, 4, 5, 6, 8]

        // 2. write a program that can remove the duplicates from an arraylist but do NOT change the order
        // [6,6,6,6,5,5,5,5,4,4,4]
        // which program removes dupl and keeps same order? ==> LinkedHashSet
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(6,6,6,6,5,5,5,5,4,4,4));
        // first I need to reinitialize the list = reinitiate it
        list5 = new ArrayList<>(  new LinkedHashSet<>(list5) );
        System.out.println(list5);      // [6,5,4]

        System.out.println("*********************");
        ArrayList<String> letters = new ArrayList<>();
        letters.addAll( Arrays.asList("a","b","v","b","a","d"));
        // we need to find how many occurrances there are for each object
        // to find out unique
        // we can use frequency()mehtod returns us the frequency of this object in the list
        boolean result = Collections.frequency(letters, "a") ==1;
        System.out.println(result);
        // Collections is the utility class for all collections framework
        // Collection is an interface
        // This utility class can provide us lots of method that can be applied


    }
}
