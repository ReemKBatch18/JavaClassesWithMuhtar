package day23_Methods;

import java.util.Scanner;

public class C_04_Methods_WithParameters_EligibleAge {
    public static void main(String[] args) {

        // we will use scanner here :
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = scan.nextByte();

        EligibleToBuyAlcohol(age);   // The data of the parameter we pass MUST match with created method
        // we can use casting if we need too ... (int) ... (float)



    }

    // Here we create a method called: EligibleToBuyAlcohol to use in main method
    // But we use a variable as parameter to use later
    public static void EligibleToBuyAlcohol(byte age ){  // we pass: byte age as the parameter to call it later
        // parameter can be any data type
        if ( age >= 21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy alcohol");
        }
    }


}

