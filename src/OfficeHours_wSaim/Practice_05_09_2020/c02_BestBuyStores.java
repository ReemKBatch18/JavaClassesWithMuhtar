package OfficeHours_wSaim.Practice_05_09_2020;

public class c02_BestBuyStores {

    public static void main(String[] args) {
        c01_BestBuy store1;
        // this is a reference. But when we do this using the new keyword:
        store1 = new c01_BestBuy(); // this is now an object
        store1.numberOfComuters = 10;   //  calling static variable from object
        store1.numberOfComuters--;  //  9
        System.out.println(c01_BestBuy.numberOfComuters);   //  9 calling static variable from class

        store1.close(); //This BestBuy is closed

        // a static method is called by class name like this:
        c01_BestBuy.closeAll(); //All BestBuy stores are closing





    }
}
