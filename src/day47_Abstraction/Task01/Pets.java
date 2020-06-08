package day47_Abstraction.Task01;
/*
    Task01:
		1. creaet an abstract class called Pets
				attributes: name, age, color, breed, gender
				methods:
					abstract methods: sleep, eat, speak
					instance method: toString
		2. create three sub classes (non-abstract) of pet:
								1. Dog
								2. Cat
								3. Tiger
				each class MUST have constructors to initialize the attributes

 */
public abstract class Pets {
    public String name;
    public int age;
    public String color;
    public String breed;
    public char gender;

    public abstract void sleep();
    public abstract void eat();
    public abstract void speak();

    public abstract String toString();

}
