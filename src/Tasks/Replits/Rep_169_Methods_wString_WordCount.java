package Tasks.Replits;

import java.util.Arrays;

/*
This method gets a string and returns the word count of that string.
example:
wordCount("foo bar")
    returns 2
wordCount("one two three")
    returns 3
wordCount("bla")
    returns 1
hint:
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
 */
public class Rep_169_Methods_wString_WordCount {
    public static void main(String[] args) {
        // here we try  our method
        System.out.println(wordCount("foo bar"));       // 2
        System.out.println(wordCount("one two three")); // 3
        System.out.println(wordCount("bla"));           // 1
    }


    public static int wordCount(String words) {

        String [] arr = words.split(" ");

         return arr.length;
    }
}
