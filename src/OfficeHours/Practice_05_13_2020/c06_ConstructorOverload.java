package OfficeHours.Practice_05_13_2020;

public class c06_ConstructorOverload {

    // this is the default constructor = with no parameter:
    public c06_ConstructorOverload(){
        System.out.println("default constructor");
        // if we delete this constructor ==> compiler will not create it again because we already have another constructor
        // the only time compiler creates constructor is when we don't have one
        // if we delete this one, and we create our object ==> we will get compiler error if we don't pass anything in parameters
        // we will get error because if we delete this one then we don't have another one without parameter ==> we have to use one of the other constructors
    }

    // 2nd Constructor: overload constructor ==> Same name BUT DIFFERENT parameter
    public c06_ConstructorOverload(int a){
        System.out.println("constructor with int");
    }

    //3rd Constructor: overload constructor ==> same name BUT DIFFERENT parameter:
    public c06_ConstructorOverload(int a, double b){
        System.out.println("constructor with int and double");
    }

    // here is our main method:
    public static void main(String[] args) {
        c06_ConstructorOverload obj = new c06_ConstructorOverload(10); // 2nd constructor ==> will print : constructor with int
        c06_ConstructorOverload obj2 = new c06_ConstructorOverload(10,1.5); // 3rd constructor ==> will print: constructor with int and double

    }
}
