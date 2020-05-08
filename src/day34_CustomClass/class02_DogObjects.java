package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class class02_DogObjects {
    public static void main(String[] args) {
        // hwo do I create the objects? give class name:Dog ==> give name to object ==> assign it to new keyword from Dog() class:
        Dog dog1 = new Dog();
        // we haven't assigned any information yet to our first object dog1.
        /*
         in order to get the breed of dog, I need to assign it to the variable breed.
         how can I assign it? I can call this variable breed and assign it like this:
        dog1.breed = "Husky";
        System.out.println(dog1.breed); // Husky
        // to assign size of dog:
        dog1.size = "Small";
        dog1.color = "White";
        dog1.name = "Ghost";
        dog1.age = 4;
        // after initializing them ==> I can print them out. Before initializing ==> default values like null or 0
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        System.out.println(dog1.age);
        */

        // Best is to call instance method setDogInfo instead of going over  the above steps over and over again if I have lots of objects of dogs)
        dog1.setDogInfo("Husky", "Small", 4, "White","Ghost");
        //  Benifit of having this setDogInfo is it allows you to set all information at once
        // if local variable has same name with instance variable when we assign we use "this": ==>
        // ==> this.breed = breed ("this" calls the instance variable)

        // can I create multiple objects from a class like Dog class? yes I can create as many objects as I want from a class

        Dog dog2 = new Dog();
        // can I call this method setDogInfo() to create my 2nd object? Yes I can
        dog2.setDogInfo("Alabay", "Extra big", 5, "Brown", "Ajdar");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle","Miniature",2,"White","Lucy");
        // every object we create has its own copy of each instance variable of the class
        // objects have different copies of those instance variables
        // if I have multiple objects, is there any possibily to put them in some type of data collection? yes there is
        // before we create that data collection, we need to rewrite the toString() method in the Dog class ==>
        //==> so when we try to print info of our objects it will print info as we set them versus hash code

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println("======================================");

        Dog dog4 = new Dog();
        dog4.setDogInfo("Pomeranian", "Small", 3, "White", "Lil");

        Dog dog5 = new Dog();
        dog5.setDogInfo("pomeranian", "Small",4, "White", "Ernie");
        // I want to create a variable that can contain all those dogs objects
        // Can I create aRrayList? does ArrayList support objects? yes it does
        // in order to store my objects into the list I can use addAll() method

        ArrayList<Dog> puppies = new ArrayList<>();
        // in order to use addAll() it only accepts collection type. I can return dog1, dog2, dog3 to collection type by using Arrays.asList() method
        puppies.addAll(Arrays.asList(dog1,dog2,dog3));
        puppies.addAll(Arrays.asList(dog4,dog5));

        // how can I print information about every single dog in this list? I can use a loop:
        for ( int i = 0; i < puppies.size(); i++){
            // how can I retrieve each dog from the arrayList? using the get() method
            // what type do I get from this get() method? it returns me a Dog object
            // if it returns me Dog ==> I can assign it to Dog like this:
            Dog eachDog = puppies.get(i);
            System.out.println(eachDog);
        }
        System.out.println("==========================================");
        // we need to write a program that will remove all dogs that are older than 2 years old
        // I can use removeIf() with lambda expression, creating my predicate:
        puppies.removeIf( p -> p.age>2);
        for ( int i = 0; i < puppies.size(); i++){
            Dog eachDog = puppies.get(i);
            System.out.println(eachDog);
        }
    }
}
