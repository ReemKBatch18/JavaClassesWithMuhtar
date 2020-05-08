package day33_CustomClass;

import java.util.ArrayList;

public class class03_WarmUp_ExtractCharacters {
    /*
    4. write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
		Do not use lambda
     */

    public static void main(String[] args) {

       String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> letters = new ArrayList<>(); // this list will contain all letters extracted from str
        ArrayList<Character> digits = new ArrayList<>();    // this list will contain all digits extracted from str
        ArrayList<Character> specialChars = new ArrayList<>(); // this list will contain all special characters extracted from str
        // from the string, if we call the toCharArray() method, what does it return us? it returns us a char array
        // ==> we can assign it to a char array

        char [] arr = str.toCharArray();
        // we can use for each loop or regular for loop
        for( char each : arr ){ // each : represents every element in this char array
            // during each iteration, if each is letter we add it to letters list
            // if each is digits ==> add it to digits list
            // if each is special character ==> add to specialChars list
            // either create condition depending on ascii table
            // or we use this Character.isLetter() method, or Character.isAlphabetic() method
            if (Character.isLetter(each)){
                letters.add(each);
                // to extract digits we can use this method: Character.isDigit()
            }else if (Character.isDigit(each)){
                digits.add(each);
            }else{
                specialChars.add(each);
            }

        }
        System.out.println(letters);        //  [A, B, C, D, E, F, G]
        System.out.println(digits);         //  [1, 2, 3, 4, 5, 6]
        System.out.println(specialChars);   //  [$, %, #, @, &, !]




    }
}
