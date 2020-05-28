package day44_Exceptions;
/*
        unchecked : unexpected ==> only occurs during run time.
 */
public class c02_UncheckedExcep {

    public static void main(String[] args) {

        // this statement will print first then system will find the unchecked exception and will Stop.
        System.out.println("test started");

        // unexpected error: even though printing 9/0 compiles but it won't run ==> arithmetic exception
    //    System.out.println(9/0);
        // when we have such exception like the above, system will not execute what follows like next print statement
    //    System.out.println("Test completed");

        // if  I have a string:
        String str = "cybertek";
        // I try to request printing char at negative number (for index number) ==> unchecked exception
    //    System.out.println(str.charAt(-1));
        // system will not print next print statement
    //    System.out.println("test completed");

        // if we have an int array
        int[] arr = {1,2,3};
        // we try to print an element at index number out of range ==> ArrayIndexOutOfBoundsException
    //    System.out.println(arr[5]);
        // system will not execute next print statement
    //    System.out.println("test completed");

    }
}
