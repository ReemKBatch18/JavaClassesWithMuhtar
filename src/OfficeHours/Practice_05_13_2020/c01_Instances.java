package OfficeHours.Practice_05_13_2020;
/*
class and object
instances: belong to object
            each object we create in class has its own copy of instances
            examples of instances: variables, methods, blocks
 */
public class c01_Instances {
// we create instance variable inside class but outside any method or any block like this:
    String name;
    // if we need to use this variable in different class outside this class ==> we have to initialize in a Constructor method
    // or we have to initialize it in an instance block

// we create instance method WITHOUT a static specifier like this:
public void printName(){ // each object will have its own copy of instance method
    System.out.println("Name is: "+name); // I can call instance variable into here
    // but if I have a local variable inside this method with the same name "name" then===>
    //==> I have to use this. to refer to the instance variable
    // compiler prefers local variables. If I don't use this. to refer to instance variable it will assume we are using the local
}


// here is our instance block (we just open two {} ).
// we can assign our instance variable here like this:
{
    name = "Zuura";
    // so now once I create my object ==> this instance block can get executed ==> name will print "Zuura"
}

}
