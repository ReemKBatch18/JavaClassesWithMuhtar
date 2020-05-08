package day34_CustomClass;

import java.util.ArrayList;

public class ScrumTeam {
    // in the scrumteam ==> we have list of testers and list of developers
   // one atrribute in scrum team:
    ArrayList<Tester> testersTeam = new ArrayList<>();


    // how do we get testers? by hiring them
    // we create a function called hireTester()
    public void hireTester(Tester tester){
        testersTeam.add(tester);
    }

    // sometimes testers get fired
    // we createa a function called fireTester() ... at least I need to know the employyee ID
    // knowing the employee ID, when we call this method, employee will be fired
    public void fireTester(long employeeID){
        testersTeam.removeIf( p -> p.employeeID == employeeID);
    }

}
