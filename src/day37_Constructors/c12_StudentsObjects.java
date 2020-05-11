package day37_Constructors;

public class c12_StudentsObjects {
    // when we create object from class==> we have to give existing constructor
    // I don't yet have a constructor that passes parameter
    // in order to create the object student, I have to use the default constructor
    // to set info of my object I have to call the setInfo() method like this:
    // st1.setInfo("Marina", 34, 'F', "Cybertek");
    // but that's a one extra step for me
    public static void main(String[] args) {

        c11_Student st1 = new c11_Student("Marina", 34, 'F', "Cybertek");
     //   st1.setInfo("Marina", 34, 'F', "Cybertek"); // I do not need this step any more because I used the ==>
        //   ==> Constructor passing the 4 parameter when creating my object

        System.out.println(st1);    //  Name: Marina Age: 34 Gender: F University: Cybertek

        c11_Student st2 = new c11_Student("Sha", 35, 'M', "Harvard");

        System.out.println(st2);    //  Name: Sha Age: 35 Gender: M University: Harvard

        // advantage of this Constructor: I don't have to call the setInfo() method
        // I can get same result as soon as I create the object
    }
}
