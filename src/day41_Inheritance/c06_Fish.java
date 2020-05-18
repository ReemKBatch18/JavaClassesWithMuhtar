package day41_Inheritance;

public class c06_Fish extends c04_Animal {

    // I can add swim() action in here so that I can use it in addition to other methods inherited from Animal class
    public void swim(){
        System.out.println(name + " is swimming");
    }

    public static void main(String[] args) {
        // here we can create objects of fish
        c06_Fish fish1 = new c06_Fish();
        // because we inherited Animal class ==> we can use variables and methods here
        // no need to re-initialize same variables
        // We can ADD more variables related to this class Fish here like Gills or method like swim()

        fish1.name = "Nemo";
        // I can call name, weight, size from fish object fish1
        fish1.weight = 5;
        fish1.size = "Small";

        // now let's try methods inherited from Animal class
        fish1.eat();        //  Nemo is eating
        fish1.move();       //  Nemo is moving

        // now I will call the method I created here swim()
        fish1.swim();       // Nemo is swimming



    }

}
