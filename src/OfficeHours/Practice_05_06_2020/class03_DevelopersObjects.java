package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class class03_DevelopersObjects {
    public static void main(String[] args) {

        Developer developer1 = new Developer();
        developer1.setInfo("Mehmet", "Senior Developer", 160_000,18121993);
        System.out.println(developer1);
        // Name: Mehmet, job title: Senior Developer, salary: $160000.0, ID: 18121993 ( this what we get when we print developer1)

        // now I will call coding() method:
        developer1.coding(); // Mehmet is coding

        // now we will create our 2nd object:
        Developer developer2 = new Developer();
        developer2.setInfo("Leon","Senior Developer",180000,12546);

        developer2.coding(); // Leon is coding

        // now we will call fixingBug() method

        developer1.fixingBug();
        developer2.fixingBug();

        // if i have two developers can I put them in a data structure? yes I can
        // I want to put my two developers in an array
        // data type must match my objects' data type = Developer dataType:
        Developer[] arr = {developer1, developer2};
        // how can I retrieve my objects from the array? by using index number like this: arr [0] or arr[1]
        // to print the name of the object: sout (arr[indexNumber]. name);
        // I can use a loop to print all names of developers in my array (especially if I have so many)
        for (int i = 0 ; i <arr.length; i++){
            System.out.println(arr[i].name);
        }

        // To print all info of my developers using a for each loop:
        // on right side is our collection data : arr
        // on left side I have to provide a variable that represent earch element of my data structure
        for ( Developer each : arr){ // each : represents each element of my array
            System.out.println(each);
        }


        // if I want to be able to add extra developers or remove developers, can I do it with the array? NO I can not
        // I can add my developers to an arrayList where I can add and remove
        ArrayList <Developer> developers = new ArrayList<>();
        // we can use addAll() method to add my developers to the arrayList and use Arrays.asList() method
        developers.addAll(Arrays.asList(developer1,developer2));
        // or we can use our array to add the developers like this:
        //  ArrayList <Developer> developers = new ArrayList<>(Arrays.asList (arr));
        // NOw using a for loop I will print all my develpers info from the arrayList like this

        for (int i = 0 ; i <developers.size(); i++){
            // to retrieve each element in our arrayList ==> use get() method
            System.out.println(developers.get(i));
        }

        // using a for each loop now I will print only name and salary of each developer like this:
        for (Developer each : developers){
            System.out.println(each.name + " " + each.salary);
        }



    }
}
