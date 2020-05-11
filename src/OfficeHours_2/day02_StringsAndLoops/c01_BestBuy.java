package OfficeHours_2.day02_StringsAndLoops;

public class c01_BestBuy {
    // maybe I want this to be a representation in real world
    // from there i'll make specific characteristics of it = objects
    // creating a copy of what we're trying to make
    // define all characteristics from it:
    String location;
    int numberOfEmployees;
    String phoneNumber;
    // a class is a representation of something.. create a class and define instance variables in class
    // then make objects out of them
    // instance variables will be unique for each object we create
    // imagine BESTBuy are getting all their computers from the same warehouse
    // this means that warehouse doesn't belong to a certain object ==> it belongs to the class itself
    static int numberOfComuters; // it is shared with any object we create

  public void close(){
        System.out.println("This BestBuy is closed");

    }
    public static void closeAll(){
        System.out.println("All BestBuy stores are closing");
    }


}
