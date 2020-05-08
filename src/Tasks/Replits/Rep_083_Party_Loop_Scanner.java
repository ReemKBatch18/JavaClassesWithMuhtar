package Tasks.Replits;


import java.util.Scanner;

public class Rep_083_Party_Loop_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        String guest = "";
        String guestList ="";

        for ( i=0; i==0;) {

            System.out.println("Please enter guest name:");
            guest= input.next();
            guestList += guest + ", ";


            System.out.println("Do you want to enter new guest name:");
            String answer = input.next();

           if(answer.equalsIgnoreCase("no") ){

               System.out.println("Guest's list: " +guestList.substring(0,guestList.length()-2));
                break;
            }
        }






    }
}
