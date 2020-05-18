package day41_Inheritance;


public class c04_Animal {
    /*
    Name
    Size
    Weight
     */

    public String name;
    public String size;
    public double weight;

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void move(){
        System.out.println(name+ " is moving");
    }
}
