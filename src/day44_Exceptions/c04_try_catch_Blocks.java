package day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class c04_try_catch_Blocks {

    public static void main(String[] args) {

        System.out.println("test started");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));


        // first try block ==> then if it doesn't work ==> catch block will handle it
        try{
            System.out.println(list.get(10));       //  IndexOutOfBoundsException ==> I need to handle it using try catch
        }catch(IndexOutOfBoundsException e ){
            // handles the code. But if I give wrong variable like ArithmeticException ==> will not handle
            // I can use the super class of it like: RuntimeException or Exception class ==> will handle
            // we have to declare a variable of this exception - name of class is IndexOutOfBoundException then we give it name e
            // we can print a statement here:
            System.out.println("something went wrong");
        }

        System.out.println("test completed");
    }
}
