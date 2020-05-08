package day33_CustomClass;

import java.util.ArrayList;

public class class04_WarmUp_ExtractCharacters_2 {
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

        for (int i = 0 ; i < str.length() ; i ++){
            // how can I retrieve each character from string using i as index number
            char each = str.charAt(i);
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
