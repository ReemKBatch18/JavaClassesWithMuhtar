package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class StringMethods {

        /*
        String Methods related to Array:
                toCharArray(): you call from a String object ---> it will return you char array
                split(str): splits the string by giving str, --> will return String Array

         */
        public static void main(String[] args) {

        String str = "ReemKhalil";
        // can I print each character in an array? yes I can

            str.toCharArray();  //  [R,e,e,m,K,h,a,l,i,l]
            char[] ch = str.toCharArray();
            System.out.println(Arrays.toString(ch));

            System.out.println(str.length() == ch.length); // true
            /*
            str1 = "abc" , str2 = "cab"
            write program to verify if these two strings are build out of same characters
             */
            String str1 = "abc";
            String str2 = "bac";
            //first we create char arrays from each string:
            // then we sort in ascending order
            // Then we compare by equal method

            char [] ch1 = str1.toCharArray();
            char [] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            System.out.println(Arrays.equals(ch1,ch2)); // true

            System.out.println("==================================================");

            String sentence = "I like to learn java";
            // HOW CAN WE CREATE AN ARRAY FROM THIS SENTENCE? BY APPLYING SPLIT METHOD: SPLIT BY " " SPACE
            // by this method we can get the total number of words in any sentence.
            // since this will return us a string Array--> we can assign it to a String array.

            String [] words = sentence.split(" ");
            System.out.println(Arrays.toString(words)); //[I, like, to, learn, java]

            int totalWords = words.length;
            System.out.println(totalWords);
            System.out.println("====================================================");
            // can we print sentence in reverse order? YES we can:
            // we apply loop to the array we created then print [I, like, to, learn, java]

            String result = "";
            for (int i = words.length-1 ; i >= 0 ; i --){
              //  System.out.print(words[i]+ " ");        // java learn to like I
                result += words[i]+" ";
            }
            System.out.println(result.trim());






    }
}
