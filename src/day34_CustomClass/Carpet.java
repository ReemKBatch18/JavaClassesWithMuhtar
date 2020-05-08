package day34_CustomClass;
/*
2. create a custom class for the carpet class that should contain the following:
				instance variables:
						width, length, unitPrice, isPersian (boolean)
				instance methods:
						customOrder(): sets the carpet' width, length, unitprice, & isParsian
						calcCost(): should be able to caculate the total cost of the carpet and return it as double
						toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
			total price of carpet= (width*length)*unitprice
			if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
 */
public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    // we need to create a method htat will calculate the total price of carpet
    // (w + l ) * unitPrice
    // we will create this instance method.. to call through objects. we will calculate price based on the above instance variables
    // instance method belongs to the object and doesn't have static specifier. return type will be double (it needs to return price)
    public double calcCost(){
        double total = (width + length)* unitPrice;
        // if carpet is persian we have to add 200 to total price, we need an if statement or ternary
        if (isPersian){
            return total+200;
        }else {
            return total;
        }
        //return (isPersian) ? total +200 :total;
    }

    // in this action all I want to do I want to initialize values to the variable no need to return anything ==> we can use void
    // I need to pass parameters here, double for width, double for length, double for unitprice, boolean for persian
    // when customer gives me the width of carpet==> I need to assign it to the instance variable width
    // when customer gives me the length of carpet==> I need to assign it to the instance variable length
    // when customer gives me the unit price of carpet==> I need to assign it to the instance variable unitPrice
    // when customer give me the boolean result of carpet==> I need to assign it to the instance variable isPersian

    public void customOrder(double carpetWidth, double carpetLength, double carpetUnitPrice, boolean carpetPersian){
        width = carpetWidth;
        length = carpetLength;
        unitPrice = carpetUnitPrice;
        isPersian = carpetPersian;

    }

    public String toString(){
        // whatever we pass in this method==>will get printed when we pass the object in the print statement
        // I have to specify here what do I want to print when I pass the object in the statement
        // if I return here "Hello world" it will print me Hello world when I pass the object to be printed
        // this is what I have to do:
        return "width: "+ width+
                "\nlength: "+length+
                "\nunit price: $"+unitPrice+
                "\ntotal cost: $"+calcCost();
    }
}
