package day11_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        /*
        2. write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
         */

        Scanner input= new Scanner(System.in);// this is how we create the scanner object in order to use methods
        // we call methods through that scanner variable name input
        // now we print the order or the message
        System.out.println("Enter your salary: ");
        int salary = input.nextInt();
        //we need to get the user input to enter salary.. we call the method from scanner variable name

        //ask employee to enter state tax then federal tax
        System.out.println("Enter the state tax rate: ");
        byte stateTax = input.nextByte();
        double stateTaxPercentage = stateTax /100.0; // because we havent learned yet the double method

        System.out.println("Enter the federal tax rate: ");
        byte federalTax = input.nextByte();
        double federalTaxPercentage = federalTax / 100.0;

        //totalTax = (federalTaxPercentage + stateTaxPercentage) * Salary
        double totalTax = (federalTaxPercentage + stateTaxPercentage) * salary;

        //salaryAfterTax = salary - totalTax
        double salaryAfterTax = salary - totalTax;
        System.out.println("Your Salary after tax is: "+ salaryAfterTax);
        System.out.println("Total taxes you paid are: " +totalTax);







    }
}
