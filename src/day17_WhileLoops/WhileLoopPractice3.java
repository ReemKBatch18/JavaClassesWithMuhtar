package day17_WhileLoops;

public class WhileLoopPractice3 {
    public static void main(String[] args) {

        /*
        for (int i = 0 ; i < 100 ; i++){
            System.out.print("*");
        }
   */

        int i = 0;
        while (i < 100){
            System.out.print("*");
            i++;
        } // only what needs to be repeated needs to be in the loop body. Anything else doesn't need to be

        System.out.println(); // we use this empty print statement to break the top one print()

        // drawing rectangle from Replit:
       int number = 3; // or we put number= 0 and in the while we put number <3
        /*
        ***
        * *  the middle ones need to be repeated like this "* *"
        * *
        * *
        ***
         */
        System.out.println("***");//this will be placed at the beginning
        while (number>0){
            System.out.println("* *");
            number--;
        }
        System.out.println("***"); // this is placed at the end








    }
}
