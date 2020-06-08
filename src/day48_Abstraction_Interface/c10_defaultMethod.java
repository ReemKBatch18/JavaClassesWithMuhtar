package day48_Abstraction_Interface;

public interface c10_defaultMethod {


    // default method is only created in interface
    // it is used to express lambda expression
    // if you try to create default method anywhere else it will give compiler error
    default void method1(){
        System.out.println("default method");
    }

    public static void main(String[] args) {
        // we can't call default method here into main method because it is not static
        // method();

        // even if we try to create an object to call it through the object == compiler error
        // interface can not create objects
        // the only way is to inherit it into another class using implements keyword
    }

    class N implements c10_defaultMethod{
        public static void main(String[] args) {
            N obj = new N();
            obj.method1();
            //We can only execute default method after we inherit it into a class from the interface
            // we create object in the sub class then call method through the object
        }
    }
}
