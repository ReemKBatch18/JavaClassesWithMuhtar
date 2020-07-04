package day52_Collection;
/*
Data Structure:
    - Array
    - Collection
    - Maps
We need data structure to manage data efficiently and in an organized matter

Array vs ArrayList
Array size is fixed, ArrayList size is Dynamic
Array supports primitives and objects, ArrayList supports only objects
Array can be multi-dimensional, ArrayList can not be multi- dimentional
Array has index number, and accepts duplicates. ArrayList also has index number and accepts duplicates

To sort any array => we used Arrays.sort(arrayName) method
To sort any collection ==> we can use Collections.sort(collectionName) method

Collection framework: consists of multiple interfaces
                    Collection is a group of individual objects as a single entity
                    Collection size is dynamic = can increase or decrease
                    Can hold different data types
                    All these classes and interfaces are presented in "java.util"
                    Each of those interfaces in collection framework has multiple implementations
                    Collection has a parent interface called: Iterable (I) [(I) stands for Interface]

Iterable (I): root interface. It is super type of all interfaces in collections framework

Collection(I): is an interface that consists of 3 interfaces: List(I), Queue(I), and Set(I)
               These interfaces inherit from Collection by using extends keyword
               ArrayList(C) inherited from List(I)
               By making List(I) as reference type, I can create object from ArrayList(C), LinkedList(C), Vector(C), Stack(C)

List(I): extends Collection(I)
         implemented by ArrayList(C), extended by Queue(I)
         has index numbers (not ordered)
         accepts duplicates (duplicated value)
         size is dynamic

Collection(I) :
    /      |    \
   /      |      \
  /      |        \
Set(I)   List(I)   Queue(I)

Collection(I) is inherited by:      Set Interface
                                    List Interface
                                    Queue Interface

Set(I) is inherited by:     HashSet Class
                            LinkedHashSet Class
                            TreeSet Class (inherits SortedSet interface)

List(I) is inherited by:    ArrayList Class
                            Vector Class
                            LinkedList Class

Queue(I) is inherited by:   LinkedList Class
                            Priority Queue Class




 */
public class c01_Collection_Intro {
}
