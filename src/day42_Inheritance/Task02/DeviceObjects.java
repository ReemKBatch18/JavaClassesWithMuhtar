package day42_Inheritance.Task02;

public class DeviceObjects {        //    Relationship: DeviceObjects HAS A TV
                                    //    Relationship: DeviceObjects HAS A Phone

    public static void main(String[] args) {

    // here we will create objects of TV
        TV tv1 = new TV("Samsung", "E250", 500, "40 inches");

        // let's print our object, But do we have a toString() in TV class? Yes we do. It is inherited.
        System.out.println(tv1);
        // Brand: Samsung, Model: E250, Type: TV, Size: 40 inches, Price: $500.0, Made in: China
        // we see here that it passed type: TV and country: China
        // What if we want to change the country? we call it through the object:
        tv1.country = "USA";
        System.out.println(tv1);
        // Brand: Samsung, Model: E250, Type: TV, Size: 40 inches, Price: $500.0, Made in: USA

    // here we will create objects of Phone
        // using the constructor we created with passing 4 parameters:
        Phone phone1 = new Phone("IPhone", "11", 1000, "large");
        System.out.println(phone1);
        //Brand: IPhone, Model: 11, Type: Phone, Size: large, Price: $1000.0, Made in: USA





    }

}
