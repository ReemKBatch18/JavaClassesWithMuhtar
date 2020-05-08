package day18_NestedLoop;

public class NestedLoop {

    public static void main(String[] args) {

        for ( int n = 1 ; n <= 10 ; n++) {
            for (int i = 1; i <= 5; i++) { //this loop will print me 1 2 3 4 5
                System.out.print(i+ " ");
            }
            System.out.print(" "); // or we can use println() to print each 1 2 3 4 5 on a different line

        }

        System.out.println();
        System.out.println("=============================================================================");
            /*
             *******  7 horizontal and 7 vertical
             *******
             *******
             *******
             *******
             *******
             *******
            */

            for (int i = 0 ; i < 10 ; i++) {
                int a = 1;
                while (a <= 10) { // whatever we change inner loop it will change what's printing in one line
                    System.out.print("* ");
                    a++;
                }
                System.out.println();
            }

        System.out.println("Hello");






    }
}
