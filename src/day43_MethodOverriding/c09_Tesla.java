package day43_MethodOverriding;

public class c09_Tesla extends c08_Car {

    // I need to change functionality of this method start() without creating a new one
    // we can use a more accessible access modifier
    public void start(){
        // the following will print once we call this method from Tesla object
        System.out.println("Push start button");
    }
}
