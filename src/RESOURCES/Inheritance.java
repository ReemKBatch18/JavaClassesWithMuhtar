package RESOURCES;
// Inheritance class is not in the same package with class DATA from day42_Inheritance
// but I will import the Data class here:
import day42_Inheritance.c01_Data;


// I will make this class inherit all Data class using extends keyword
public class Inheritance extends c01_Data {
  //            sub              super

    public static void main(String[] args) {
        System.out.println(Inheritance.publicData); // public variable is always a visible data that can be inherited
        System.out.println(Inheritance.protectedData); // protected variable is always a visible data to any subclass
       // System.out.println(Inheritance.defaultData); // default is NOT visible OUTSIDE its package.
       // System.out.println(Inheritance.privateData);// private CAN NEVER be inherited
    }
}
/*
public = accessible at everywhere, visible to world
protected = visible in same package, visible in sub class outside package
default = only visible in same package
private = only visible within the same class

private:     can never be inherited in sub class
default:     can be inherited as long as sub class is in the same package
protected:   can be inherited always to any subclass
public:      can be inherited always to any subclass

To sort according to visibility: PUBLIC > PROTECTED > DEFAULT > PRIVATE

 */