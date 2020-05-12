package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class c01_ShoppingList {
    public static void main(String[] args) {
        // when creating objects we must pass our argument in the parameter because that's how we created our constructor
        Item item1 = new Item("Paint", 1.5,20);
        Item item2 = new Item("Paint Brush", 3, 5);
        Item item3 = new Item("Canvas", 4, 6);
        Item item4 = new Item("Apron", 5, 1);
        Item item5 = new Item("Isle", 10, 1);
        // to try if our constructor works we can try printing one item like this:
    //    System.out.println(item1); //Item: Paint, Unit price: $1.5, Quantity: 20
                                    //Total Cost of Item: $30.0


        //To calculate the total cost of all items purchased I will add items into a list then use for each loop

        ArrayList<Item> list = new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));
        // or we can declare like this: ArrayList<Item> list = new ArrayList<>();
        // then add items like this: list.addAll(Arrays.asList(item1,item2,item3,item4,item5));

        // using the for each loop I will calculate the total like this:
        double totalCost = 0;
        for (Item each:list) {
           totalCost += each.calcCost();
        }
        System.out.println("Total price of all items purchased: $"+totalCost);
        System.out.println("*****************************************");

        // using the regular loop I will also print out each item details
        // we can also start from last index decrementing to index 0 because any way will calculate all items prices
        for (int i = 0 ; i < list.size(); i ++){
            System.out.println(list.get(i));
        }

    }
}
