package Tasks.Replits;

import java.util.Scanner;

public class Rep_078_InsuranceQuote_StringMethods {
    public static void main(String[] args) {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your name");
        name = scan.next();
        System.out.println("Do you have a US driver license?");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();

    //    double result= (zipcode ==20910 || zipcode == 20740)?premium+=60:(zipcode==22102||zipcode==22103)?premium+=30:premium+=50;





    }
}
