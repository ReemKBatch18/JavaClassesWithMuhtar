package day37_Constructors;

public class c15_CybertekStudents {
    // since school name is a variable that is the SAME  for all students ==> we can make it STATIC
    static String schoolName;   //static variable
            String studentName; // instance variable : must be provided
            int groupNumber;    // instance variable : must be provided
            String batch;       // instance variable : must be provided

            // can I initialize those variables in the constructor? Yes I can
    // If I initialize them, How many arguments must be passe? how many MUST BE provided? Only 3 = instance variables
    // whereas the static variable can be initiated in the Constructor like this:
    public c15_CybertekStudents(String studentName, int groupNumber, String batch){
        // because it is a global variable it can be used everywhere
        // no need for argument for schoolName
    //     schoolName ="Cybertek University"; //// CONSTRUCTOR IS BETTER USED TO INITIATE INSTANCE VARIABLES
        // we will initiate our static variable later once we create our object so that we can change it easily

        // now I will initialize the values i'm passing to the instance variables
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }

    // Now I will create my toString() method to specify how do I want my student info to print:
    public String toString() {
        return "Name: "+ studentName+", Batch: "+batch+", Group# "+groupNumber+", School name: "+schoolName;
    }
    }


    //HERE I WILL CREATE ANTOHER CLASS CALLED COBJECTS:
    class CObjects{

        public static void main(String[] args) {

            c15_CybertekStudents student1 = new c15_CybertekStudents("Reem Khalil", 13, "Batch18");
            System.out.println(student1);
            student1.schoolName = "Cybertek University";    // we can change it here and it will change for every object because it is STATIC
            //Name: Reem Khalil, Batch: Batch18, Group# 13, School name: Cybertek University

            c15_CybertekStudents student2 = new c15_CybertekStudents("Zuura", 7 ,"Batch18");
            System.out.println(student2); //
            //Name: Zuura, Batch: Batch18, Group# 7, School name: Cybertek University

            // Cyberteck University : is shared by all c15_CybertekStudents objects
            // Static variable = one copy is shared by all objects
            // if I want to change it to say Cybertek School instead of Cybertek University =>
            // => all I need to do is to initialize the value Cybertek School to the static variable in line 5 like this:
            // static String schoolName = "Cybertek School";
            // CONSTRUCTOR IS BETTER USED TO INITIATE INSTANCE VARIABLES
            //It is better to initialize static variable and give value from beginning once declared
            // OR
            // initiate the value once we create our first object
        }
    }



