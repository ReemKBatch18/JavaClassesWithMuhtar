package day30_ArrayList;

import java.util.ArrayList;

public class class06_ArrayList_Methods2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

     //   list.remove(1);
        String str = "B";
        boolean r1 = list.remove(str); //true if object is successfully removed.
        // If I give String str = "F" ==> boolean r1 = list.remove(str) will be false
        // Only when we pass the object with remove method , it returns boolean expression.
        // if we use the index number using int numbers in the remove method, it will not return boolean
        boolean r2 = list.remove("A"); // we passed the object itself, so A will be removed. will return true

        System.out.println(list);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("=============================================================");

        // CLEAR METHOD:
        // clear method clear(): removes everything from our ArrayList, size ==> 0
        list.clear(); // []
        System.out.println(list); // []
        System.out.println(list.size());

        System.out.println("=============================================================");

        // INDEXOF METHOD:
        //indexOf(Object): returns the index number of the first matching object, will return int

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);   // 0
        list2.add(1);   // 1
        list2.add(2);   // 2
        list2.add(3);   // 3

        list2.indexOf(1); // by default, index number is an int. int will be assigned to integer ==> Autoboxing
        int num1 = list2.indexOf(1);
        System.out.println(num1);

        // if the object doessn't exist, it returns us negative number ==> it doesn't exist.
        int num2 = list2.indexOf(100); // 100 is not one of the elements
        System.out.println(num2);

        int num3 = list2.indexOf(3); //  it should return us 3
        System.out.println(num3);



    }
}
