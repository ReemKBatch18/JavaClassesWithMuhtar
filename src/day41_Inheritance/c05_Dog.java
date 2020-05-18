package day41_Inheritance;



    // if I want all variables and method from Animal class to be used here I can use inheritance
    // so I add extends keyword
    public class c05_Dog extends c04_Animal {
 /*   From Animal class:
    public String name;
    public String size;
    public double weight;

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void move(){
        System.out.println(name+ " is moving");
    }
         */

         // Advantage of inheritance: improves re-usability
        // we can only inherit VISIBLE variables and methods from the super (parent)
        // we do not have to repeat initializing same variables and methods
        public static void main(String[] args) {
            // I will create object:
            c05_Dog dog1 = new c05_Dog();
            dog1.name = "Lucy";
            // we were able to get access to this variable name because I inherited from Animal class
            System.out.println(dog1.name); // Lucy

            // I can call here the method I created in this class which is only related to Dog class: bark()
            // I can not use the bark() method in another sub class like Fish class
            dog1.bark();    // Lucy is barking
        }


        // here I will create a method that's only related to Dog : bark()
        public void bark(){
            System.out.println(name+" is barking");
        }
}
