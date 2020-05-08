package day11_Scanner;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a long number: ");
        long a = scan.nextLong();
        System.out.println("You have entered: " +a);

        System.out.println("Enter a decimal: ");
        float b = scan.nextFloat();
        System.out.println("You have entered: " +b);

        System.out.println("Enter a decimal number: ");
        double f = scan.nextDouble();

        System.out.println("You have entered: "+f);

        System.out.println("Enter true or false");
        boolean l = scan.nextBoolean();
        System.out.println(l);

        System.out.println("Enter your sentence: ");
        String str = scan.next(); // It only accept the first word in the sentence... Today is great --> Today
        System.out.println("You have entered: " +str);



    }
}
