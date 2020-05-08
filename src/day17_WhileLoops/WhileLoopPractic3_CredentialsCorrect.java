package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoopPractic3_CredentialsCorrect {
    /* ask user to enter their username and password. if entered wrong ask to enter again until correct credentials entered
    user: cybertek
        pass: cybertek123
     */


    /// This is not working it has bugs



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Username");
        String username = s.next();
        System.out.println("Enter Password");
        String password = s.next();

        boolean valid = (username.equals("cybertek") && password.equals("cybertek123"));

        int count = 1; // this is to count how many times we can try the credentials then user account will be locked

         while (!valid ){
      //  while (!username.equals("cybertek") || !password.equals("cybertek123")){ // or do next line with && and grouping i()
     // while (!(username.equals("cybertek") && password.equals("cybertek123"))){
            System.out.println("Please re-enter your credentials");
            System.out.println("Enter Username");
                username = s.next();
            System.out.println("Enter Password");
                password = s.next();

             valid = (username.equals("cybertek") && password.equals("cybertek123"));
                        // validating new username and passwords. It is the two entered last within the while{}

             count ++; // we place here out of the if statement below

             if (count == 3 && !valid){
                 System.out.println("Your account is locked");
                 break;
             }

        }


         if (valid) {
             // if logged in successfully enter: Logged in
             System.out.println("Logged in");
         }

    }
}
