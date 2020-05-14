package day39_AccessModifiers;

public class c06_CheckInfo {

    public static void main(String[] args) {

        // here we will check calling our variables that were created in c05_PersonalInfo:
        System.out.println("Name: "+c05_PersonalInfo.name);
        System.out.println("Gender: "+c05_PersonalInfo.gender);
        System.out.println("Grade: "+c05_PersonalInfo.grade);
    //    System.out.println("SSN: "+c05_PersonalInfo.SSN); // private
    //    System.out.println("ID: "+c05_PersonalInfo.ID); // private
        System.out.println("Age: "+c05_PersonalInfo.age);

        // we will create objects here then try to call the STATIC variable through the object vs through the class
        c05_PersonalInfo obj = new c05_PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);

        System.out.println(obj.grade);
        System.out.println(obj.age);

    //    System.out.println(obj.SSN); // private
    //    System.out.println(obj.ID); // private

    }
}
