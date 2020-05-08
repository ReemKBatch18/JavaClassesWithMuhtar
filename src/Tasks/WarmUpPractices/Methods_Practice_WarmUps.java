package Tasks.WarmUpPractices;
/*
warm up tasks:
    1. write a method called KmToMiles that can convert km to miles
                    1 km = 0.612 miles
    2. write a method called GalonsToLitters, that can convert gallons to litters
                   1 G = 3.75 L
    3. write a method called Calculation, that can accepts 3 parameters: 2 numbers and one operator, and prints out the calculation
        if operator is not between [-, +, *, /, %] output should be Invalid Operator
        Ex: calculate(10, 2, "*") ==> 20;
    4. write a method called Grade, that can print out the grade based on the score of the student
            if score is 100 ~ 90 ==> A
            if score is 89 ~ 80 ==> B
            if score is 79 ~ 70 ==> C
            if score is 69 ~ 60 ==> D
            if score is 0 ~ 59 ==> F
            otherwise ==> Invalid Score
        Ex:
            Grade(100); ==> A
            Grade(120); ==> Invalid
 */
public class Methods_Practice_WarmUps {
    // These are our methods
    // Task 1.
    public static void KmToMiles(double km){
        System.out.println("Enter number of Km: " + km);
        double miles = km *0.612;
        System.out.println(km + " Km = "+ miles + " miles");
    }
    // Task 2.
   public static void GallonsToLiters (double gallons){
       System.out.println("Enter number of gallons: " + gallons);
       double liters = gallons *3.75;
       System.out.println(gallons + " gallons = "+ liters + " liters");
   }
   // Task 3.
    public static void Calculation(double num1, double num2, String operator){
        System.out.println("Enter two numbers and and operator: (" + num1+", "+num2+", "+operator+")");
        if (operator == "-"){
            System.out.println("Calculate( "+ num1+", "+num2+", "+operator+" ) = " + (num1 - num2));
        }else if (operator == "+") {
            System.out.println("Calculate( " + num1 + ", " + num2 + ", " + operator + " ) = " + (num1 + num2));
        }else if (operator == "*") {
            System.out.println("Calculate( " + num1 + ", " + num2 + ", " + operator + " ) = " + (num1 * num2));
        }else if (operator == "/") {
            System.out.println("Calculate( " + num1 + ", " + num2 + ", " + operator + " ) = " + (num1 / num2));
        }else if (operator == "%") {
            System.out.println("Calculate( " + num1 + ", " + num2 + ", " + operator + " ) = " + (num1 % num2));
        }else{
            System.out.println("Invalid Operator");
        }
    }
    //Task 4.
    public static void Grade (int score){
        System.out.println("Enter score: "+ score);
        if (score <= 100 && score >= 90){
            System.out.println("Your grade is: A" );
        }else if (score <= 89 && score >= 80){
            System.out.println("Your grade is: B" );
        }else if (score <= 79 && score >= 70){
            System.out.println("Your grade is: C" );
        }else if (score <= 69 && score >= 60){
            System.out.println("Your grade is: D" );
        }else if (score <= 59 && score >= 0){
            System.out.println("Your grade is: F" );
        }else {
            System.out.println("Invalid score");
        }
    }


    // This is our MAIN method to print methods we created
    public static void main(String[] args) {
        KmToMiles(5);
        System.out.println("===========================");
        GallonsToLiters(5);
        System.out.println("===========================");
        Calculation(10,2,"*");
        System.out.println("===========================");
        Grade(60);





    }
}
