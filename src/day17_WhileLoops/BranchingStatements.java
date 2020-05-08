package day17_WhileLoops;

public class BranchingStatements {

    public static void main(String[] args) {

        // System.exit(0) : as soon as statement is executed it stops the entire system immediately

        for (int i = 0; i <5 ; i++){
            if ( i % 2 != 0){
                 //continue; skips the current iteration of the loop
                // break; it only exits the loop immediately and switch st. But after loop anything can be printed
                System.exit(0);// it exits the whole program. nothing gets printed afterwards even if it's out of loop
            }
            System.out.println(i);
        }

        System.out.println("Test completed");






    }
}
