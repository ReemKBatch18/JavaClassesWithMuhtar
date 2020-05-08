package day30_ArrayList;

import java.util.Arrays;

/*
1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits

 */
public class class01_WarmUp_SumOfDigits {
    public static void main(String[] args) {

        String str = "a1b2c3";
        // we need to find the sum of digits ==> To do that, we need to check each character one by one
        // Is it possible to create data collection from a string? Yes we can create char array
        // To return our text as char array ==> we use str.toCharArray() method that will return us char array
        // We can NOT use split method because it will return us string array and we do NOT want string array
        char [] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));     //      [a, 1, b, 2, c, 3]

        // We need to iterate every single index of this array ==> we need a loop ==> for each loop
        // we need to give on R side a data collection = chars, We need to give a variable that represents each element = char each
        int sum = 0; // we create this variable to contain sum of all digits
        for (char each : chars){
            // we can create a boolean expression:
            boolean isDigit = each >= 48 && each <= 57; // on ascii table, the characters between #48 ~ #57 are digits
            if (isDigit){       // This means: if each is digit, we will convert to int and add it to sum
             // to convert char into an int ==> we need to use the parse method -
             // since parse method is used to convert string into numbers ==> we need to convert char into string first ""+each
                sum += Integer.parseInt(""+each);
            }
            }
        System.out.println(sum);

        // ANOTHER WAY TO DO THIS TASK:

        // characters class represents chars
        String str2 = "a1b2c34d";
        char [] chars2 = str2.toCharArray();
        System.out.println(Arrays.toString(chars2));
        int sum2 = 0; // we create this variable to contain sum of all digits
        for (char each2 : chars2){
            if (Character.isDigit((each2))){ // this method identifies is the given character is a digit or not
                sum2 += Integer.parseInt(""+each2);
            }
        }
        System.out.println(sum2);

        boolean a = Character.isAlphabetic('a');  // identifies if the character is alphabet

    }
}
