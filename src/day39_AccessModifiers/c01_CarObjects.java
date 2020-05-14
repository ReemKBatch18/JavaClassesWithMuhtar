package day39_AccessModifiers;

public class c01_CarObjects {
    // our main method so we create our objects:
    public static void main(String[] args) {

        // 1st object: car2:
        // we will use 1st constructor:
        Car car1 = new Car("Toyota");
        System.out.println(car1); // 0 Toyota null $0.0 : only brand was initialized => all other values are default value

        // 2nd object: car2:
        // we will use 2nd constructor:
        Car car2 = new Car("BMW", "X6");
        System.out.println(car2); // 0 BMW X6 $0.0 : brand and model were initialized ==> other variables have default values

        // 3rd object: car3
        // we will use 3rd constructor:
        Car car3 = new Car("Lexus", "RX", 2020);
        // when this constructor gets executed: first step is calling 2nd constructor with brand and model)
        // next step is initializing the year
        System.out.println(car3); // 2020 Lexus RX $0.0: brand, model, year are initialized

        // 4th object : car4
        // we will use 4th constructor:
        Car car4 = new Car("Tesla", "Model 3", 2020, 40000);
        System.out.println(car4); // 2020 Tesla Model 3 $40000.0
    }
}
