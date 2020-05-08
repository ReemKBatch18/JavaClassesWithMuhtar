package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethods_Split_toCharArray {
    public static void main(String[] args) {


        // string.toCharArray() method converts a String into a char array ==> returns us char Array ==> we can assign it to char Array
        // string.split() method converts a String into a String Array ==> returns us String Array ==> we can assign it to string Array

        // first Method is toCharArray: which returns char array from string
        String name = "Java"; // 'J' , 'a', 'v' , 'a'

        // to return this string as chars we call toCharArray method

        char[] chars = name.toCharArray();

        // length of array should equal length of string of course

        System.out.println(chars[0]); // 'J'
        System.out.println(chars[3]); // 'a'

        System.out.println("===============================================");

        // second Method is split() : which splits a string and returns it as a String Array

        String str = "I like Java";

        String[] arr = str.split(" "); // we are splitting by space " "
        // we can assign it to string Array because it returns us a String Array

        // in order to print it we need to call Arrays.toString() method to print array

        System.out.println(Arrays.toString(arr)); // [I, like, Java]

        System.out.println("======================================================");

        String sentence = "Today is a great day";

        // to reverse this sentence ==> split first ==> String array ==> use for loop starting from last index ==> then print

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words)); // [Today, is, a, great, day]
        // How can we get sentence reversed? day great a is Today? we need to use a loop
        // we need to assign a String variable called result so that we concat the words to it
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) { // we start from last word in the array
            String eachWord = words[i]; // we assign to string because each word is a string
            // now we need to print each word separated by a space...
            // so we use the regular print method with space like the following:
           // System.out.print(eachWord + " ");
            // but we need now to concat them to the result
            result += eachWord + " ";
        }

        System.out.println(result);

        System.out.println("=====================================================");

        // now how can we get a string array from a single word?
        // we can use split method:
        String str2 = "ABCDE";
        String arr2[] = str2.split(""); // ["A", "B", "C" , "D", "E"]

        System.out.println(Arrays.toString(arr2)); //   [A, B, C, D, E] This is a string array

        // or we can use toCharArray method to get a char array
        char [] ch2 = str2.toCharArray(); //  ['A', 'B', 'C' , 'D', 'E']
        System.out.println(Arrays.toString(ch2)); //[A, B, C, D, E] This is a char array

        System.out.println("====================================================");
        int [] num1 = new int[3];       // in this step we initialized length of array num1 to 3
        // num1 = {0,0,0} // default values are assigned to each index at initialization of array
        int [] num2 = {1,2,3,4,5};
        num1 = num2;        // in this step we reassigned num1 to num2 ==> num1 size is changed to num2 size==> elements too
        for (int i= 0 ; i < num1.length; i ++){
            System.out.println(num1[i]); // 1 2 3 4 5
        }
    }
}
