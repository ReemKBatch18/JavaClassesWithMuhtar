package day45_Exceptions;

import sun.management.snmp.jvminstr.JvmMemPoolEntryImpl;

public class c02_throwsKeyword {

    // I need to use Thread.sleep to wait 2 seconds..
    public static void sleep1(){
        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }
    //Advantage of using try catch blocks: whenever we use try and catch ==> exception is completely handled
    }
    // if we try to use this Thread.sleep without the try catch blocks ==>
    // ==> it has checked error that needs to be handled immediately
    // if we don't want to it with catch block and Exception class we can do the following:
    // we have another way to handle it - cheaper way:
    // we can use 'throws' keyword after the method's name..
    // then throw the Exception needed right after the word 'throws' like this:
    // we can know name of exception if we bring mouse close to the word with red line under it
    // this one's exception class is InterruptedException so:

    public static void sleep2() throws InterruptedException{ // 'throws' keyword handled the exception
        Thread.sleep(3000);
    }


    // But the thing is: whenever we use the throws key word ==> we have to use ==>
    // ==> we have to use throws keyword again if we call method somewhere else like the following example
    // so the calling method of sleep method (main method in our case) MUST throw exception
    // 'throws' keyword MUST BE USED IN THE METHOD'S SIGNATURE not in the body
    public static void main(String[] args) throws InterruptedException{

        System.out.println("Cyber");
        sleep2();           // if main method doesn't throw exception like above this will give compiler error
        System.out.println("java");
        // Disadvantage of throws key word ==> the CALLER of the method MUST handle exception by throwing exception
        // So if we needed to call main method somewhere else ==> calling method must throw exception again
    }
    public static void method1() throws Exception{ // calling method needs to throw exception
        String [] arr = {"a"};
        main(arr);
    }
    // TRY CATCH way helps to handle the exception completely. No need to repeat every time it's called
    // like the following example:
    public static void method2(){
        try {
            method1();
        }catch(Exception e){

        }
    }

    public static void method3(){

        method2();
    }
}
