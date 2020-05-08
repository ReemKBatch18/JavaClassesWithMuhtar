package day17_WhileLoops;

import java.util.Scanner;

public class WarmUp_CalculatorUsingCharAt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i= 0; true ; ) {  // infinite loop  ,  opening culry brace of loop

            System.out.println("Enter first number");
            int num1 = input.nextInt();

            System.out.println("Enter second number");
            int num2 = input.nextInt();

            System.out.println("Math operator: ");
            char operator = input.next().charAt(0);  // +, -, *, /, %

            if (operator == '+') {
                System.out.println("Addition is: " + (num1 + num2));

            } else if (operator == '-') {
                System.out.println("Subtraction is: " + (num1 - num2));

            } else if (operator == '*') {
                System.out.println("Multiplication is: " + (num1 * num2));

            } else if (operator == '/') {
                System.out.println("Division is: " + (num1/num2));

            } else if (operator == '%') {
                System.out.println("remainder is: " + (num1 % num2));

            } else {
                System.out.println("Invalid Operator");

            }

            System.out.println("Do you wanna continue");
            String answer = input.next();

            if(answer.equalsIgnoreCase("no")){  // o0nly exits the loop if the answer is NO
                System.out.println("Thank you for using the calculator");
                break;
            }

        } // closing curly brace of loop




    }
}
