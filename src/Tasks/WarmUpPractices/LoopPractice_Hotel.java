package Tasks.WarmUpPractices;
/*
    Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter
     */
import java.util.Scanner;

public class LoopPractice_Hotel {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int price = 0;

        System.out.println("Welcome to Coders Hotel, best hotel in the area!");
       while (true) {
           System.out.println("Which bedroom do you want to reserve?");
           String room = s.nextLine();

          while  (!(room.equalsIgnoreCase("King") || room.equalsIgnoreCase("Queen") || room.equalsIgnoreCase("Single"))) {
               System.out.println("Invalid entry, please re-enter which bedroom?");
               room = s.nextLine();
           }
           if (room.equalsIgnoreCase("King")) {
               price += 120;
           } else if (room.equalsIgnoreCase("Queen")) {
               price += 100;
           } else if (room.equalsIgnoreCase("Single")) {
               price += 80;
           }

           System.out.println("Do you want to reserve another room?");
           String a = s.nextLine();

           while ( ! ( a.equalsIgnoreCase("no") || a.equalsIgnoreCase("yes") ) ){
               System.out.println("Invalid answer, please answer yes or no");
               a = s.nextLine();

           }
           if (a.equalsIgnoreCase("no")){
               System.out.println("Your total price is: $"+price);
               System.out.println("Thank you for letting us serve you!");
               break;
           }

       }

    }
}
