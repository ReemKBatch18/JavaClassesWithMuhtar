package day23_Methods;
/*
step1: Hello Cybertek
step2: Hello World 5 times
step3: Hello Btach 18
step4: Hello World 5 times
step5: Helle Saim
step6: Hello World 5 times
 */
public class C_03_Methods_Practice_Hello_Evens_Odds {
    public static void main(String[] args) {

    // Here we will do it the long way without calling a method
        // step 1:
        System.out.println("Hello Cyberteck");

        //step 2:
        for (int i = 0 ; i < 5 ; i ++){
            System.out.println("Hello World");      // since this is going to be repeated so we can create a method for it
        }

        //step 3:
        System.out.println("Hello Batch 18");

        // step 4:
        for (int i = 0 ; i < 5 ; i ++){
            System.out.println("Hello World");
        }

        //step 5:
        System.out.println("Hello Saim");

        // step 6:
        for (int i = 0 ; i < 5 ; i ++){
            System.out.println("Hello World");
        }

        System.out.println("==============================================================================");

        // now we do same task by calling the method we created  for the above steps:

        // step 1:
        System.out.println("Hello Cyberteck");

        //step 2:
        printHello5();  // This is the method we created and we call to execute here in main method

        //step 3:
        System.out.println("Hello Batch 18");

        // step 4:
        printHello5();

        //step 5:
        System.out.println("Hello Saim");

        // step 6:
        printHello5();


        System.out.println("===================================================================");

        evenNums();     // prints all even nums 1 ~ 100
        oddNums();      // prints all odd nums 1 ~ 100


    }
//Our 1st method we create
    public static void printHello5(){
        for (int i = 0 ; i < 5 ; i ++){
            System.out.println("Hello World");
        }
    }
// Our 2nd method we create: print even number between 1~100
    public static void evenNums (){
        for (int i = 1 ; i <= 100; i++){
            if (i % 2 == 0 ){
                System.out.print(i + " ");
            }
        }
    }

// our 3rd method we create: print odd number between 1~100
    public static void oddNums (){
       for (int i = 1 ; i <= 100; i++){
             if (i % 2 != 0 ){
            System.out.print(i + " ");
            }
            }
        }
}
