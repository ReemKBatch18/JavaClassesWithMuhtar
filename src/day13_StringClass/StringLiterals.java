package day13_StringClass;

public class StringLiterals {

    public static void main(String[] args) {

        String str1 = "Cat"; //stored in String Pool
        // doesn't take duplicate objects. stores similars under one object
        String str2 = new String ("Cat"); // Java Heap
        System.out.println(str1==str2); // false

        String str3 = "Cat";
        System.out.println(str1==str3); // true same text = same object

        // everytime we create a new word it creates a new object in memory. Two independent objects
        String str4 = new String("Cat");
        System.out.println(str2 == str4); // false different objects

        String s1 = "Java"; // goes to String Pool (it's stored there), immutable cann't be modified
        System.out.println(s1); //Java
        s1="JavaScript";// New object is created in memory
        System.out.println(s1); //JavaScript

        String s2 = "Java";

        System.out.println(s1 == s2);// false ... different






    }
}
