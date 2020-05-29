package day45_Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    checked exception occur at complile time. Must be handled automatically
    ClassNotFoundException is a checked exception
    checked exceptions can NOT be thrown manually

    try catch blocks handle exceptions
    in catch block, a variable must be given with the exception class that can handle the exception
    I can pass the exception class or it's super class (parent class)

    we can use multi catch block BUT only one try block (just like if statement - only one if but multiple else if is allowed)
    To Handle exception in multi-catch blocks, either the exception class or it's parent class must be passed
    If we pass any other class that doesn't match what's mentioned above ==> exception will not be handled
    class must be passed first in multiple catch blocks then the parent class
    we can not pass parent class in a catch block before it's child class ==> compile error


 */
public class c09_summaryOfExceptions {
    public static void main(String[] args) {
    //    Thread.sleep(2000);

        try{
            throw new IOException();
        }catch (Exception e){

        }
        System.out.println("Hi");

        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            // or I can pass its super class: IndexOutOfBoundsException class
        }
        System.out.println("complete");


        // if I throw exception: ClassNotFoundException, To handle it through try catch blocks:
        try {
            throw new ClassNotFoundException();
        }catch (ClassNotFoundException e){
            // to be handled, I must pass here a variable from its class or from its super class (like Exception)
        }



        //multi catch blocks
        try{
            throw new NullPointerException();  // here we threw this exception ==> compiler jumps to catch block
        }catch (ArithmeticException a){         // this catch block will NOT handle it --> jumps to next catch block
            System.out.println("Arithmetic");
        }catch (ClassCastException a){          // this catch block will NOT handle it --> jums to next catch block
            System.out.println("cast");
        }catch (NullPointerException a ){       // this catch block will HANDLE it --> prints null pointer
            System.out.println("Null pointer");
        }catch (RuntimeException a){            // NOTHING will happen. If we didn't have null pointer, this exception class will handle it
            // RuntimeException is parent class of NullPoint == that's why it comes after
            System.out.println("runtime");      // This prints only if we didn't have NULL POINTer class to handle it
        }catch (Exception a){                   //  NOTHING will happen. If we didn't have null pointer, and we didn't have Runtime exception, this exception class will handle it
            // Exception is parent of runtime exception == that's why it comes after it
            System.out.println("exception");    // This prints only if we didn't have NULL POINTER and we didn't have RUNTIME classes to handle
        }finally {                              // This will print no matter whether we handle exception or not. IT WILL ALWAYS BE EXECUTED AND PRINTED AT THE END
            System.out.println("finally");
        }

        //WHENEVER WE HAVE A CODE FRAGMENT THAT WE MUST EXECUTE OR GET PRINTED NO MATTER WHAT GOES ON BEFORE IT ===>> MUST USE FINALLY BLOCK
    }


    // let say we have an exception in method1
    // I can use throws keyword to handle it
    public static void method1() throws Exception{
        throw new FileNotFoundException();
    }// disadvantage: every time we need to call method1() somewhere else ==> the calling method must handle the exception

    public static void method2(){
       // we need to handle method1() again when we call here
       // we can either have method2() use throws keyword in its signature and handle exception temporarily
       // or we can use try catch blocks to handle the exception in method1()
        try{
            method1();
        }catch (Exception e){

        }
    }
}
