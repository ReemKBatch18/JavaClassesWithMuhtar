package day50_Polymorphism;
/*
         // IN polymorphism:
                    * REFERENCE TYPE decides what can be accessible (variables / methods) when creating objects
                    * Whenever we call a method ==> it will always call the OVERRIDDEN method in child class (object type)
                    * If method was not OVERRIDDEN ==> it will call the method from the parent class (reference type)
                    * if the method is static ==> it can be inherited but NOT overridden ==> THIS METHOD WILL BE EXECUTED
                    * Pre-condition is : INHERITANCE (IS A relation)
                    * instanceof keyword : can be used to verify which class the object belongs to


 */
public class AnimalObjects {
    public static void main(String[] args) {

        Dog obj1 = new Dog("lucy","female", 3);
        // what was unique in the Dog class? bark() method and dogName variable
        // when we make the reference type as Dog ==> we can call the method and variable that only belong to Dog class
        System.out.println(obj1.dogName);
        obj1.bark();


        // but in polymorphism: what's my object type? it is Dog
        // in Dog class I have bark() method and instance variable dogName
        // but in Animal class, do I have instance method bark()? or dogName instance variable? NO I DONOT
        // ==> which means I CAN NOT CALL THEM FROM THE OBJECT CREATED USING REFERENCE TYPE ANIMAL
         Animal obj2 = new Dog("kino","male", 4);

         // IN polymorphism, REFERENCE TYPE decides what can be accessible (variables / methods) when creating objects

       // System.out.println(obj2.dogName);  // belongs to Dog class. Not accessible here
       // obj2.bark();              // belongs to Dog class, not accessible here

        obj2.eat(); // this method will print the overridden method from child class, Dog.

        //when we call the static method methodA() from Animal class here.
        // It can not be overridden in Dog class because it is static
        // that's why when it is called from obj2 (created using reference type Animal and object type Dog
                    // it will print whatever it is in Animal class
        obj2.methodA();         // prints: Animal Class

        Animal animal1 = new Cat("a","f", 1);
        // to verify where did animal1 come from if we don't know==>
        // ==> we use instanceof key word
        boolean isDog = animal1 instanceof Dog;
        System.out.println(isDog); // false

        boolean isCat = animal1 instanceof Cat;
        System.out.println(isCat); // true

        Dog d1 = new Dog("b","f",3);
        // the reference type here is the class itself
        // does this class has any relationship with Cat ? NONE
        // if NO relation with Cat, Can I assume that it can serve as a reference type
       // boolean r1 = d1 instanceof Cat; // there is no IS A relation
        // but if we use Animal as reference type:
        Animal d2 = new Dog("b","f",3);
        boolean r1 = d2 instanceof Dog;
        System.out.println(r1); // true


        Animal animal2 = new Cat("c","m",2);
        boolean r2 = animal2 instanceof Animal;
        System.out.println(r2); // true
        boolean r3 = animal2 instanceof Cat;
        System.out.println(r3); //true








    }
}
