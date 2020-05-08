package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArray_ScrumTeam {

    public static void main(String[] args) {

        //                    0   1     2     3
        String[] DevTeam = {"Zi", "Ha", "Ri", "Mu"};
        String[] TestTeam = {"Nw", "Vo", "Al", "Ba"};
        String[] PO = {"Br", "Do"};

        String[][] ScrumTeam = {DevTeam, TestTeam, PO};
        //                          0        1      2

        // to replace a name from DevTeam to another: we do the following:
        ScrumTeam[0][3] = "Je";
        // now Je will replace Mu
        System.out.println(ScrumTeam[0][3]); // Je

        // I need to get the 3rd employee's info from the TestTeam:
        String info = ScrumTeam[1][2];
        System.out.println(info); // Al

        System.out.println("==============================================");

        // we need to print out all developers from devTeam using for each loop:
        for (String eachDeveloper : ScrumTeam[0]) { // this loop will execute 4 times because team is 4 developers
            System.out.println(eachDeveloper);  // Zi Ha Ri Je
        }
        System.out.println("===============================================");

      // To print all testers from testTeam
       for (String eachTester : ScrumTeam[1]) { // this loop will execute 4 times because team is 4 testers
            System.out.println(eachTester);     // Nw Vo Al Ba
        }
        System.out.println("===============================================");

       // to print all POs from PO team
       for (String eachPO : ScrumTeam[2]){ // this loop will execute 2 times because team is 2 POs
            System.out.println(eachPO);         // Br Do
    }

        System.out.println("===============================================");
       // to print the second element in the third 1D array:
       System.out.println(ScrumTeam[2][1]);   // Do

        System.out.println("===============================================");

        //Now if we have a new Testers Team:
        String [] TestTeam2 = {"Am","An","As","Il", "Nu"};
        // Then we assign from ScrumTeam to this one like this:
         ScrumTeam [1] = TestTeam2;
         // This way when we print the testers it will print the new team instead
        for (String eachTester : ScrumTeam[1]) { // this loop will execute 5 times because team is 5 testers
            System.out.println(eachTester);     // Am An As Il Nu
        }






        }

}
