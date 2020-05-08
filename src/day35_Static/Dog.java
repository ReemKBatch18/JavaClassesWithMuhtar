package day35_Static;

public class Dog {
    String breed;
    String age;
    // I can make this attribute of dog as static which is : isPet as boolean expression once I declare it true
    static boolean isPet;

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.breed = "Husky";
        // here I will declare the boolean isPet:
        dog1.isPet = true;

        Dog dog2 = new Dog();
        dog2.breed = "Poddle";

        System.out.println(dog1.breed);
        System.out.println(dog2.breed);

        // what happens if I make  instance variable String breed as static variable? ==> all my dog object will be Husky then!
        // if static String breed; then when I create Dog objects they are all the same breed ==> it will be the same for all dog objects I create

        System.out.println(dog1.isPet); // true
        System.out.println(dog2.isPet);// true, even though I have not assigned it for this dog2 but since it's assigned once it applies to all


    }
}
