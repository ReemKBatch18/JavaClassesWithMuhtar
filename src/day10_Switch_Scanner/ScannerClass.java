package day10_Switch_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;    // this is the import statement.. we put between package and class name

public class ScannerClass {

    public static void main(String[] args) {
        //Scanner variableName = new Scanner(System.in);

        Scanner input = new Scanner(System.in); //it's important to give imp statement at top or it's error

        System.out.println("Enter byte number: ");
        byte num1 = input.nextByte();

        System.out.println("You have entered " +num1);// once I enter a number it will print the same

        if(num1%2 == 0){
            System.out.println(num1 + " is even number");
        }else{
            System.out.println(num1+ " is odd number");
        }







    }

}
