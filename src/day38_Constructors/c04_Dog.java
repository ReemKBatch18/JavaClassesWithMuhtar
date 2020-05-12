package day38_Constructors;

public class c04_Dog {
    // Constructor Method Overloading:
    // To overload a method ==> same method name BUT must have different parameters
    // advantages of overloaded methods: readable, efficient, easy to remember, reusable, easy to maintain
    // Constructor is a METHOD ==> we can apply overloading
    // we can have multiple constructors in a class (by implementing method overloading)
   /*
    public class Dog{
        public Dog(){
            // no-arg constructor
        }
        public Dog(int age){
            // with int parameter
        }
    }
    */
  String name;
  String breed;
  int age;

  // I will create a constructor that will allow me to initialize only the breed of dog: like this:
    public c04_Dog(String breed){
        this.breed = breed;
    }

    // I will create a constructor that will allow me ot initialize breed and age of the dog: like this:
    public c04_Dog (String breed, int age){
        this.breed = breed;
        this.age = age;
        // whatever we give here as name will be assigned like this:
        // name = "unknown"
    }

    // we can create a constructor just like the previous one but different order of parameters : like this:
    public c04_Dog(int age, String breed){
        this.age = age;
        this.breed = breed;
    }
    // when we use constructor creating our objects: once we pass parameter==> system will know which one use
    // so if we pass number for age first then a string for breed ==> it will use the last constructor we created.


}
