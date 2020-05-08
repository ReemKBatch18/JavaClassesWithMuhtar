package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {
    // we have multiple testers and multiple developers
    // Best is to use ArrayList to be able to remove and add
    /* Attributes:
            ArrayList<Tester>
            ArrayList<Developers>
       Actions:
       we need to be able to fire and hire testers or developers
            hireTester(Tester tester): the given tester must be added in the arrayList of tester
            fireTester(ID): Whichever tester's ID matches with the argument, the tester will be removed from the arrayList

     */
    // Attributes of the ScrumTeam class are testers and developers:
    // we can create arrayLists for each to be able to hire and fire from lists
    // dataType of arrayList will be <Tester> first then <Developer>
    ArrayList<Tester> testersTeam = new ArrayList<>();
    ArrayList<Developer> devpTeam = new ArrayList<>();


    // first action we are creating: hireATester() method like this:
    public void hireATester(Tester tester){
        // whatever I pass in parameter I need to make sure it can be added to ArrayList testersTeam
        // I can use add method to add this tester to the array list
        testersTeam.add(tester);
        // this function is now done
    }

    // another function is called fireATester() method we need to use when we need to fire some tester from team:
    public void fireATester(long id){
        // how can I remove the tester that has the id matching with the one I'm passing in the parameter?
        // I need a condition ==> I can use a predicate to remove like this:
        testersTeam.removeIf(p -> p.employeeID == id);
        // this predicate will remove the tester with employee ID matching to the one I'm passing in the parameter
        // this removeIf() method will iterate through the whole list and removes what's matching the condition
        // that's why I don 't need to use a loop when I use the removeIf() method
    }

    // here we will create another function to hire developers like this:
    public void hireADeveloper(Developer developer){
        // which method to use to add this developer that I pass in argument to the ArrayList devpTeam I created as an attribute in this class?
        // I can use add() method to add developer
        devpTeam.add(developer);
    }

    // here I will create the function of firing a developer and removing the developer from the ArrayList devpTeam we created
    // we will pass ID of developer in the parameter here
    public void fireADeveloper(long id){
        devpTeam.removeIf(eachDev -> eachDev.employeeID == id);
        // this predicate will remove any developer with an ID matching the one we pass in the parameter of our method
    }




}
