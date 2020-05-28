package day44_Exceptions;
/*
        checked  : unwanted event ==> occurs during compile time. Must be handled immediately

 */
public class c03_CheckedExcep {

    public static void main(String[] args) {

        System.out.println("test started");
        // I will call sleep() method from class Thread (from java.lang package)
        // it will say: Unhandled exception : java.lang.InterruptedException
        //Error:(13, 21) java: unreported exception java.lang.InterruptedException; must be caught or declared to be thrown
        // those exceptions must be handled immediately.
        // System will NOT even print first print statement "test started" like it did in unchecked excep

    //    Thread.sleep(3000);

        System.out.println("completed");
    }

}
