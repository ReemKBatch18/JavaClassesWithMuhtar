package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class class07_ObjectMemory {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40));
        // objects are stored in the heap memory
        // methods, local variables will be stored in stack memory

        ArrayList<Integer> list2 = list1;
        // both variables list1 , list2 are referring to same object : new ArrayList<>(Arrays.asList(10,20,30,40))
        // this object is in the Java heap
        // is referenced to by two variables list1 and list2
        // whatever I change in the variable it will change the second
        list1.remove(2);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println("=================================");

        String str1 = new String ("cybertek");
        String str2 = str1;
        // how many objects are created in the Java heap? only one with two variables
        // but String is immutable ==> can not be changed
        str1.toUpperCase(); // even if we call this method, str1 will not change, we can reassign it only like this:
        str1 = str1.toUpperCase();
        System.out.println(str1); // now this will print uppercase because we reassigned it
        System.out.println(str2);// this one will stay lower case\

        // if a variable is initiated outside  method ==> instance variable ==> gets stored in the heap
        // local variables are stored in stack
        // methods are stored in the stack
        // reference variables are stored in the stack memory





    }
}
