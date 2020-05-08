package day35_Static;
/*
Create a class called Offer that has:
	instance fields :
			location, company, salary , isFullTime
	instance methods :
		setOfferInfo: can set the location, company, salary , isFullTime of the offer
		toString -- return all info about offers
 */
public class Offer {
    // Here we create our attributes of this class Offer = instance variables
    String location;
    String company;
    double salary;
    boolean isFullTime;

    // we create our first instance method: setOfferInfo() and pass parameters like this:
    public void setInfo(String location, String company, double salary, boolean isFullTime){
        // whatever user passes in the parameters of this method will get assigned to our instance variables one by one
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        // when we call this method, it will executes this assigning for us using whatever user passes in parameter
        // Why do we create this method? because it saves us time when assigning those variables to our object instead of assigning each variable one by one
    }

    // here we need to create our toString() method for compiler to know how to print our object once we pass it in print statement
    public String toString(){
        // we return what we need to see when we print our objects offer1, offer2,...
        return "Location: "+location+", Company: "+company+", Salary: $"+salary+", FullTime: "+isFullTime;
    }

}
