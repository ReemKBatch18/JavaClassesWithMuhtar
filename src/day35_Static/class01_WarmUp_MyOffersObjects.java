package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called MyOffers
	Create 5 offer objects, and add them into the list of offers, and then:
			1. use for loop to print out the info of each offer
			2. write a program that can only retain the offers if:
					1. the offer is for fulltime position
					2. offer is from your local area
					3. salary is greater than 100K
 */
public class class01_WarmUp_MyOffersObjects {
    public static void main(String[] args) {

        // we create our objects
        // then we initialize values to each object calling the setInfo() method
        Offer offer1 = new Offer();
        offer1.setInfo("VA", "BOA",100000, true);
       // System.out.println(offer1); //Location: VA, Company: BOA, Salary: $100000.0, FullTime: true

        Offer offer2 = new Offer();
        offer2.setInfo("KY","Capital One",120000, false );
       // System.out.println(offer2); //Location: KY, Company: Capital One, Salary: $120000.0, FullTime: false

        Offer offer3 = new Offer();
        offer3.setInfo("MD","Chase",95000,true);

        Offer offer4 = new Offer();
        offer4.setInfo("BayArea","Google",115_000,false);
     // Now I have 4 offers. I want to find out how many are full time, from local area and salary is >100000

        // Can I put my offers in some sort of list? Yes I will put them in an Array and arrayList at the same time like this:
        Offer[] offers = {offer1, offer2, offer3, offer4};
        // Here I will add String myLocation = "VA" as my local area to use in deciding which offer I want to keep
        String myLocation = "VA";
        // Now I want to add this array into the arrayList Accept that I am creating then I will delete what I dont' want
        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList(offers));
        // to know how many offers are there I can use size() method
        System.out.println(Accept.size()); // 4

        // to remove offers I don't want like less than 100000 and that is not full time, and not local
        // ==>I can use removeIf() method like this:
        // and use boolean expression: in my case salary < 100000 || isFullTime == false || ! location.equals(myLocation)
        Accept.removeIf( each -> each.salary < 100000 || each.isFullTime == false || ! each.location.equals(myLocation));
        for(Offer eachOffer: Accept){
            // this will print what is left from offers that matches my conditions
            System.out.println(eachOffer);
        }








    }
}
