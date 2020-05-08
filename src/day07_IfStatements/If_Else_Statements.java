package day07_IfStatements;

public class If_Else_Statements {
    public static void main(String[] args) {
        int number = -401;
        if (number % 2 == 0){
            System.out.println(number + " is even number");
        }
        if (number % 2!=0){
            System.out.println(number + " is odd number");
        }
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        }
        else {
            System.out.println(number+ " is odd number");
        }

        System.out.println("======================================================================");

        //sell alcohol
        int age =10;
        if (age >= 21){
            System.out.println("Here is your Vodka");
        } else {
            System.out.println("Go home kid");
        }

        System.out.println("====================================================================");

        boolean testedPositiveForCorona = false;
        if (testedPositiveForCorona){
            System.out.println("Buy more toilet papers and stay home");
        } else {
            System.out.println("Do more coding");
        }
    }
}
