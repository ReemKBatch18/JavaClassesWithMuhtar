package day17_WhileLoops;

import sun.font.CreatedFontTracker;

public class WhileLoopPractice4_PalindromeTest {
    public static void main(String[] args) {

        String str = "I love school";
        String reversedStr = ""; // to store the reversed version of str

        //initialization will be outside loop
        // we start iniitalization from the last letter of the word

        int index = str.length()-1; // last index number

        while (index >=0){
            reversedStr += str.charAt(index);
            index--;
        }

      //  System.out.println(reversedStr); I love school --> loohcs evol I

        boolean palindrome = reversedStr.equals(str);

        System.out.println(palindrome);






    }
}
