package day33_CustomClass;

public class class07_carObjects {
    public static void main(String[] args) {

       Car car1 = new Car(); // we are calling from Car class
       car1.Brand = "BMW";
       car1.Model = "X5";
       car1.year = 2020;
       car1.color = "Red";


        System.out.println(car1.Brand); // instance variables are object variables, we can call them through the object name
        System.out.println(car1.Model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        car1.start();   // BMW is started (we called the start() method from this object car1)
        car1.drive();   // Driving BMW (we called the drive() method from this object car1)
        car1.getCarInfo();  // 2020 BMW X5 Red

        System.out.println("===========================================");

        // Can I create more objects from the class I created? Yes I can:
        Car car2 = new Car();
        car2.Brand = "Toyota";
        car2.Model = "Corolla";
        car2.year = 2020;
        car2.color = "White";

        System.out.println(car2.Brand);
        System.out.println(car2.Model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        // every single object has their own copy of the instance variable

        car2.start(); // Toyota is started (we called the start() method from this object car2)
        car2.drive();
        car2.getCarInfo();      //  2020 Toyota Corolla White

        System.out.println("============================================");

        Car car3 = new Car();
            car3.Brand = "Mercedes";
            car3.Model = "C Class";
            car3.year = 2020;
            car3.color = "Black";

        car3.getCarInfo();      //  2020 Mercedes C Class Black
        car3.drive();

        System.out.println("==========================================");
        String str = "A";
        String str2 = "B";

        String [] arr = {str, str2};
        // can we store these 3 cars in one array?
        Car[] cars = {car1, car2, car3};
        // can I get info of each car calling the getCarInfo () method with each index of this array? yes I can
        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();

        /*
        create 5 car objects,
        put them in an array of cars
        use For loop to get each car info
        use Fo each loop to get each car info
         */







    }
}
