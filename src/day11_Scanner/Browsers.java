package day11_Scanner;
/*
         write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task
         */
//That means we need to use the switch statement.. we can't put boolean expression
public class Browsers {

    public static void main(String[] args) {

        String browserName = "Chrome";

        switch (browserName){

            case "chrome": //case value must match with switch statement expression which is a string here
            case "Chrome":
                System.out.println("Chrome is opening...");
                break;

            case "firefox":
            case "Firefox":
                System.out.println("Firefox is opening...");
                break;

            case "Safari":
                System.out.println("Safari is opening...");
                break;

            case "Opera":
                System.out.println("Opera is opening...");
                break;

            default:
                System.out.println("Invalid Browser name, Please give the right browser name");
                break; // we can put break; here and we can ignore putting it because it is the last one



        }









    }
}
