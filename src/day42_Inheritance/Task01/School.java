package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called school:
					create 3 objects of student and set their info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
 */
public class School {       // Relationship: School HAS A Student

    // here we will create 3 objects from Student class
    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        // now we will set info for Student objects
        st1.setStudentInfo( "Bahtiyar", 35,'M',2345,"Testing" );
        st2.setStudentInfo( "Abide", 32,'F',2378,"Art" );
        st3.setStudentInfo( "Byakl", 10,'M',2309,"Soccer");

        // we need to store our objects in an arrayList
        // Does arraylist support objects? YES arrayList only support objects DOES NOT support primitives
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(st1,st2,st3)); // collection type

        // we will need for each loop to the arrayList to print info of students
        for(Student each : studentList){
         //   System.out.println(each);
            // in order to print only the name and ID:
            System.out.println("Name: "+each.name+", ID: "+each.studentID);
        }

    }
}
