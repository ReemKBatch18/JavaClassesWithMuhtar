package day10_Switch_Scanner;


import java.util.Scanner;

public class number_scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //object of scanner... now we can use its method

// now we ask the user to enter the first number
        System.out.println("Enter your first number: ");
           int num1 =  scan.nextInt(); // any method we need to call we call it from Scanner variable name 'scan'

        System.out.println("Enter your second number: ");
            int num2 = scan.nextInt();

        System.out.println("Enter your third number: ");
            int num3 = scan.nextInt();

            int max = (num1 >= num2 && num1 >= num3)? num1: (num2 >= num3 && num2 >= num1)?num2:num3;
        System.out.println("Maximum number is: " +max);

           // boolean num1Max = num1 > num2 && num1 > num3;
            // oolean num2Max = num2 > num3 && num2 > num1;

        int min = (num1 <= num2 && num1 <= num3)? num1: (num2 <= num3 && num2 <= num1)?num2:num3;
        System.out.println("Minimum number is: " +min);


    }
}
