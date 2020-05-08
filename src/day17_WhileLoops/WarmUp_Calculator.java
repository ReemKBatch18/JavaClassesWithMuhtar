package day17_WhileLoops;


import java.util.Scanner;

/* 4.	write a program that can calculate the two numbers based on the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)
						then the system will give the result based on the operator
						then the system will give the result based on the operator
						at the end it will ask if the user want's to calculate another numbers, if user
						entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
								(you will need a lop that has true condition without the iterator) */
public class WarmUp_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        for ( int i = 0 ; i == 0; ) { // we do this to be any true condition to make sure loop will execute it over and over
        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        System.out.println("Math operator: ");
        // we can't call char through scanner that's why we use String then call charAt(0)
        // char operator = input.next().charAt(0);
        // we can use String but we decided to use char because an operator is a single character
        String operator = input.next(); // +, -, *, /, %


            if (operator.equals("+")) {
                System.out.println("Addition is: " + (num1 + num2));
            } else if (operator.equals("-")) {
                System.out.println("Subtraction is: " + (num1 - num2));
            } else if (operator.equals("*")) {
                System.out.println(("Multiplication is: ") + (num1 * num2));
            } else if (operator.equals("/")) {
                System.out.println("Division is: " + (num1 / num2));
            } else if (operator.equals("%")) {
                System.out.println("Remainder is: " + (num1 % num2));
            } else {
                System.out.println("Invalid Operator");
            }
            System.out.println("Do you want to continue?");
            //if answer is yes, we need to repeat all steps over and over again... that's why we need loop
            // if answer is no, we need to stop.
            String answer = input.next();
            if (answer.equalsIgnoreCase("no")){ // we create this condition to be able to exit if answer is no
                System.out.println("Thank you for using the calculator.");
                break;
            }
        } // closing curly brace of loop








    }
}
