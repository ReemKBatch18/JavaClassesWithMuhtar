package day48_Abstraction_Interface.WarmUpTask;

public class phoneObjects {

    public static void main(String[] args) {

        // creating object from iPhone class
        iPhone iphone1 = new iPhone("X", 1000, "10 inches");
        System.out.println(iphone1); //Brand: iPhone, Model: X, Size 10 inches, Price: $1000.0
        iPhone iphone2 = new iPhone("8", 900, "8 inches");
        System.out.println(iphone2); //Brand: iPhone, Model: 8, Size 8 inches, Price: $900.0
        iphone1.faceTiming(1233445566); //iPhone is facetiming with 1233445566

        System.out.println("********************************************");

        // creating objects from Samsung class
        Samsung samsung1 = new Samsung("Note10 Plus",1200 ,"Large");
        System.out.println(samsung1);   //Brand: Samsung, Model: Note10 Plus, Size Large, Price: $1200.0
        samsung1.calling(12345678); // Samsung Note10 Plus is calling 12345678
        samsung1.freezing(); // Samsung is freezing when using
        samsung1.texting(1234555); // Samsung Note10 Plus is texting 1234555

    }
}
