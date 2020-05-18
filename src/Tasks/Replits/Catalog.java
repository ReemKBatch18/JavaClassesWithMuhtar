package Tasks.Replits;

import java.util.ArrayList;
import java.util.Arrays;

/*
Catalog Project based on Catalog custom class.

Each instance ArrayList will contain relative product information.
items => all items
prices => prices for each item
monthlyPayments => monthly payments if you decide to finance

Each piece of information matches by index in ArrayLists.

index of "iPhone 6s Plus" is 1 in items ArrayList, to find its price I need to look at index 1 in prices and monthlyPayments ArrayLists.

Carefully Follow instructions on top/inside of each instance method and  and run the unit tests until you pass all of them.
 */
public class Catalog {
    public ArrayList<String> items = new ArrayList<>();
    //    items.addAll(Arrays.aslist("iPhone 6s", "iPhone 6s Plus", "iPhone X", "MacbookPro",
      //          " ThumbDrive","Beats HeadPhones"," Mouse", "Charger", "iPad","Dyson Vacuum","TV","Apple Watch"));
    //items.addAll(Arrays.asList("iPhone 6s", "iPhone 6s Plus", "iPhone X", "MacbookPro",
          //  " ThumbDrive","Beats HeadPhones"," Mouse", "Charger", "iPad","Dyson Vacuum","TV","Apple Watch"));
    ArrayList<Double> prices = new ArrayList<>(Arrays.<Double>asList(449.0,549.0,1149.0,1499.99,
            39.99,349.99,79.99,39.99,429.0,399.0,2199.0,559.0));
    ArrayList<Double> monthlyPayments = new ArrayList<>(Arrays.asList(18.71,22.88,56.16,79.49,
            2.68,15.12,8.98,4.56,18.31,16.25,89.49,21.18));



}
