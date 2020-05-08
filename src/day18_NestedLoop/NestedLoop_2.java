package day18_NestedLoop;

public class NestedLoop_2 {

    public static void main(String[] args) {
            /*
             *
             * *
             * * *
             * * * *
             * * * * *
             * * * * * *
             * * * * * * *
             * * * * * * * *
             * * * * * * * * *
             */
        // first we create a loop that will repeat for how many lines
        // after printing each line I need to give one empty print statement to break the line
        // to repeat the first step for how many * in each line I need to put in a loop that will run for that number of times
        // but this will give me a rectangle or square
        // but I want to print one * first line... then 2 * on the second line then 3* on the 3rd line..
        // so when j value is 1 it should print *, when j value is 2 it should print ** ....
        // that's why I put in the inner loop(i = 1; i <= j ; i ++)

        for(int j= 1; j <= 9; j++){

            for(int i =1; i <= j; i++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("=======================================================");
        /*
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        for(int j= 9; j >= 0; j-- ){

            for(int i =1; i <= j; i++){
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("============================");

        /*
            a
            a b
            a b c
            a b c d
            a b c d e
            ......
            a  .......     z
         */

        for(char z = 'a'; z <= 'z'; z++){

            for(char ch ='a'; ch <= z ; ch++ ){  //  'a' >= 'a'
                System.out.print(ch+" ");
            }
            System.out.println();


        }

        System.out.println("=======================================");

        for(char z = 'z'; z >= 'a'; z--){

            for(char ch ='a'; ch <= z ; ch++ ){  //  'a' >= 'a'
                System.out.print(ch+" ");
            }
            System.out.println();


        }









    }

}
