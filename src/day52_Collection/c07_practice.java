package day52_Collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
1. write a program that can remove duplicate characters from a String
    and store them into variable
2. write a program that can identify if two strings are built out of same letters
    ex:
        str1 = "abababa"
        str2 = "ab"

        output : true
 */
public class c07_practice {

    // which class should we use for 1. task? --> the LinkedHashSet : removes dup and keeps order
    public static void main(String[] args) {


        String str = "abababacsdd"; // result should be: ["a", "b", "c", "s", "d"]
        // by using split() method we can get the array from the String
        // we split it by empty String. I can assign it to String array
        String[] arr = str.split("");
        // to print array ==> use Arrays.toString() method
        System.out.println(Arrays.toString(arr));
        // String is an object
        // can I convert the object array to the collection? yes I can
        // I need to use the LinkedHashSet
        // what should be the datatype of the linkedhashset? it should be String
        // to convert array to collection type => use Arrays.asList()method
        LinkedHashSet<String> ls = new LinkedHashSet<>( Arrays.asList(arr));

        System.out.println(ls);  //[a, b, c, s, d]

        // if I want to convert the list to a String like: abcsd
        // I want to iterate every single element of the linkedhashset and add it to my empty string
        // I can use for each loop
        // we can apply for each loop to any collection

        String result = "";
        // every single object of the ls is  String type
        for( String each : ls ){
            // can this loop iterate every single element in this linkedhashset? yes it can
            // I can use concatenation to add the elements to my String result
            result += each;
        }

        System.out.println(result);  // abcsd



        // Here is another shorter way by not creating ls.
        // 2nd solution for 1. task
        String str2 = "abababacsdd";
        String [] arr2 = str2.split("");
        str2 = "";
        for ( String each2 : new LinkedHashSet<>(Arrays.asList(arr2))){
            str2 += each2;
        }
        System.out.println(str2);

        // Another solution without using loop
        // 3rd solution for 1. task
        String str3 = "abababacsdd";
        String [] arr3 = str3.split("");
        str3 = new LinkedHashSet<>(Arrays.asList(arr3)).toString().replace(", ", "");
        System.out.println(str3);

        System.out.println("******************************************");

        // 1st solution of 2. TASK
        String s1 = "ababababa";
        String s2 = "baba";

        String[] ar1 = s1.split("");
        String[] ar2 = s2.split("");

        // first we need to remove duplicates and return arrays without duplicates
        // then compare each result if they match
        // I can use TreeSet
        TreeSet<String> t1 = new TreeSet<>(Arrays.asList(ar1));
        TreeSet<String> t2 = new TreeSet<>(Arrays.asList(ar2));

        System.out.println(t1);
        System.out.println(t2);

        // Now all I have to do is to put them back to a string and then compare them
        // Now converting the collection to a string using the toString() method
        s1 = t1.toString();
        s2 = t2.toString();

        System.out.println(s1.equals(s2));      // true

        // 2nd solution for 2. Task
        String s3 = "ababababa";
        String s4 = "baba";

        s3 = new TreeSet<>(Arrays.asList(s3.split(""))).toString();
        s4 = new TreeSet<>(Arrays.asList(s4.split(""))).toString();

        System.out.println(s3.equals(s4));      // true


    }


}
