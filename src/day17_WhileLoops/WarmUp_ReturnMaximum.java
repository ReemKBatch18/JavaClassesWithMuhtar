package day17_WhileLoops;

import java.util.Scanner;

public class WarmUp_ReturnMaximum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = -1999999999;   // any number that user provides will be greater than this number
                // first user entered variable will be initialized to max
        for (int i=0 ; i<5 ; i++){
            System.out.println("enter a number");
            int num = s.nextInt();
            if (num > max){ // to compare each user inputs, and assign the max number to max
                max = num;
            }

        }
        System.out.println("Max number is: " + max);















    }
}
