package OfficeHours.Practice_04_22_2020;

public class class_04_ReturnStatement {
    public static void main(String[] args) {
       /*
        if (10>9){
            return;         // it exits the current method  which is here main method. Nothing prints afterwards
        }

        */
        method1();       // even though this has exit method1, only exiting method1. Anything comes after will print
        method2();      // NOTHING  will get printed because this method has System.exit(0); which exits the whole system

        System.out.println("Hello main");
    }

    public static void method1() {
        if (10 > 9) {
            return;         // This only exits method1
        }
        System.out.println("Hello method1");        // this will NOT print because method1 is exited
    }

    public static void method2() {
        if (10 > 9) {
            System.exit(0);         // THIS EXITS THE WHOLE SYSTEM... NOTHING GETS PRINTED AFTERWARDS
        }
        System.out.println("Hello method2");
    }

    //Break statement: exits loop or switch. MUST be used in a loop or switch statement
    // continue: skips the current iteration. MUST be in a loop.
}
