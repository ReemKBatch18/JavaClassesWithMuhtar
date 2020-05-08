package day14_StringClass;

import java.util.Scanner;

/*3. Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input : elephant
				Output: The middle character in the string: ph */
public class middleCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.next(); //Cyber

        String middleCharacter=""; // to store the middle character at the end

        //we need the length of the word
        int totalChars = word.length(); //5
        //if we divide by 2, it will return 2 which is the middle character
        int middleNumber= totalChars/2; //2

        if (totalChars % 2 != 0){ //odd numbers
            middleCharacter = middleCharacter + word.charAt(middleNumber); //by using charAt()


        }else{
            middleCharacter = middleCharacter+ word.charAt(middleNumber - 1)+ word.charAt(middleNumber);
            // middleCharacter += word.charAt(middleNumber - 1)+""+ word.charAt(middleNumber);
            // we add +"" to make it a string so it can concate otherwise it will calculate as nubmers
        }
        System.out.println("Middle Character: " +middleCharacter);
    }
}
