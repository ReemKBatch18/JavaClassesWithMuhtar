package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_StringMethod_ToChar {
// String.toCharArray() method: string method that converts any string into char Array
    // Arrays.equals(,) method: an array method that compares equality of two arrays
    public static void main(String[] args) {

        String name = "Reem Khalil";
        // String.toCharArray() method: converts any string into a char[] array
        // Since this method returns us a char [] array, can we assign it to char array? Yes we can:
        char[] characters = name.toCharArray();
        // In order to print our array ==> we use Arrays.toString(ArrayName) method
        System.out.println(Arrays.toString(characters)); //[R, e, e, m,  , K, h, a, l, i, l]

        String str1 = "Cybertek School";
        String str2 = "School Cybertek";
        // write a program to check if those two strings are built out of the same characters
        // first step: convert each String into char array using String.toCharArray() method, like this:
        char [] ch1 = str1.toCharArray(); // [C, y, b, e, r, t, e, k,  , S, c, h, o, o, l]
        char [] ch2 = str2.toCharArray(); // [S, c, h, o, o, l,  , C, y, b, e, r, t, e, k]

        // second step: sort both arrays ==> both arrays in ascending order:
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // To print our arrays ==> we use Arrays.toString(ArrayName) method, like this:
        System.out.println(Arrays.toString(ch1));// [ , C, S, b, c, e, e, h, k, l, o, o, r, t, y]
        System.out.println(Arrays.toString(ch2)); // [ , C, S, b, c, e, e, h, k, l, o, o, r, t, y]

        // third step: we compare equality of both arrays using Arrays.equals() method like this:
        // Arrays.equals(firstArray,secondArray) method: compares whether two arrays are equals ==> returns boolean
        // Since .equals() method returns us boolean, can we assign it to boolean? yes we can:
        boolean result = Arrays.equals(ch1, ch2);
        System.out.println(result); // true




    }
}
