package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class class05_ExtractCharacters_3 {
    // we will do it here without using a loop to extract
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        char [] arr = str.toCharArray();
        Character[] ch = new Character[arr.length]; // this array has the capacity of containing all elements from char [] arr
        // I need to assign index 0 of arr[0] to index 0 of ch[0]

        // I will use a loop to assign each character to the array
        for (int i = 0 ; i < arr.length ; i ++){
            ch[i] = arr[i];
        }
        System.out.println(Arrays.toString(ch)); //[A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList(ch)); // here we added all characters to letters list
        letters.removeIf( p -> ! Character.isLetter(p)); //==> if character is NOT letter == remove it from letters list
        System.out.println(letters);    //  [A, B, C, D, E, F, G]

        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(ch)); // here we added all characters to digits list
        digits.removeIf( p -> ! Character.isDigit(p)); //==> if character is NOT digit == remove it from digits list
        System.out.println(digits);     //  [1, 2, 3, 4, 5, 6]

        ArrayList<Character> specialChars = new ArrayList<>(Arrays.asList(ch));// here we added all characters to specialChars list
        // since I stored all letters in the collection type letters list and stored all digits in the collections type digits list==>
        //==> I can use removeAll() method to remove them and I will be left with only the special characters
        specialChars.removeAll(letters); // removes all letters from total list
        specialChars.removeAll(digits); // removes all digits form total list
        System.out.println(specialChars);  // [$, %, #, @, &, !]

        // or
        // specialChars.removeIf( p -> Character.isDigit(p) || Character.isLetter(p));



    }
}
