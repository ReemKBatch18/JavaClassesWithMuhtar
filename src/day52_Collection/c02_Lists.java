package day52_Collection;
/*
ArrayList(C) = implements List (I)
            is an array based class
            internally uses array
            singly linked list (objects are singly linked)
            ==> much faster in terms of retrieving data (get() method) ==> it is used a lot
            ==> much slower in adding or removing elements (remove() method, add() method)

LinkedList(C) = implements List (I)
            is doubly linked list (objects are doubly linked)
            ==> much slower in terms of retrieving data1
            ==> much faster in adding or removing elements

Vector (C) = implements List (I)
            is an array based class
            actions of Vector are synchronized

This is how the method add() looks like in Vector:
          public synchronized boolean add(E e) {
        modCount++;
        ensureCapacityHelper(elementCount + 1);
        elementData[elementCount++] = e;
        return true;
    }

This is how the method add() looks link in ArrayList
         public boolean add(E e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
    }

SYNCHRONIZED in vector ==>
        Synchronized is used to achieve the thread safety
        Synchronized is slower

Thread:  is abstract
         it is the process of operating system for scheduling the object
         scheduling threads and prioritizing thread is the process of the operating system
         process of operating system scheduling object
         by using multi thread ==> allowing execution of multi thread to maximize utilization of CPU

ArrayList:  multiple threads can get access to ArrayList to execute at the same time

Vector:     multiple threads can get access to Vector to execute one by one ==> we achieve thread safety
            disadvantage is : synchronized is slower
            Only time Vector is preferred to be used when you have multi-thread
            it is extended by Stack(C) ==> Stack inherited from Vector

Stack(C):   extends Vector(C)
            Stack is also synchronized
            pop() method: Last in First out (only unique in the Stack class)
            pop() method: whatever object was added to stack ==> will be first to be removed

            (imagine husband and wife withdrawing money from same account from different ATM)
            (if not synchronized ==> might get no funds available)
            (But because synchronized ==> first one gets funded then balance is updated for second one)
multi-Thread: two or more threads are getting executed

Thread-Safety : one thread at a time

List(I):
         extends Collection(I)
         implemented by ArrayList(C), extended by Queue(I)
         has index numbers (not ordered)
         accepts duplicates (duplicated value)
         size is dynamic

Queue (I) :

            it is interface ==>
            size is dynamic
            does NOT have index numbers
            accepts duplicates
            has a unique method called poll()
            first in first out
            poll() method removes the first object added

Set (I):
        doesn't accept duplicates
        doesn't have index numbers
        size is dynamic
        Set is extended by SortedSet(I)
        SortedSet(I) is implemented by TreeSet(C) class

TreeSet(C):
        doesn't accept duplicates
        sorts the objects  ==> it is designed for sorting

null:
        default vlue of all reference type
        does not refer to any object
        WebElement element;         // null
        String str;                 // null

hashset :
        doesn't accept nul ker

 */


import java.util.*;

public class c02_Lists {

    public static void main(String[] args) {

        List <Integer> list1 = new ArrayList<>();
        list1.add(1);
        // List is an interface ==> we can NOT give list for the object type like this:
      //  List<String> list0 = new List<String>() ;
        List<Integer> list2 = new LinkedList<>();
        // same methods that we use in arrayList we can use here in LinkedList
        list2.add(0);
        list2.remove(0);
        System.out.println("******************************");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);

        Vector<Integer> vector = new Vector<>();
        vector.add(10); // add() method is synchronized

        Stack <Integer> stack = new Stack<>();
        stack.add(10);

        System.out.println("********************************");

        Stack<String> names = new Stack<>();
        // we will add names one by one using add() method
        names.add("sha");
        names.add("Dovran");
        names.add("Rahman");
        names.add("Anna");
        names.add("Rustem");
        System.out.println(names);      //      [sha, Dovran, Rahman, Anna, Rustem]
        // we added "Rustem" as the last object ==> whenever we need to remove last object --> we use pop() the unique method
        // pop() method will return us a String ==> we can assign the outcome to a String like this:
        String s1 = names.pop();    // ==> it will remove "Rustem" and assign it to s1
        System.out.println(s1);     //          Rustem

        System.out.println(names);  //          [sha, Dovran, Rahman, Anna]

        String s2 = names.pop();    // will return us Anna and remove it too
        System.out.println(s2);
        System.out.println(names);  //          [sha, Dovran, Rahman]
        //last in first out order : only unique in the Stack class ==> available for Stack objects

        names.push("Phu");    //          will add Phu to the names List
        System.out.println(names);  //          [sha, Dovran, Rahman, Phu]


        ArrayList<String> list3 = new ArrayList<>();
        list3.add(null);

        System.out.println(list3);
        System.out.println("***************************");
        String number = null;

     //   int num1 = Integer.parseInt(number);

     //   System.out.println(num1);

        System.out.println("***********************************");

        String [] arr = {null, "cyb", null};
        // if I don't have objects at index 0 or 2 would I be able to call it and apply method to it?
  //      arr[2].toUpperCase();       // can't do that==> NullPointerException
        // if I have String object, can I get accesss to the instances of the String? yes I can
        arr[1].toUpperCase();
        System.out.println(arr[1].toUpperCase()); //CYB


        //
        //




    }

    public synchronized void method1(){

    }
}
