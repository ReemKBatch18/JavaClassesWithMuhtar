package day17_WhileLoops;

import java.util.Scanner;

public class WarmUp_ReturnMinimum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min =1999999999;
        for ( int i = 0 ; i<5 ; i++){
            System.out.println("enter a number");
            int num = s.nextInt();
            if ( num < min){
                min = num;
            }
        }
        System.out.println("minimum number is:" +min);
   }
}
