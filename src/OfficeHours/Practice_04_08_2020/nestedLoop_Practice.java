package OfficeHours.Practice_04_08_2020;

public class nestedLoop_Practice {

    public static void main(String[] args) {
        /*
        nested loop: loop inside another loop
                    inner loop and outer loop
                    nested loop: we only need them when we need to
         */
        // if we need to print 10 to 50 we can use loop
        //if we need ot print 10 to 50 five times, we can place first loop in another loop
        // first we work on the inner loop then we work on outer loop and place first inside it

        int j = 5;
        while (j < 10){

            for (int i = 10; i <=50; i +=10){
                System.out.print(i + " ");
            }
            System.out.println();// we place this here to print each inner loop on one line
            j ++;
        }
        System.out.println("===================================");
        /*
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        first we create a loop that would print * 6 times on a straight line
        then we create another loop that would repeat the previous loop 8 times and place first inside it

         */
        for (int b = 1; b <=15 ; b++){
            for (int a = 1; a <=20; a ++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("================================================================");
        /*

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *

         */
for (int i = 0 ; i <7 ; i ++) { // this loop is for repeating top to bottom...

    for (int k = 0; k <= i; k++) { //when i becomes 1, I want to print 1 *
                                    // when i becomes 2 ........
        System.out.print("* ");
    }
    System.out.println();
}

        System.out.println("=============================================================");

for (int a = 8 ; a >0; a --){
    for (int b =0; b < a; b++){
        System.out.print("* ");
    }
    System.out.println();
}
       

    }
}
