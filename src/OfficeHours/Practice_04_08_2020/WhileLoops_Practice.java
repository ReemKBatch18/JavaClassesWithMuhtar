package OfficeHours.Practice_04_08_2020;

public class WhileLoops_Practice {
    public static void main(String[] args) {
/*
            while(Condition){
                    statements
            }
            repeated if statement
            execution order:
                1. condition
                    if true: executes statements
                    if false: stops the loop
         */
 //whenever we have to repeat statement that only needs condition but no initialization, we use while loop

 for (int i = 0 ; i < 5 ; i ++){
     System.out.println("Hello"+ i); // will print Hello 5 times 0 1 2 3 4
 }
        System.out.println("========================================");

 int z = 0;
 while (z < 5){
     z++;           // will increase to 1 first
     System.out.println("Hello "+z); // then prints Hello 5 times with 1 2 3 4 5
 }        // if we move z++ to here, it will print Hello 5 times with  0 1 2 3 4

        System.out.println("=======================================");

 // print all numbers 0 ~ 100 divisible by 3 and 5
        int j = 0;
        while (j <= 100){
            if (j % 3 ==0 && j % 5== 0 ) {
                System.out.print(j + " ");
            }
            j ++;
        }








    }
}
