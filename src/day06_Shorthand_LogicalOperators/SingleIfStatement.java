package day06_Shorthand_LogicalOperators;

public class SingleIfStatement {
    public static void main(String[] args) {
        boolean coldWeather = true;
        if (coldWeather) {
            //true
            System.out.println("put on your coat, gloves, and hat");

        }

        int a = 100;
        boolean evenNumber = a % 2 ==0; // if a number can be divided by 2 with 0 remainder
        if (evenNumber) {
            System.out.println(a + " is even number");
            // if we use 101 instead of 100 it will not print anything
        boolean oddNumber = a % 2 !=0; // if the number cannot be devided by 2 evenly
        if (oddNumber) {
            System.out.println(a+ " is odd number"); // if we change number to 101
        }
        }
    }





}
