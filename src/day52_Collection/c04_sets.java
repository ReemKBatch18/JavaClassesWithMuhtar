package day52_Collection;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/*
hashset vs linkedhashset
    linkedhashset keeps insertion order as it is
    hashset doesn't keep order as it is
    hashset is faster than linkedhashset


Set (I):
        doesn't accept duplicates
        doesn't have index numbers
        size is dynamic
        Set is extended by SortedSet(I)
        SortedSet(I) is implemented by TreeSet(C) class

TreeSet(C):
        doesn't accept duplicates
        sorts the objects  ==> it is designed for sorting
 */
public class c04_sets {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>(); // HashSet is a sub class that inherited from Set(I)

        names.add("b");
        names.add("sh");
        names.add("zu");
        names.add("ov");
        names.add("ov");
        names.add("ov");
        names.add("ov");
        System.out.println(names);  // [b, sh, ov, zu]
        // even though I added 4 "ov" but the set includes only one ==> NO DUPLICATES
        // order is not like how we add, it is up to order in class

        Set<String> names2 = new LinkedHashSet<>(); // LinkedHashSet is a sub class that inherited from Set(I)

        names2.add("b");
        names2.add("sh");
        names2.add("zu");
        names2.add("ov");
        names2.add("ov");
        names2.add("ov");
        names2.add("ov");
        System.out.println(names2);  // [b, sh, zu, ov]
        // even though I added 4 "ov" but the set includes only one ==> NO DUPLICATES
        // order is  like how we add, first then second then third.. etc.


        // if we have array of Strings
        String [] arr = {"a","v","a","b","a"};
        System.out.println(Arrays.toString(arr));   //[a, v, a, b, a]
        // to remove duplicates can I apply hashset or linkedhashset to do so? yes I can
        // I will use the LinkedHashSet so that it keeps the order of my data
        // how can I store the data in the list I'm creating? using Arrays.asList(arr)
        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set1);                   //[a, v, b]


        System.out.println("/************************");
        Set<Integer> nums = new TreeSet<>();
        // whenever we add objects to TreeSet collection ==> it will remove duplicates and sort data at same time
        nums.addAll(Arrays.asList(10,3,2,44,5,6,10,44,8,98,5));     // removes duplicates 10, 44, and 5 and then sorts the numbers
        System.out.println(nums);        //[2, 3, 5, 6, 8, 10, 44, 98]

        // hashset accepts null
        HashSet<String> hashSet= new HashSet<>();
        hashSet.add(null);

        System.out.println(hashSet);

        // Treeset doesn't accept null
        TreeSet<String > treeSet= new TreeSet<>();
        treeSet.add(null);
        System.out.println(treeSet);


    }

}
