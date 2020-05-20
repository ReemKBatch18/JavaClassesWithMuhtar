package OfficeHours.Practice_05_20_2020;
/*
Dog:    variables:	name, age, color, size, breed, isPet, numberOfeyes
		methods: eat, sleep, drink, toString,setInfo(), bark
	not inherited : bark
 */
public class c02_Dog extends c01_Pet{       //  Dog IS A Pet

    // since I inherited from Pet ==> we have here all variables and methods from Pet class
    // here I will create dog constructor:
    public c02_Dog(String name, int age, String color, String size, String breed){
        setInfo(name, age, color, size, breed);
    }
    //  bark() method:
    public void bark(){
        System.out.println(name+" is barking");
    }
    // we are done with the Dog class because we inherited variables and methods
}
