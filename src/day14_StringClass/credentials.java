package day14_StringClass;

import java.util.Scanner;
/*
        userName: cybertek
        passWord:cybertekschool
         */
public class credentials {
    public static void main(String[] args) {

        String validUserName = "cybertek";
        String validPassWord = "cybertekschool";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String inputUsername = input.next(); //we can use next() becuase it's one word no spaces
        System.out.println("Enter your password");
        String inputPassword = input.next();

        if (inputUsername.equals(validUserName) && inputPassword.equals(validPassWord)){
            System.out.println("Log in successfully");
        }else{
            System.out.println("Invalid credentials");
        }



    }
}
