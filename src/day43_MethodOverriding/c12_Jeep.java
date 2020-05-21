package day43_MethodOverriding;

public class c12_Jeep extends c08_Car {

    // override start() method
    void start(){
        // the following will print once we call this method from Jeep object
        System.out.println("call mechanic");
        System.out.println("oil change");
        System.out.println("jump start");
    }

}
