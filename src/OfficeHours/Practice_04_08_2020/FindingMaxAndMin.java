package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class FindingMaxAndMin {

    public static void main(String[] args) {

        // create program to ask use to enter number 3 times and then find max and min numbers
        // since it's asking to repeat entering the number for 3 times, we can create a loop that will repeat 3 times

        Scanner s = new Scanner(System.in);

        int max = -2147483648;
        int min = 214748367;


        int i = 1;
        while (i <= 3){ // we can increase this to 5, if we want to try with 5 numbers
            System.out.println("Enter a number");
            int num = s.nextInt();
            if (num > max){ //whichever user input is larger will be assigned to max
                max = num;
            }

            if (num < min){ // whichever user input is smaller will be assigned to min
                min = num;
            }
            i ++;
        }

        System.out.println("Maximum number is: "+ max);
        System.out.println("Minimum number is: "+ min);









    }
}
