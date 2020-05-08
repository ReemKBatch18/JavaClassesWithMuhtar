package day30_ArrayList;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

public class class05_ArrayList_Methods {
    public static void main(String[] args) {
        /*
        add(Object) : adds objects to the arraylist
        add(index,Object): adds the object at the given index
            list ==> {1,3,4};
            if we want to add 2 at index one :list.add(1,2)
            list ==> {1,2,3,4}

         */

        // ADD METHOD
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(8);
        // I need to add 6
        // if I use regular add method: list1.add(6), 6 will be added at the end at index 3
        // If I want 6 to be placed at index 1 then I need to use this add method: list1.add(1,6)
        list1.add(1,6);
        // We need to make sure we use an index number that is within the limit. valid index number

        System.out.println(list1);  //  [5, 6, 7, 8]

        System.out.println("===========================================================");
        // SET METHOD

        // if I want to change the element at a certain index I need to call the set method
        list1.set(3,9); // this set method will replace 9 with 8 at index 3

        ArrayList<String > list2 = new ArrayList<>();
        list2.add("A"); //{A}
        list2.add("B"); // {A,B}
        list2.add(1, "C"); //{A,C,B}
        list2.add(1, "D");// {A,D,C,B}

        list2.set(3,"F"); //{A,D,C,F}
        list2.set(2, "E");//{A,D,E,F}

        System.out.println("===============================================================");
        //REMOVE METHOD
        // remove(int index): object at the given index number will be removed
        // remove(object): object will be removed
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

        int a = 1 ; // data type of this a is primitive not an object

       // when we pass int at the remove method, int will be considered the index number
        list3.remove(a); // ==> 2 will be removed from ArrayList because index 1 has the object 2
        // by default if I put the number 1 directly it will be taken as an int = the index number

        // When we pass an object into the remove method, it will remove the object, like:
        Integer a1 = 1;
        list3.remove(a1); // now a1 represents the object 1 (not object @ index number 1)


        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(10);
        list4.add(20);
        list4.add(30);
        // we want to remove 20 from the list4 and then 10. How many methods can I use? 2 methods
        // one method by using index number , second method by using object
        // this is first method
        list4.remove(1);

        //Or we use the following way and remove 10 this time
        Integer a2 = 10;
        list4.remove(a2); // this method returns us boolean after removing the object we passed
        // we can assign it to boolean:
        boolean r1 =  list4.remove(a2);

        System.out.println(list4);
        System.out.println(r1);
// There is a bug in my code above


    }
}
