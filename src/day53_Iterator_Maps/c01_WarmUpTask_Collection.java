package day53_Iterator_Maps;

import java.util.*;

/*
1. write a program that remove the duplicates fron an array of String
	2. write a program that can remove the duplicates from an arrayList of String
	3. what are the differences between List and Set
			List:
			        Accepts duplicates
			        has index
			        Stack class inherits from List : Last in First out
			Set:
			        Does not accept duplicates,
			        Does not have index
			Queue:
			        Accepts duplicates
			        does not have index numbers
			        First in First out

	4. how to achieve thread safety
 */
public class c01_WarmUpTask_Collection {

    // access-modifier  specifier return-tye methodName(parameter){}
    // AMs: public, protected, default, private
    // specifiers : static, final, abstract, synchronized

    public static void main(String[] args) {
        // is there a way to convert arraylist synchronized?
        //we can use the synchronized method from collections class
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list = Collections.synchronizedList(list); // now it is thread-safe

        // in the Set there's no class that is sychronized
        // How can we synchronize it? use method from Collections class
        Set<Integer> set = new HashSet<>();
        set = Collections.synchronizedSet(set); // not it is thread-safe

        System.out.println("******************************************");

        // task 1.
        String[] arr = {"a","b","c","d","d","a"};
        // to remove duplicates using easy way==> using the Set. Set does not accept duplicates
        // which class of Set should we use? hashset, linkedhashset, or ... ? we need to use the linkedHashSet
    //    LinkedHashSet<String > st = new LinkedHashSet<>();
        // how can we add array elements int the st? using a loop
        // each of the values I wnt to add into this st:
        // in collections each class has its own consttuctor that accepts any collection type
        // Array is not a collection type. I can convert my array into a List
        // (List is a Collection) ( List extends Collection Interface)
        // So I can do the following:
        LinkedHashSet<String > st = new LinkedHashSet<>(Arrays.asList(arr));
        // now if we print st:
        System.out.println(st); // [a,b,c,d]

        // I will create an arrayList with same values I have in Array
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("a","b","c","d","d","a"));
        LinkedHashSet<String > st2 = new LinkedHashSet<>(arrayList);
        // let's print st2
        System.out.println(st2); // [a,b,c,d]  same as st






















    }

    public synchronized void append(){

    }


}
