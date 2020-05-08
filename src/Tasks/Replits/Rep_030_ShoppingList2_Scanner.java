package Tasks.Replits;

import java.util.Scanner;

public class Rep_030_ShoppingList2_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();
        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();

        String report = "";
        double totalPrice=0;

        if (count1>0){
            totalPrice += count1*price1;
            report += "Item1: "+item1+ " Price: "+ (count1*price1);
        }
        if (count2>0){
            totalPrice += count2*price2;
            report += ", Item2: "+item2+ " Price: "+ (count2*price2);
        }
        if (count3>0){
            totalPrice += count3 * price3;
            report += ", Item3: "+item3 + " Price: "+ (count3 * price3);
        }
        System.out.println(report);
        System.out.println("Total price: " +totalPrice);









    }
}
