package day52_Collection;
/*
List(I): extends Collection(I)
         implemented by ArrayList(C), extended by Queue(I)
         has index numbers (not ordered)
         accepts duplicates (duplicated value)
         size is dynamic

Queue (I) : it is interface ==>
            size is dynamic
            does NOT have index numbers
            accepts duplicates
            has a unique method called poll()
            first in first out
            poll() method removes the first object added

 */
import java.util.PriorityQueue;
import java.util.Queue;

public class c03_Queue {
    public static void main(String[] args) {

        Queue <String > q = new PriorityQueue<>(); // since queue is an interface ==> no Object
        // but can be used as reference nubmer to an object created from a sub class of queue like PriorityQueue
        q.add("a");
        q.add("b");
        q.add("c");
        q.add("d");

        System.out.println(q);  //[a, b, c, d]
        // queue interface has a very unique method called poll() which removes the first object added to list
        // poll() returns us String ==> we can assign it to string
        String str = q.poll();
        System.out.println(str);    //a
        System.out.println(q);  //[b, d, c]
    }
}
