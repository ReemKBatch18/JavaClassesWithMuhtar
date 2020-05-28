package day44_Exceptions;

public class c11_task2 {

    // should I declare my method as static or instance?
    // creating as static easier ==> we can call through class name
    // instance method ==> I will have to create an object to call it
    public static void waits(double seconds){
        try{
            Thread.sleep((long) seconds * 1000);
        }catch (Exception e){

        }
    }

    //this is my main method to try waits() method
    public static void main(String[] args) {
        System.out.println("java");
        waits(3);
        System.out.println("cybertek");


        // when you automate ==> process is very fast
        // in that time => you need some sort of method to stop executing the threads so you can follow the automation steps easier
        // Thread.sleep() method : makes the current execution to wait for specific amount of time.
        // every time when we use it gives compiler error..
        // imagine we need to use it at 10 places...==> we can create a method to call it and handle the checked error immediately
        // calling Thread.sleep() will make execution wait for the time we insert as a parameter




    }
}
