package day29_Wrapper_ArrayList;
import java.util.ArrayList;
public class class_07_ArrayList {
    public static void main(String[] args) {
        /*
        ArrayList : is class located under java.util.ArrayList;
         ArrayList: is part of Collection data structure type
         We can add and remover in the ArrayList vs we can not do that in Arrays
         We need to provide: import java.util.ArrayList; in order to use ArrayList
         ArrayList <DataType> name = new ArrayList <DataType>();
         We MUST specify the first DataType. The second one is optional to specify.
         Since ArrayList is part of Collections data structure, it doesn't support primitives
         It only supports non primitives
         We can use wrapper class: because it takes the primitive value and can convert it to object
         we can use Integer for example in arraylist but not int
         */

      //  ArrayList<int> scores = new ArrayList<int>(); compile error: DataType = primitive
        ArrayList<Integer> scores = new ArrayList<Integer>();
        // if DataType is Integer, Can I store int into this ArrayList? yes I can

        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<Character> chars = new ArrayList<Character>();
        ArrayList<Double> doubles = new ArrayList<Double>();

        // When we declare the array we have to specify the size
        int [] arr = new int[3]; // ==> max number of elements in this array is 3

        // However in ArrayList, we do not have to worry obout size. It is dynamic. Keeps changing.
        // We can add or remove elements from it. It is automatically adjusted every time.

        ArrayList<Integer> scores1 = new ArrayList<Integer>(); // size 0
                                    // add 5 elements ===> size 5
                                    // remove 2 ==> size 3

        // Now we will learn how to add or remove elements to ArrayList
        // for that we will need methods like add(), remove()
        // Methods: add(): adds non-primitive elements = objects to ArrayList

        scores1.add(10); // by default 10 is an int. but can I assign this int to an Integer? yes
        System.out.println(scores1); // [10]  // autoboxing
        // The size is 1

        scores1.add(20);
        // the size is 2
        System.out.println(scores1); //[10, 20]

        scores1.add(30);
        // the size is 3
        System.out.println(scores1);// [10, 20, 30]

        // Array was an ordered structure. ArrayList is also ordered ==> has index numbers

        // METHOD : GET (INDEX) : GETS THE OBJECT AT THE GIVEN INDEX, RETURNS THE OBJECT AS IT IS

        scores1.get(2);
        // This get method will return me an Integer. Can I assign it to Integer wrapper class? yes I can
        //if this is an Integer, can I assign to an int, or double, or short??  yes I can.

        Integer a1 =  scores1.get(2); // none
        int a2 =  scores1.get(2);       // unboxing
        double a3 =  scores1.get(2);    // unboxing

        // printing any of those values a1, a2, a3 will return me 30 which is the element at index 2
        // What happens if I try to return element at index 100? max range of index is 2. Index 100 out of bound
        // if ArrayList has index numbers can we apply loop to it..? Yes we can

    }
}
