package day33_CustomClass;

public class Cat {
    /*
cat class:
    data/ attributes: instance fariables
        breed, color, age

    actions:        instance methods
        sleep(), eat(), drink()
 */


        String breed;
        String color;
        int age;
        String name;

        public void sleep(){
            System.out.println(name+ " is sleeping");
        }

        public void eat(String catFood){ // when this mehtod is called it should pass me the information what this cat is eating
            System.out.println(name+ " is eating " + catFood);
        }

        public void drink(String catDrink){ // when this mehtod is called it should pass me the information what this cat is drinking
           System.out.println(name+ " is drinking " + catDrink);
        }

        public void setCatInfo(String catBreed, String catColor, int catAge, String catName){
           // whatever information are given, I will assign them to the variables
           breed = catBreed; // I group these functions within this method
           color = catColor;
           age = catAge;
           name = catName;
        }

        public String toString(){
            // however we set this toString method, when we call the object into print statment, it will print the toString() automatically
            return name+ ", breed is "+breed+", color is "+color+", age is "+age;

        }



}
