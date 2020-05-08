package day24_Methods;

import java.util.Scanner;
// Task. Create a method to calculate age after entering the current year
// we need the birth year as a parameter
public class C_04_MethodsPractice_Age_BirthYear {

    public static void Age(int birthYear){  //2000
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current year");
        int currentYear = scan.nextInt();

        int age = currentYear - birthYear;

        if(age > 0 && birthYear > 1900 ) {
            System.out.println(age);
        }else{
            System.out.println("Invalid birth year");
        }

    }

    public static void main(String[] args) {


        Age( 2000 );

    }




}