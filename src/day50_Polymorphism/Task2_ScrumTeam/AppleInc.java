package day50_Polymorphism.Task2_ScrumTeam;
/*
6. create a class named AppleInc:
            create 2 Tester' and 3 Developer' objects
            create a list of ScrumTeam and store all Tester's and Developer's objects
   Iterator the list of scrum team to diplay the informations of the full time employees
 */
import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {
    public static void main(String[] args) {

        Tester tester1 = new Tester("ash", 1234,  100000,
                123456,"SDET",true,true);
        Tester tester2 = new Tester ("java", 2132, 99999,
                123454, "SDET",true,true);
        Developer dev1 = new Developer("jay",12,120000,
                12342,"Developer",true,true);
        Developer dev2 = new Developer("jhon",132,124000,
                12372,"Developer",true,true);
        Developer dev3 = new Developer("jina",142,120500,
                12382,"Developer",true,true);

        ArrayList<ScrumTeam> scrumTeam = new ArrayList<>(Arrays.asList(tester1,tester2,dev1,dev2,dev3));

        for(ScrumTeam eachEmployee: scrumTeam){
            System.out.println(eachEmployee);
        }





    }
}
