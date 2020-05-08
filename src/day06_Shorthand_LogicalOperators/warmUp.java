package day06_Shorthand_LogicalOperators;

public class warmUp {

    public static void main(String[] args) {
        //Task 1
        double numberOfGallons = 25;
        double gallonsToLiters =numberOfGallons * 3.785;
        String result = numberOfGallons + " gallons equal to " + gallonsToLiters + " liters.";
            System.out.println(result);


        //Task 2
        double numberOfLiters = 100;
        double litersToGallons = numberOfLiters / 3.785;
        String result2 = numberOfLiters + " liters equal to " +litersToGallons+ " gallons.";
        System.out.println(result2);

        //Task 3 //1. int a = 200;
        //                    int b = -a++ + - --a * a-- % 2
        //                    b = ?
        int a = 200;
        int b = -200 + -200 * 200 % 2;
            // -200 + -40000 % 2;
            //-200 + 0 = -200
        System.out.println(b); // -200
        System.out.println(a); //200

        //Task 4
        int x = 300;
        int y = 400;
        int z = x+ y - x * y + x / y;
         // z = 300 + 400 - 120000 + 300 / 400
        // z = 700 - 120000 + 0                  =====> 300 / 400 = 0.75 but int = 0
        // z = -119300
        System.out.println(z);

    }
}
/*
warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
 */