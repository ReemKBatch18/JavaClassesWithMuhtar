package day12_JavaRecap;

import java.util.Scanner;

public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five numbers");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double num5 = input.nextDouble();

        double sum = 0;

        if (num1>0){
            sum += num1; // we have to use individual if statement not multiple branch where only one is executed
        }
        if (num2>0){
            sum += num1;
        }
        if (num3>0){
            sum += num1;
        }
        if (num4>0){
            sum += num1;
        }
        if (num5>0){
            sum += num1;
        }
        System.out.println("Sum of positive numbers is: " +sum);

        /*
        write a program that asks for 5 numbers.Then put numbers in ascending order like
        1, 3, 5, 4, 2
        output = 1 2 3 4 5
         */

    }

}
