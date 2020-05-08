package day24_Methods;

import java.util.Scanner;
import java.util.concurrent.Callable;

/*
1. write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20
2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, '*') ==> 20;
			calculate(10, 2, '&') ==> Invalid operator
			NOTE: The method MUST take three arguments when it's called
 */
public class C_02_WarmUps_MethodsPractice2_MaxOf2_Calculator {

        // Task 1. Max number: We need to pass two parameters in this method: int num1, int num2
    public static void Max (int num1, int num2) {
        if(num1>=num2){
            System.out.println("Maximum number is: "+num1);
        }else{
            System.out.println("Maximum number is: "+num2);
        }
        System.out.println("===================================================================");

    }

    public static void Calculation (double num1, double num2, char operator){
    //Task 2. Calculation: We need to pass 3 parameters here: num1, num2, operator

        switch (operator){  // operator is a char variable ==> all cases MUST be chars
            //case has to be char just like switch
            case '+':
                System.out.println(num1+num2);
                break;          // we have to add break after each so it doesn't continue to next
            case '-':
                System.out.println(num1 - num2);
                break;
            case'*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case'%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid");

                System.out.println("==============================================================");
        }

    }
// HERE IS OUR MAIN METHOD WHERE WE CAN CALL OTHER METHODS
    public static void main(String[] args) {

        int a = 1000;
        int b = 200;
        // we will use the Max method we created
        // we can either use new numbers we assign (even though they are int they can be assigned to double)
        Max(a,b);   // 1000
        // or we can call it like this:
        Max(317,45); // 317



 // This is the Calculation method we created

        Calculation(10,20,'*');

        Calculation(30,40,'+');

        // we can use other numbers that we assign like this:
        int n1 = 10000;
        int n2 = 100;
        Calculation(n1, n2, '/');


        // we apply loop here to repeat those steps using a scanner
        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter num1: ");
            int num1 = scan.nextInt();
            System.out.println("Enter num2: ");
            int num2 = scan.nextInt();
            System.out.println("Enter operator");
            // because there is no char in Scanner so we add String next() then we call first index
            char operator = scan.next().charAt(0);  //scan.next().charAt() ==> returns us char==> assign to char variable
            Calculation(num1, num2, operator); // result of calculation
            System.out.println("Do you want to continue?");
            String answer = scan.next();

            // we have to create another loop inside our loop to make sure it only repeats if answer is Yes or no ==>
            // ==> we need to keep asking using to re-enter if answer does not equal yes or no
            while ( ! (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid Entry, Please re-enter yes or no:");
                System.out.println("Do you want to continue?");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("No")){
                break;
            }
        }


    }
}
