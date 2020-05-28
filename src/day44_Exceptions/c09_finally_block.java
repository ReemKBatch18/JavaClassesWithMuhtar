package day44_Exceptions;

import java.util.NoSuchElementException;

/*
        finally block :
                * always gets executed regardless of exception was handled or not
                * MUST come after try catch blocks. Can NOT exist by itself => compiler error
       respective order is :
                1. try block
                2. catch block
                3. more catch blocks
                4. finally block (at the end always) DOES NOT HANDLE EXCEPTION BUT EXECUTES ALWAYS
 */
public class c09_finally_block {

    public static void main(String[] args) {

        try {
            System.out.println(9/0);
            System.out.println("try block");
        }catch (Exception e){ // this will handle exception => will print statement : "catch block"
            System.out.println("catch block");
        }finally {  // always gets executed => will print statement : "finally"
            System.out.println("finally");
        }

        // but if we have this scenario:
        try {
            System.out.println(9/0);
            System.out.println("try block");
        }catch (NoSuchElementException e){ // this will NOT handle exception => will NOT print statement : "catch block"
            System.out.println("catch block");
        }finally {  // always gets executed => will print statement : "finally"
            System.out.println("finally");
        }






    }
}
