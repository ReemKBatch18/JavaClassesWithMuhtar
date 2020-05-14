package OfficeHours.Practice_05_13_2020;

import java.lang.reflect.Constructor;

/*
    1. Constructor is a must. If I don't create it ==> compiler will create the DEFAULT constructor for me
    2. default constructor = constructor without parameter
    3. Constructor is a special method
    4. to create constructor: accessModifier className(parameter-optional)
                              optional        MUST        optional
    5. in regular methods:
    6. accessModifier   specifier    returnType   methodName (parameter)
          optional     optional        must        must      optional
 */
// this is my class
public class c05_Constructor {

   // this is my 1st constructor (no parameter)
    public c05_Constructor(){
        System.out.println("default constructor");
    }

    // here is my main method in 05_Constructor class
    public static void main(String[] args) {

        // This is the object I created from c05_Constructor class
        c05_Constructor obj = new c05_Constructor();

        // These two are objects created from Employee Class: (using a constructor created there that pass 3 parameters)
        Employee emp1 = new Employee("Canan", 123, 100000);
        Employee emp2 = new Employee("Reem",456, 150000);
// but to specify how to print info ==> we have to create our toString() in the Employee class
        System.out.println(emp2); //Name: Reem, id: 456, salary: 150000.0


    }
}


// Here I will create a class called Employee:
class Employee{

    String name;
    long id;
    double salary;
    // if I want to create the constructor here to initialize those ins variables, how many info I need to create it?
    // I need to pass info for name, id, salary.
    // do I create it with argument or without argument? I have to create it with 3 arguments like this:
    public Employee(String name, long id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+name+", id: "+id+", salary: "+salary;
    }

}
