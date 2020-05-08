package day19_Arrays;
/*
Write a program that can return the unique characters from a string
ex: "AABCC" --> "B" because it is not repeated
 */
public class UniqueCharacter_NestedLoopPractice {
    public static void main(String[] args) {

        String str = "Reem Khalil";     // Rm Khai are the unique characters

        String result = ""; // unique character will be concated to this result
        // in order to find which is unique, we need to compare it to each index so we can use loop for repeating compare

        for (int j = 0 ; j <= str.length()-1 ; j++){ // 0 represents first index of any string.
            // this outer loop up will repeat as many times as there are characters in a string.
            // str.length()-1 represents the last index of any string
            // we start this loop and put the following steps inside it to repeat it for each character
            // the following steps are the steps needed for each character of the string to compare with the other characters
            int count = 0; // the purpose of this variable is to count the occurrence of the character in the String
            for ( int i = 0; i <= str.length()-1; i ++){// we use charAt() to get the char at that index from String
                // i : represents index number of each character of the string
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1 ) { // if unique,
                result += str.charAt(j);        //  Rm Khai
            }

        }

        System.out.println(result);
        System.out.println("==================================================");

        // now we will try it with char


        String  str2 = "ababacv"; // cv are unique
        String result2 = ""; // to store unique characters

        //this outer loop will repeat the steps of checking wether unique for how many characters we have
        for (int y = 0; y <= str2.length()-1;  y++){// now y is the index number
            // if y is the index number we can retrieve each character by using charAt() method to replace the index#
            char ch2 = str2.charAt(y);
            // these following steps need to be repeated for each character of the string as many characters we have
            int  count2 = 0; // to count how many times each character is occurred in the string

            for (int z = 0; z <=str2.length()-1; z++){
                char ch = str2.charAt(z);
                if (ch == ch2){
                    count2 ++;
                }
            }
            if (count2 == 1){
                result2 += ch2;
            }
        }

        System.out.println(result2);        // cv

    }
}
