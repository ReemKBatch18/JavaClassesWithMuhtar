package day41_Inheritance.Task01;

public class EmployeeObjects {

    public static void main(String[] args) {
        // here we will create our employee objects : testers, developers, business analysts

        Developer dev1 = new Developer(120000,"Namik",123,"Developer",'M');
        // from dev1: I can only call actions that actually exist in the class Developer
        // I can not call an action from anther class like Tester through object dev1
        dev1.fixingBug();       // Namik is fixing bugs
        System.out.println(dev1); // it will print all info
        // If I need to change how my object dev1 will print ==> I need to fix toString() method from Employee class

        // Now we need to create our tester objects:
        Tester tester1 = new Tester(125000, "Hilal",456,"SDET",'F');

        tester1.reporting();  // Hilal is reporting

        System.out.println(tester1); // will print all Tester info

        //Now we will create our object from businessAnalyst class
        BusinessAnalyst BA1 = new BusinessAnalyst(122000, "Ozgur",789,  'M');
        BA1.writingReq();   //  Ozgur is writing requirements
        BA1.gathering();    //  Ozgur is gathering requirements
        System.out.println(BA1);  // will print all info
        // it will print Job Title : Business Analyst ... we do not have to pass it but we assigned it to be like this



    }
}
