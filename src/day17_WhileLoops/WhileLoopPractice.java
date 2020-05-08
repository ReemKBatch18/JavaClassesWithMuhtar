package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        /* Ask user to enter yes or no,
        if the user enters other than yes or no, repeat the previous step
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Yes or No");
        String word = input.next();
        boolean valid = word.equalsIgnoreCase("Yes") || word.equalsIgnoreCase("no");

        while (!valid ) { // while the input is not yes or no, repeat the question
            System.out.println("please re-enter");
            word = input.next();
            if(word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no")){
                break;
            }
        }
        if (word.equalsIgnoreCase("Yes")){
            System.out.println("Entered yes");
        }
        if (word.equalsIgnoreCase("no")){
            System.out.println("Entered No");
        }





    }
    }
