package day53_Iterator_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/*
Methods:
    . Iterator() method: iterates any given collection, then returns Iterator(I)
                            returns interface Iterator(I)
    . hasNext() method: checks if there are engough elements that can be iterated.
                            returns boolean
    . next() method:    checks if hasNext() is true ==> next() gets access to the object to retrieve it
                            then you can decide if you want to remove it or not
    . remove() method:  removes the current element of the iteration

 */
public class c03_Iterating_Collection {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 1, 2, 3, 1, 2, 3, 2, 3, 4, 4, 5, 5));

        // if we wnat to remove values less than 4 ? YOu probably think of loop to do so
        for (int i = 0; i < list.size(); i++) {
            // I can use if statement
            if (list.get(i) < 4) {
                list.remove(i);
            }
        }
        // we print the list to see if it removed what's less than 4
        System.out.println(list);

        System.out.println("***********************************************");
        // whenever we use the loop it can't actually remove the objects from the arrayList, It removes the values temporarily
        // in order to remove the object itself ==> MUST use the iterator.
        // Without iterator IT IS NOT possible to remove the objects

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 1, 2, 3, 1, 2, 3, 2, 3, 4, 4, 5, 5));
        // to use removeIf we need predicate
        list2.removeIf(p -> p < 4);
        System.out.println(list2);  //  [4, 4, 5, 5]
        // removeIf() method is internally using the iterator
        // in order to remove objects from collection you have to use iterator

        // today we will learn how to explicitly use iterator
        // we will learn to apply iterator explicitly
        // iterator is a method inherited to Collection (I) from Iterable
        // and then inherited and overridden by all the inheriting classes
        // Iterator () method iterates any given collection, then returns Iterator(I)
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(5, 2, 3, 1, 2, 3, 2, 3, 4, 4, 5, 5));
        // this mehtod will return me an Iterator interface ==> I can assign it to an Iterator
        // in this case it is Iterator of Integer
        Iterator<Integer> it = list3.iterator();
        // now we can remove objects from the iterator it. It will continue to iterate until it removes all objects
        // if I call hasNext() from this iterator 'it' ==> it will give us true, because there are elements to iterate
        it.hasNext();
        // this expression can be applied to the condition of the loop.
        // which loop only accepts boolean? the while loop --> I will use this expression in the while loop
        // if there is an element to be iterated ==> I can retrieve this element
        // to retrieve it I can use the next() method
        // if hasNext() is false ==> next() will give me NoSuchElementException
        // you can only use next() if hasNext() is true, if false ==> next() will not get executed
        // can't use it in the loop because if hasNext becomes false, loop will not execute
        // I can use next() in an if statement in this while loop like this
        //
        while (it.hasNext()) {
            // this condition will become false when there are no elements that can be iterated
            if (it.next() < 4) {
                it.remove();
            }
        }
        // now we will print to see if we get the same result:
        System.out.println(list3);  //  [4, 4, 5, 5]

        System.out.println("*****************************************");

        // here I will try with a for loop
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 3, 2, 3, 4, 4, 5, 5));
        for (Iterator<Integer> I = list4.iterator(); I.hasNext();) {
            // I.next() returns me Integer ==> I can assign it to int
            int num = I.next();
            if (num < 4){
                I.remove();
            }
        }
        System.out.println(list4);
        // first we create the iterator and then apply while loop
        // we can create the iterator inside the for loop
        // you must use next() inside the loop . DO NOT use it outside, because it will iterate
    }
}
