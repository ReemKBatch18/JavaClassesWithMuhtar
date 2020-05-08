package OfficeHours.Practice_05_06_2020;

import RESOURCES.Test;

public class class02_TestersObjects {
    public static void main(String[] args) {

        // to create my object ==> the data type I need to use is Tester . NOT int or String or any other data type
        Tester tester1 = new Tester();
        System.out.println(tester1); // now this will give me a hash code becuase I have not specified the toString() method
        // after we create the toString method: we will not get any values yet becuase we have not initialized any value yet
        // Name: null, job title: null, salary: $0.0, ID: 0

        // One way to initialize the info of my object is like this:
        tester1.name = "Muhtar";
        tester1.jobTitle = "SDET";
        tester1.salary= 90000;
        tester1.employeeID = 123456;
        // now if we print tester1 we will get the values printed
        System.out.println(tester1); // Name: Muhtar, job title: SDET, salary: $90000.0, ID: 123456

        // now we will create our 2nd object from same class Tester like this:
        Tester tester2 = new Tester();
        // 2nd way to initialize the info for my object is by calling the setInfo() method like this:
        tester2.setInfo("Onur", "Junior SDET",100000, 1234);

        // if I print tester2 now , I will get his info printed like this
        System.out.println(tester2); // Name: Onur, job title: Junior SDET, salary: $100000.0, ID: 1234


        // now we will call the method smokeTesting() like this:
        tester1.smokeTesting();     //  Muhtar is doing smoke testing
        tester2.smokeTesting();     //  Onur is doing smoke testing

        // now we will call creatingTicket() method like this:
        tester2.creatingTicket();       //  Onur is creating ticket on Jira

    }
}
