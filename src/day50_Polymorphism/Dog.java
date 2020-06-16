package day50_Polymorphism;

// DOG CLASS INHERITS FROM ANIMAL
class Dog extends Animal{       // total of 3 variables and 3 methods
    public String dogName; // inherited age and gender
    public void bark(){
        System.out.println(dogName+" is barking");
    }

    @Override
    public void eat(){
        System.out.println(dogName+" is eating ");
    }
    @Override
    public void sleep(){
        System.out.println(dogName+" is sleeping");
    }

    // constructor
    public Dog(String dogName, String gender, int age){
        this.dogName = dogName;
        this.gender = gender;
        this.age = age;
    }


}