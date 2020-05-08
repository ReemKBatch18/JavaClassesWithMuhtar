package day35_Static;


import java.sql.SQLOutput;
import java.util.Scanner;

public class class06_staticPractice {
    // when do we use static variable instead of instance?
// I can make the Scanner that I need to call in every method as static like this:
    static Scanner scan = new Scanner(System.in);
    // I can use static variable when I am sure this (static) variable is common and is needed to be used in different methods
    // if the variable I am using is not common ==> I can not use static.
    // static can be called in any method later on.
    // If I need to use different copies of variables (like instance variables ) I can not use static
    // If I only need one copy of a variable ==> use static variable


    public static void main(String[] args) {

        // to ask user to enter two numbers and return their sum, we need the scanner
      //  Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();

        System.out.println("Sum is: " +(num1+num2));

    }

    // but I can also create an instance method that will return me the sum of two numbers:
    public void method(){
    //    Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();

        System.out.println("Multiplication: "+( num1*num2));
    }

}
