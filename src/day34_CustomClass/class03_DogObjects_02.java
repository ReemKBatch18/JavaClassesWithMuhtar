package day34_CustomClass;

import javax.swing.*;

public class class03_DogObjects_02 {
    public static void main(String[] args) {

       String food1 = "Chicken";
       String food2 = "Fish";

       String drink1 = "milk";
       String drink2 = "coffee";

       String toy1 = "Ps4";
       String toy2 = "Piano";

        Dog dog1 = new Dog();
        dog1.setDogInfo("Alabay", "Extra big", 5, "Brown", "Ajdar");
        Dog dog2 = new Dog();
        dog2.setDogInfo("Chihua Hua","Smal",1,"Brown","Tuzik");

        // if I want Tuzik to eat chicken:
        dog2.eating(food1);     //  Tuzik is eating Chicken
        // If I want Ajdar to eat fish:
        dog1.eating(food2);     //  Ajdar is eating Fish

        // if I want Tuzik to drink coffee
        dog2.drinking(drink2);  //  Tuzik is drinking coffee
        // if I want Ajdar to drink milk
        dog1.drinking(drink1);  //  Ajdar is drinking milk

        dog2.playing(toy2);
        dog1.playing(toy1);

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle","Miniature",2,"White","Lucy");
        Dog dog4 = new Dog();
        dog4.setDogInfo("Kangal","Huge",5,"White","Comar");
        System.out.println("=================================================");

        // we create an array of the dogs. DataType = Dog
        Dog [] dogPark = {dog1, dog2, dog3, dog4};
        //if I want to print that each dog from list is eating chicken ==> loop and call eating() method
        for (int i = 0 ; i < dogPark.length; i ++){
            // how do I retrieve each element from Array? using arrayName[indexNumber]
            dogPark[i].eating("Chicken");
        }

        // to print all dogs as drinking water:
        for(Dog each: dogPark){
            // from this object, I call the method drinking()
            each.drinking("water");
        }

        for (int i = 0 ;i <dogPark.length; i++){
            dogPark[i].playing("toy2");
        }

        for (Dog each: dogPark){
            each.studying("Java");
        }





    }
}
