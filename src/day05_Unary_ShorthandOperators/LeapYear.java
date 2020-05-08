package day05_Unary_ShorthandOperators;

public class LeapYear {

    public static void main(String[] args) {
/*
1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020
        output:
            2020 is leap year: true
 */
        short year = 2020;
// leapYear: year % 4 ==0
        // if returns true ==> leapYear, if it returns false==> not leap

        boolean leapYear = year % 4 == 0;
    //    System.out.println( year + " is leap year: "+ leapYear);          This is correct.
        String result = year + " is leap year: "+ leapYear;
        System.out.println(result);


    }
}
