package day19_Arrays;
/*
write a program that can return the frequency of characters in a string
ex: "aabcbca"....> a3b2c2
 */
public class FrequencyOfCharacters_NestedLoopPractice {
    public static void main(String[] args) {
        String str = "AABCC"; //A2B1C2
        String result = ""; // A2B1C2       //  to store the result (character with its count)
        String nonDup = ""; //ABC           //  we need this variable to store the character one time
        //to find out how many times A occurred, we need to compare it with each character. /
        ///that's a repeated action that is why we need a loop
        //then we need to find how many times each character had occurred in the string

        for (int i = 0; i <=str.length()-1; i ++){  //this loop is to check whether each character is repeated
            if (! nonDup.contains(""+str.charAt(i))) { //if character at index i is not contained in nonDup, then it will be concatenated
                //To use the String.contains() method, we have to concat our character String.charAt() with "" to be retrieved as string
                // if this string does not contain this char then we need to concat this char to the string nonDup
                nonDup += str.charAt(i); // Now this String nonDup will have each character from original string appearing one time only
            }
        }
       // System.out.println(nonDup);   // ABC : each character from the string appears one time only


        for (int j = 0 ; j <= nonDup.length()-1 ; j++){
            char ch = nonDup.charAt(j); //when j=0 it will return us first character, when j= 1 it will return us second character.... etc

            int count = 0; // this will count the total number of occurrences of each character from string

            for (int i = 0; i <=str.length()-1; i++){
                if (str.charAt(i) == ch){
                // This if statement will compare each character from original string with each character from nonDup String
                    count++;        // this will count how many times each character from original string had appeared in original string
                }
            }
            result += "" + ch + count;  // in order to get this result as a string we need to concat "" to the char
        }

        System.out.println(result);     //  A2B1C2




    }
}
