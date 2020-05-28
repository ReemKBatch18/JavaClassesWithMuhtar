package day44_Exceptions;

import javax.swing.*;

public class c10_task {

    public static void main(String[] args) {
        /*
        print hello
            wait 2 seconds
                print cybertek
                    wait three seconds
                        print java
         */

        System.out.println("hello");
        // how to wait 2 seconds? use thread.sleep()
        // use try catch block to handle the exception in method

        try {

            Thread.sleep(2000);
        }catch (Exception e){

        }

        // print cybertek
        System.out.println("cybertek");
        // to wait 3 seconds:

        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
        //print java
        System.out.println("java");
        try {
            Thread.sleep(4000);
        }catch (Exception e){

        }

        System.out.println("completed");


        // is there any way to group those statement instead of repeating them so many times?? yes create a method
    }
}
