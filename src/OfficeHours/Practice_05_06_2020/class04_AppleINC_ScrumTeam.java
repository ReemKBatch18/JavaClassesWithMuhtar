package OfficeHours.Practice_05_06_2020;

import java.util.Arrays;

public class class04_AppleINC_ScrumTeam {
    public static void main(String[] args) {
        // we have created an arrayList of testers in the ScrumTeam class. We don't add this arrayList here
        // here we can hire testers by calling hireATester()method ==> they will be added to ArrayList in ScrumTeam class

        Tester tester1 = new Tester();
        tester1.setInfo("Onur","Junior Tester",75000,12345);
        Tester tester2 = new Tester();
       tester2.setInfo("Elton John","Junior Tester",75000,12045);
        Tester tester3 = new Tester();
        tester3.setInfo("Rahman","SDET",120000,22222);

        // now can I create the ScrumTeam object in this class? yes I can...like this
        // I have testers team in my ScrumTeam
        // how can I hire those tester in my ScrumTeam? I call the hireATester () method like this
        // after I pass the tester in the parameter, they will be added into the ArrayList testers I created in my ScrumTeam

        ScrumTeam scrum1 = new ScrumTeam(); // we can use the arrayLists in scrumteam class. scrum1 is an object created from class ScrumTeam
        // every time we call this function the tester we hire will be added to the ArrayList
        scrum1.hireATester(tester3);
        scrum1.hireATester(tester1);
        scrum1.hireATester(tester2);

        // when I call the fireATester() method, I need to pass the id of the tester in the parameter
        scrum1.fireATester(12045); // tester with this ID will be removed from ArrayList of testers
        // If ID we pass in parameter doesn't match with any ID of testers ==> no tester will be removed from Arraylist

        // scrum1.testersTeam : returns the testersTeam ArrayList from scrum1
        // can I apply for each loop to print out every single tester from the scrumTeam
        for (Tester each: scrum1.testersTeam){// this prints out every single tester form scrumTeam
            System.out.println(each);
        }
        System.out.println("===================================================");

        // in order to use this instance variable devpTeam from the class ==>
        // ==> I need to call it from the object scrum1 like this : System.out.println(scrum1.devpTeam.size());

        Developer dev1 = new Developer();
        dev1.setInfo("Barzy","Senior Developer",220200,11223);

        Developer dev2 = new Developer();
        dev2.setInfo("Emrah", "Usta Developer", 130000,22323);


        // how can I hire this dev1 into the scrumTeam? I can call hire() function like this
        scrum1.hireADeveloper(dev1);
        // to hire dev2 ==> call hire() function from our object scrum1 like this
        scrum1.hireADeveloper(dev2);

        // I will create a loop to print out every single developer from this ArrayList
        // ArrayList of Developers in scrum team is : scrum1.devpTeam ==> this goes on the right of for each loop
        // Developer each : goes on the left of my for each loop to represent each developer in my arrayList
        for (Developer each: scrum1.devpTeam){
            System.out.println(each); // will print all my developers
        }

        // If I fire a developer:
        scrum1.fireADeveloper(11223);
        // then if we run our loop:
        for (Developer each: scrum1.devpTeam){
            System.out.println(each); // will print all my developers without who got fired
        }

        System.out.println("===================================================");

        // How can I print how many testers and developers in my team?
        // scrum1.testersTeam.size() = how many testers we have in scrum team
        // scrum1.devpTeam.size() = how many developers we have in our scrum team

        System.out.println("In my scrum team, we have "+scrum1.testersTeam.size()
                + " testers and "+ scrum1.devpTeam.size()+" developers");
        //In my scrum team, we have 2 testers and 1 developers

     System.out.println("======================================================");
        /*
        create scrum2 : 4 developers, 2 testers
        create scrum3 : 5 developers, 3 testers
        create an array of scrum {scrum1, scrum2, scrum3};
            1. iterate the array to print out all testers who have salary > 120000
            2. print out all developers who have salary <120000

        create an ArrayList of scrum: {scrum1, scrum2, scrum3};
            1. remove all testers whose salary <100000
            2. remove all developers with salary <120000

        note: Do not create any ARrayList of testers or developers
                Use ArrayList in scrum class only

         */
        Tester tester4 = new Tester();
        tester4.setInfo("Omar","Junior Tester",85000,23451);
        Tester tester5 = new Tester();
        tester5.setInfo("Ash","SDET",120000,45123);
        Tester tester6 = new Tester();
        tester6.setInfo("Sam","Junior Tester",100000,51234);
        Tester tester7 = new Tester();
        tester7.setInfo("Bill","SDET",115000,12245);
        Tester tester8 = new Tester();
        tester8.setInfo("Will","Junior Tester",80000,55555);

        Developer dev3 = new Developer();
        dev3.setInfo("Ramzy","Senior Developer",200200,10223);
        Developer dev4 = new Developer();
        dev4.setInfo("Don","Senior Developer",120200,11023);
        Developer dev5 = new Developer();
        dev5.setInfo("John","Senior Developer",130200,11203);
        Developer dev6 = new Developer();
        dev6.setInfo("Jim","Senior Developer",100200,11220);
        Developer dev7 = new Developer();
        dev7.setInfo("Jack","Senior Developer",100500,12223);
        Developer dev8 = new Developer();
        dev8.setInfo("Jill","Senior Developer",240200,12222);
        Developer dev9 = new Developer();
        dev9.setInfo("Jana","Senior Developer",150000,13333);
        Developer dev10 = new Developer();
        dev10.setInfo("Lea","Senior Developer",200000,11111);
        Developer dev11 = new Developer();
        dev11.setInfo("Jess","Senior Developer",100200,11222);

        ScrumTeam scrum2 = new ScrumTeam();
        scrum2.hireADeveloper(dev3);
        scrum2.hireADeveloper(dev4);
        scrum2.hireADeveloper(dev5);
        scrum2.hireADeveloper(dev6);
        scrum2.hireATester(tester4);
        scrum2.hireATester(tester5);


        ScrumTeam scrum3 = new ScrumTeam();
        scrum3.hireADeveloper(dev7);
        scrum3.hireADeveloper(dev8);
        scrum3.hireADeveloper(dev9);
        scrum3.hireADeveloper(dev10);
        scrum3.hireADeveloper(dev11);
        scrum3.hireATester(tester6);
        scrum3.hireATester(tester7);
        scrum3.hireATester(tester8);

     System.out.println(scrum2);
/*
 1. iterate the array to print out all testers who have salary > 120000
 2. print out all developers who have salary <120000
 */
        ScrumTeam[] arr = {scrum1,scrum2,scrum3};
        for (int i = 0 ; i < arr.length ; i++){
         for (Tester each: arr[i].testersTeam){
          if (each.salary > 120000){
           System.out.println(each);
          }
         }
        }















    }
}
