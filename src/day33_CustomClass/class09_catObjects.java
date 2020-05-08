package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class class09_catObjects {
    // I want to create 3 or 4 objects cat class into here..
    // both are in the same package, no need to import Cat class
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        // from this object, I will call this setCatInfo
        // this method demands extra information:
        cat1.setCatInfo("Siemes", "White" , 2, "Sasha");;
        // these are the info I set for this object
        // when I print cat1 is it going to give me these info? NO
        // When the class object is passed in print statement==> toSTring () autmatically.
        // I have to specify how I want the info printed and rewrite toString method to specify what to print first:
        // I will create it in Cat class now
        System.out.println(cat1);   //  Sasha, breed is Siemes, color is White, age is 2


        Cat cat2 = new Cat();
        cat2.setCatInfo("British shorthair","Grey",2,"Lydia");

        Cat cat3 = new Cat();
        cat3.setCatInfo("Calico","brown-white",6,"Cinnamon");

        // can I create arraylist of cats? yes I can :

        ArrayList<Cat> catList = new ArrayList<>();
        catList.addAll(Arrays.asList(cat1,cat2,cat3));

        // Now we wnat to print out info of each cat from this list, using loops
        for (int i = 0 ; i < catList.size(); i++){
            // how do I retrireve every single cat from this list==> we use the get method
            // what do we need to pass? i
            System.out.println(catList.get(i));
            // do we have object in the print statement? yes we have ==> toString method will be used automatically
        }

        System.out.println("=======================================");
        cat1.sleep();
        // depending on the object these sleep() method will print differently
        cat2.sleep();
        cat3.sleep();

        System.out.println("======================================");
        cat1.eat("cat treats");
        // if I call the eat method from first cat==> first cat will be eating
        cat2.eat("fish");
        // if I give fish to the 2nd cat ==> 2nd cat will be eating
        cat3.eat("shish kabab");

        System.out.println("======================================");
        cat1.drink("water");
        cat2.drink("milk");
        cat3.drink("coffee");
        // whatever we pass in the instance methods, it will print when we call it








    }

}
