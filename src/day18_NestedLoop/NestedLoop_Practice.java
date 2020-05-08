package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoop_Practice {

    public static void main(String[] args) {
        // write a program that will add any two numbers

        Scanner s = new Scanner(System.in);

        while(true) {

            System.out.println("Enter two numbers");
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println("Enter operator");
            String o = s.next();

            if (o.equals("+")) {
                System.out.println("Addition of two numbers: " + (a + b));
            }else if (o.equals("-")){
                System.out.println("Subtraction of two numbers: "+ (a-b));
            }else if (o.equals("*")){
                System.out.println("Multiplication of two numbers: "+ (a * b));
            }else if (o.equals("/")){
                System.out.println("Division of two numbers: "+ (a/b));
            }else if (o.equals("%")){
                System.out.println("Remainder of two numbers: "+ (a%b));
            }
            System.out.println("Do you want to continue?");
            String r = s.next();

                while (! (r.equalsIgnoreCase("yes") || r.equalsIgnoreCase("no")) ) {
                System.out.println("Invalid Entry, Please re-enter yes or no");
                r = s.next();
            }

                if (r.equalsIgnoreCase("no")){
                System.out.println("Thank you for using the calculator");
                break;
            }
        }


/*      Muhtar's:
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));
            System.out.println("Do you want to continue");
            String answer = input.next();
            while(  ! (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("no"))  ){
                System.out.println("Invalid Entry, please re-enter yes or no");
                answer = input.next();
            }


            if(answer.equalsIgnoreCase("No")){
                System.out.println("Thank you for using the calculator");
                break;
            }


        }

*/






    }
}
