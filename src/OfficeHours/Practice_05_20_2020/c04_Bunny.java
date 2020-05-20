package OfficeHours.Practice_05_20_2020;
/*
	Bunny:	variables:	name, age, color, size, breed, isPet, numberOfeyes
    		methods: eat, sleep, drink, toString,setInfo(), Dig
    	not inherited: Dig
 */
public class c04_Bunny extends c01_Pet {    // Bunny IS A Pet
    // since I inherited from Pet ==> we have here all variables and methods from Pet class

    public c04_Bunny(String name, int age, String color, String size, String breed){
        setInfo(name, age, color, size, breed);
    }


    //  Dig() method:
    public void dig(){
        System.out.println(name+" is digging");
    }
    // we are done with the Bunny class because we inherited variables and method
}
