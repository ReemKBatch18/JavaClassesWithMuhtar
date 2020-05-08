package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class class_08_ArrayList_Practice_ShoppingList {

    public static void main(String[] args) {

        // create shoopping list
        // since String is not primitive, I can apply it to ArrayList

        ArrayList<String>  shoppingList = new ArrayList<>();
        // now we will add elements. Every time we add the size changes
        shoppingList.add("Milk"); //size 1
        shoppingList.add("Coffee"); // size 2
        shoppingList.add("Bread"); // size 3
        shoppingList.add("Toilet paper");
        System.out.println(shoppingList);
        // if we wnat to retrieve the first element? then second? then third? then forth?
        System.out.println(shoppingList.get(0));
        System.out.println(shoppingList.get(1));
        System.out.println(shoppingList.get(2));
        System.out.println(shoppingList.get(3));

        System.out.println("===============================================================");
        // instead of printing each one by one , we can apply the loop
        // How can retrieve the length of the ArrayList? by using the size method: shoppingList.size();
        // since it returns us an int we can assign it to int variable

        for (int i = 0 ; i <shoppingList.size() ; i++){
            // since i represents the index number I can replace it
            System.out.println(shoppingList.get(i));
        }
        System.out.println("===============================================================");
        // can we do it with for each loop? yes we can

        // every element in that data collection is a string so we can use String variable
        for (String each : shoppingList){
            System.out.println(each);
        }

        // if the size method returns us the length of the ArrayList, How can we get the last index of the list?
        // int lastIndex = ArrayList.size()-1
        int lastIndex = shoppingList.size()-1;

        // WE USE ARRAYLIST VS ARRAY TO BE ABLE TO ADD OR REMOVE ELEMENTS. SIZE WILL ADJUST AUTOMATICALLY


    }
}
