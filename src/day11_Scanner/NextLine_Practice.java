package day11_Scanner;

import java.util.Scanner;

public class NextLine_Practice{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 30 + Enter

        System.out.println("Your age is: "+age);

        // we have to add this next line input.nextLine(); in order to
        input.nextLine(); // will take out the Enter that was entered after 30

        System.out.println("Enter your full name:");
        String fullname = input.nextLine();

        System.out.println("Your full name is: "+ fullname);
    }
}
