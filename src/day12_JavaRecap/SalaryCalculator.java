package day12_JavaRecap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SalaryCalculator {
    /*
    Ask user to enter salary
    Ask the user to enter full name
    Ask user to enter company name
    ask user to enter SSN
    ask user to enter JobTitle
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

         System.out.println("Enter Company name: ");
        String company = input.nextLine();

        System.out.println("Enter your SSN: ");
        long SSN = input.nextLong();

        input.nextLine();

        System.out.println("Enter your job title: ");
        String jobTitle = input.nextLine();

        System.out.println("Full Name is: "+ fullName);
        System.out.println("Job Title is: "+jobTitle);
        System.out.println("Company Name: "+ company);
        System.out.println("SSN: "+ SSN);
        System.out.println("Salary is: $"+ salary);

    }
}
