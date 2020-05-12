package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

    /*
    Task04:
        create a class called Item
                instance variables:
                    name, unitPrice, quantity
                add a constructor that can initialize the fields
                instance methods:
                    calcCost(): returns the total cost as double
                                hint: quantity * unitPrice
                    toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
        create a class called ShoppingList
                create 5 objects of Item and store them into List of Items
                calculate the total cost of all Items in the list
     */
    public class Item {
        // instance variables:
        String name;
        double unitPrice;
        int quantity;

        //Constructor: to initialize instance variables
        // since we have 3 instance variables ==> we will pass 3 variables in the parameter
        public Item(String name, double unitPrice, int quantity){
            // because names of instance variables = names of variables in my arguments ==> use this. to refer to instance variables
            this.name = name;
            this.unitPrice = unitPrice;
            this.quantity = quantity;
            // now by doing this: once we create our objects using the Constructor: we will initialize the instance variables of each object
        }

        // instance method: to calculate cost
        // We can not make this method static because we need to use our instance variables here
        // we use Instance method to use Instance variables like this:
        public double calcCost(){
            return unitPrice*quantity;
            // instance means every single object has its own copy
            // each object will return different value from this method (it will return its own copy depending on its price and quantity)
        }

        // instance method : toString() to specify how we want to print our item information
        public String toString(){
            return "Item: "+name+", Unit price: $"+unitPrice+", Quantity: "+quantity+
                    "\nTotal Cost of Item: $"+calcCost();
        }
    }





