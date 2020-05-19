package day42_Inheritance.Task01;
/*
create a class called Person
				attributes:  name, age, gender
				methods: eat, walk, sleep, drink, setPersonInfo
*/
public class Person {
    // instance variable with public access modifier
    public String name;
    public int age;
    public char gender;

    // methods
    // setPersonInfo(): public to be accessible, instance to use instance variables, void not returning any thing, 3 parameters
    public void setPersonInfo(String name, int age, char gender){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // eat() method : instance: each object has its own copy and to use instance variables
    public void eat(String food){
        System.out.println(name + " is eating "+food);
    }
    // sleep() method
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }
    public void walk(){
        System.out.println(name + " is walking");
    }
    public void drink(String drink){
        System.out.println(name +" is drinking "+drink);
    }


}
