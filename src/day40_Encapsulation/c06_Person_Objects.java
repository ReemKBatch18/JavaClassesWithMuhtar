package day40_Encapsulation;

public class c06_Person_Objects {
    // here we will create our Person objects from c05_Person class:

    public static void main(String[] args) {

        c05_Person Zarina = new c05_Person("Zarina");

        // now through the object name ==> I can get the name (public instance variable)
        System.out.println(Zarina.name);

     //   System.out.println(Zarina.SSN); SSN: is private instance variable = compiler error
        //   private: no direct access: I need getter and setter to call it through the object

        // after generating my getter, I can call it through my object: Zarina
        System.out.println("Zarina's SSN: "+Zarina.getSSN()); //Zarina's SSN: 0, SSN is 0 because we have not set info yet

        // after generating my setter, I can call it through my object:
        Zarina.setSSN(123456);
        System.out.println("Zarina's SSN: "+Zarina.getSSN()); // Zarina's SSN: 123456


        // now we will set the ID
        Zarina.setID(567);
        System.out.println("Zarina's ID: "+Zarina.getID());




    }
}
