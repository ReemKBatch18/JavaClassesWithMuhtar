package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class class04_StudentsObjects {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setStudentInfo("Adam", "English", 34, 3.5, 'M', true);
        // to print: when we pass object in print statemtn ==> compiler automatically uses toString()method
        // I need to create toString method in Student class specifying how I want student's infor to be printed

        Student st2 = new Student();
        st2.setStudentInfo("Mike","German",30,3.0,'M',false);

        Student st3 = new Student();
        st3.setStudentInfo("Johnny Guitar", "US",40,2.5,'M',false);

        Student st4 = new Student();
        st4.setStudentInfo("Anna","Ukrainian", 33,3.9, 'F', true);

        // Can we create a Student[] array out of these students? yes we can
        Student[] students = {st1, st2, st3, st4};

        // Now we will create an ArrayList of students canGraduate
        // ArrayList<Student> canGraduate = new ArrayList<>();
        // we want to write a program that will add only students who are eligible to graduate
        // only students with gpa>3 will graduate
        // can I add students in my array to my ArrayList? then remove who's not eligible? yes I can
        ArrayList<Student> canGraduate = new ArrayList<>(Arrays.asList(students));
        canGraduate.removeIf( p -> p.gpa <= 3); // this method will remove whose gpa is less or equal to 3
        // I only have two who have gpa>3 ==> size of my ArrayList canGraduate = 2
        System.out.println(canGraduate.size());

        // hwo can we create a program that will print info of all students who can graduate?
        // we can apply a loop
        for( int i = 0 ; i < canGraduate.size() ; i++){
            // which method do we use to retrieve the objects from this arrayList? using get()method
            // if get() method returns me a Student object, can I assign it to Student ojbect? yes I can
            Student each = canGraduate.get(i);
            // how can I only print only the name of students who can graduate not all info? by calling only name
            System.out.println(each.name+ " can graduate");
        }

        System.out.println("========================================");
        // what if we reversed the requirement?
        ArrayList<Student> canNotGraduate = new ArrayList<>(Arrays.asList(students));
        // now I added all students to this list. Next step is to remove students who can graduate
        canNotGraduate.removeIf( p -> p.gpa> 3.0); // this will remove all students who can graduate
        // I have two students who can not graduate ==> size of list =2
        System.out.println(canNotGraduate.size()); // 2
        // to print names of students who can not grauate ==> loop
        // Variable in for Each loop has to be matching to data type of ArrayList
        for (Student each: canNotGraduate){
            // we only want the names of students not all their info==> call name
            System.out.println(each.name+ " can not graduate");
        }
        // if I have 100 more students , where do I have to add them? we add them to students[] array










    }
}
