package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //21 Pershing Blvd, Whitehall PA, 18052
        //fullAddress: Bldg# Street, City, State, zipcode

        System.out.println("Building Number: ");
        int Bnumber = input.nextInt(); // 21Enter



        input.nextLine(); // to take out the Enter from previous line from Scanner
        System.out.println("Street: ");
        String street = input.nextLine();



        System.out.println("Enter the zip code: ");

        int zipCode = input.nextInt(); // 18052Enter

        input.nextLine();

        System.out.println("enter the city name and state separated by comma and space");
        String cityState = input.nextLine();

        String fullAddress = Bnumber + " " +street +", \n"+cityState+ " " + zipCode;
        System.out.println(fullAddress);

        input.close();
    }
}
