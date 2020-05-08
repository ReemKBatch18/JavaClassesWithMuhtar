package day35_Static;

import OfficeHours.Practice_05_06_2020.ScrumTeam;

public class class08_StudentObjects {
    public static void main(String[] args) {

        Student st1 = new Student();
        System.out.println(st1);    //  Name: null, School Name: Cybertek
        // because school name is static it is the same for all, and it gets printed
        // Whereas the name is an instance variable (now null). It will only get printed after we assign a value to it like this:
        st1.name = "Muhtar";
        System.out.println(st1); // Name: Muhtar, School Name: Cybertek

        Student st2 = new Student();
        st2.name = "Reem";

        // to print out name of school, I can call the printSchoolName() method (static method) from class name Student like this:
        Student.printSchoolName();  //   School name is Cybertek
        // static method is preferred to be called from Class name (Student in our case here)
        // We can still call a static method from our object name (after we create it) but it is always preferred to be called by class name.
    }
}
