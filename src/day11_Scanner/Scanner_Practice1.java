package day11_Scanner;
/*
Task: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employeeed status:
        salary:
 */
import sun.security.x509.InvalidityDateExtension;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner_Practice1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scan.next();

        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        String fullName = firstName + " "+ lastName;

        System.out.println("Are you employed?");
        boolean emplStatus = scan.nextBoolean();

        double salary = 0;
        if (emplStatus==true){
            System.out.println("Enter your salary: ");
            salary = scan.nextDouble();
        }else{         // we dont' need this block becuase we stated upfront that it is 0 if the if statement is false
            salary = 0;
        }





        System.out.println("Full name is: " +fullName);
        System.out.println("Employed: "+emplStatus);
        System.out.println("Salary: $"+salary);
    }
}
