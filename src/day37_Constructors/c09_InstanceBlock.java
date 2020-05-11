package day37_Constructors;
/*
There are 2 initializer block in Java:
1. static initializer block: It gets executed first once the class is loaded.
                            it gets executed once
                            it is designed for initializing static variables
                            static{
                                statement;
                                }
                            it can be placed anywhere in the class
2. instance initializer block: It belongs to the object ==> every object has its own copy
                            execution of this block depends on the object
                            if we create object of class ==> executes
                            if we don't create object ==> doesn't execute
                            designed for initializing instance variables
                            {
                                statements;
                                }
                             it can be placed anywhere in the class

 */
public class c09_InstanceBlock {

    // this is now an instance block:
    {
        System.out.println("instance block"); // we have to create object ==> to execute this block
    }

    // here we create our main method to create an object to execute the instance block
    public static void main(String[] args) {
        // we create our object
        c09_InstanceBlock obj = new c09_InstanceBlock();
        // now if we run ==> "instance block" will get printed

        // if we create a second ojbect:
        c09_InstanceBlock obj2 = new c09_InstanceBlock();
        // now if we run ==> "instance block" will get printed again
        // because this block depends on the object

        // INSTANCE block will get executed as many times as many objects we create.
        // every object we create will have it run one time. Times = number of objects
        // but if we have a static block ==> it will get executed only ONCE
    }
}
