package day52_Collection;

import java.util.ArrayList;

/*
null:
        default vlue of all reference type
        does not refer to any object
        WebElement element;         // null
        String str;                 // null

 */
public class c05_null_keyword {
    // I will declare a static variable
 //   static String str;      // default value of str is null because we have not initiate it
    //if we don't have objects of the string can we use the methods of the string ? like toUpperCase()..etc
    // what happens if I call the charAt() method in my main method ==> NullPointerException
    // it throws an exception because str does not refer to any object

    // once I instantiate the object of str ==> we created an object which str refers to
   static String str = new String("Cybertek");

   // now I will create arrayList without instantiating it
    static ArrayList<Integer> list;
    // what happens if I call the get method in main method? I will get NullPointerException = there is no object
    // when there is no object ==> we can't use its instances or methods
    // for any reference type I can assign null to it.
    // null = default value for non- primitive. Can not assign it to int


    public static void main(String[] args) {


        System.out.println(str.charAt(0));

        String str2 = null;
        Integer i1 = null;

        ArrayList<String> lis1 = new ArrayList<>();


    }



}
