package day14_StringClass;
/*4. Ask user to enter a word.
Print "really?"  if the word ends with ly, print "never mind" otherwise.
        Input:        Seriously
        Output:        really?   */

import java.util.Scanner;

public class WordEndsWithLy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();

        if (word.endsWith("ly")){
            System.out.println("really?");
        }else{
            System.out.println("never mind");
        }


    }
}
