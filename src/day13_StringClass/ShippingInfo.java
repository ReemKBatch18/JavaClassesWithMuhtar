package day13_StringClass;
/*
 write a program for the shipping info that, the program should ask:
                    building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:
                        ex output:      Ship To:  Jimmy joe
                                        7925 Jones Branch Dr
                                        MCLean, VA 22102*/

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter bldg number");
        String bldg = scan.next();

        System.out.println("Enter street address");
        scan.nextLine();
        String street = scan.nextLine();

        System.out.println("Enter city");
        String city = scan.nextLine();

        System.out.println("Enter state");
        String state = scan.next();

        System.out.println("Enter zip code");
        int zipcode = scan.nextInt();

        System.out.println("Enter Name");
        scan.nextLine();
        String fullName = scan.nextLine();

        /* System.out.println("Ship to: "+fullName);
        System.out.println(bldg+" " +street);
        System.out.println(city+", "+state+" "+zipcode);  */

        String result = "Ship To:  "+fullName+"\n\t\t"+bldg+" "+street+"\n\t\t"+city+", "+state+" "+zipcode;

        System.out.println(result);

    }
}
