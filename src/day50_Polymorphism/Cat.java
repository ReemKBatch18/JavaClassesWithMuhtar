package day50_Polymorphism;

// CAT CLASS INHERITS FROM ANIMAL
final class  Cat extends Animal{  // total of 3 variables and 3 methods
    // we make class final so that no one can override the method scratch() which belongs only to Cat
    // we can't make the method scratch() static (so it doesn't get overridden)
    // because we need to use the instance variable catName in it

    public String catName; // inherited age and gender
    public void scratch(){
        System.out.println(catName+" is scratching herself");
    }

    @Override
    public void eat(){
        System.out.println(catName+" is eating ");
    }
    @Override
    public void sleep(){
        System.out.println(catName+" is sleeping");
    }
    // constructor
    public Cat(String catName, String gender, int age){
        this.catName = catName;
        this.gender = gender;
        this.age = age;
    }



}
