package OfficeHours.Practice_05_20_2020;

class c05_House {   //  House HAS A Dog     &     House HAS A Cat     &    House HAS A Bunny

    public static void main(String[] args) {

        // dog objects:
        c02_Dog dog1 = new c02_Dog("Latte",3,"brown","medium","Cocker Spaniel");
        // since we created a constructor in Dog class ==> we set info immediately
        // if we didn't create a constructor we will need to call setInfo() method in order to  set info:
       // dog1.setInfo("Latte",3,"brown","medium","Cocker Spaniel");
        // we can print object of dog because we created toString() method in Pet class
        System.out.println(dog1);   // prints:  name Latte, age 3,  color brown, size medium, breed Cocker Spaniel

        c02_Dog dog2 = new c02_Dog("Rindik", 5, "White", "Huge","Kangal");
        System.out.println(dog2);   // prints:  name Rindik, age 5,  color White, size Huge, breed Kangal
        // to call bark()
        dog2.bark();                // prints:  Rindik is barking
        System.out.println("*******************************************");

        // cat objects:
        c03_Cat cat1 = new c03_Cat("Muffin",7,"white","medium","Ragdoll");
        // since we created a constructor in Cat class ==> we set info immediately
        // if we didn't create a constructor we will need to call setInfo() method in order to  set info like this:
        // cat1.setInfo("Muffin",7,"white","medium","Ragdoll");
        // we can print object of Cat because we created toString() method in Pet class:
        System.out.println(cat1);   // prints:  name Muffin, age 7,  color white, size medium, breed Ragdoll
        // to call scratch()
        cat1.scratch();              // prints: Muffin is scratching
        System.out.println("*******************************************");

        // Bunny objects:
        c04_Bunny bunny1 = new c04_Bunny("Bug",3,"white","small","tiny");
        // to print
        System.out.println(bunny1); // prints:  name Bug, age 3,  color white, size small, breed tiny
        bunny1.dig();               // prints:  Bug is digging

    }


}
