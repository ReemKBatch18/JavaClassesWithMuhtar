package day06_Shorthand_LogicalOperators;

public class IfStatementsPractice {
    public static void main(String[] args) {
        int a = 200;
        int b = 300;

        if (a > b) { // false
            System.out.println(a + "  is greater than " +b); // false ==> it will not get excuted or printed
        }
        boolean bGreater = b>a;
        if (bGreater ){ // true
            System.out.println(b + " is greater than " + a);
        }
        if (a==b) {
            System.out.println(a + " is equal to " + b);
        }
            System.out.println("============================================================================");

            int x = 200;
            int y = 100;
            boolean xGreater = x > y;
            boolean yGreater = y > x;

            if (xGreater) {
                System.out.println(x+ " is greater than " +y);
                            }
            if (yGreater);{
                System.out.println(y + " is greater than " +x);
        }
            if (xGreater == false && yGreater == false) {
                System.out.println(x + " is equal to " + y);
            }

            int apples = 5;
            int oranges = 5;
            if (apples > oranges) {
                System.out.println("I have more apples than oranges.");
            }
            if (apples < oranges){
                System.out.println("I have more oranges than apples.");
            }
            if (apples == oranges){
                System.out.println("I have same amount of oranges and apples.");
            }

            String userName = "abc";
            if (userName == "abc") {
                System.out.println("Access granted.");
                System.out.println("Welcome Agent!");
            }

            int books = 50;
            if (books < 100);
            //books = books + 10;
            books +=10;
        System.out.println(books);

        boolean hot = true;
        if (hot){
            System.out.println("Can I have some ice?");
        }
        int age = 70;
        if (age >= 18){
            System.out.println("Eligible for voting.");
        }

            }
}
