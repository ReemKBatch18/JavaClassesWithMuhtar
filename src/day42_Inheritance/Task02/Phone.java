package day42_Inheritance.Task02;
/*
create a sub class called phone:
				attributes: brand, model, price, country
				methods: call, text,  toString
 */
public class Phone extends Device {
     /*
    brand,      (inherited)
    model,      (inherited)
    price,      (inherited)
    country,    (inherited)
    type        (inherited)
    size        (inherited)

    setDevice() (inherited)

	call()
	text()
	toString()  (inherited)
     */

     // we need to make sure that variables can be initialized as soon as we create the object==>
    // ==> we create a constructor to initialize them
    // Constructor : pass 4 parameters only because type = Phone and country = China
    public Phone(String brand, String model, double price, String size){
        setDevice(brand, model, price, "Phone", size);
        // this constructor allows us to initialize brand, model, price, and size. Type will be initialized to Phone
    }
    public void call(long number){
        System.out.println("Calling the number: "+number);
    }
    public void text(long number){
        System.out.println("Texting to: "+number);
    }
}
