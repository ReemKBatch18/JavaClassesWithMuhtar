package day34_CustomClass;

public class Dog {
    // attributes: breed, size, age, color
    // actions: sleep(), eat(), run(), sit()

    String breed;
    String size;
    int age;
    String color;
    String name;
    // when I create the dog's object I should be able to assign all instance variables I have here as attributes at once
    // I need to create a method to let me assign values to these instance variables.
    // every time I call this method setDogInfo() I should be able to pass values of breed, size, age, color of my dog ==>
    //==> I need to pass the parameters I need for the variables

    // let' s create the action for eating:
    public void eating(String food){
        // i can call this eating method from the objects I have: dog1, dog2 ...
        System.out.println(name+ " is eating "+food);
    }

    public void drinking(String drink){

        System.out.println(name+" is drinking "+drink);
    }

    public void playing(String toy){

        System.out.println(name+" is playing "+ toy);
    }

    public void studying(String subject){
        System.out.println(name+ " is studying "+ subject);
    }
// now we can try those methods eating(), drinking(), playing() in class03_DogObjects_02

    public void setDogInfo(String breed, String size, int age, String color, String name){
        // if local variable (the parameter) has same name with instance variable when we assign we use "this": ==>
        // ==> this.breed = breed ("this" calls the instance variable to assign it to the parameter we passed)
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
        this.name = name;
        // "this" keyword is used for calling object instance (instance variable)
        //by using "this" keyword ........
        // the benefit of this method is grouping .....

    }

    public String toString(){
        return "Dog Name: "+name+", breed: "+breed+", size: "+size+", color: "+color+", age: "+age;
    }// when we pass the object in the print statement ==> compiler automatically uses toString() method to print
}
