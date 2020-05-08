package day20_ArraysContinue;

import java.util.Scanner;

public class WarmUp_Months {
    public static void main(String[] args) {
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
                         // 0       1   2       3   4       5   6       7   8       9   10      11
        //Or we do the following method:
        //String[] months2 = new String[12];    // here we created a String array , length of array is 12.
        // Then assign months to indexes starting from index 0 like this:
        // months2[0] = "Jan";
        // months2[1] = "Feb";
        // months2[2] = "Mar"; ...... etc

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();

        int attempts = 1;

        while (num>12 || num <= 0){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num = s.nextInt(); // between 1 - 12
            attempts++;
            if (attempts == 3 && (num>12 || num <= 0)){
                System.out.println("Invalid Entry, you already had 3 attempts");
                System.exit(0);
            }
        }
        String result = months[num-1]; // index number, index number starts from 0 always

        System.out.println(result);





    }
}
