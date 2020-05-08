package day15_ForLoop;

public class ForLoop {
    public static void main(String[] args) {

/*
        for(int i = 0 ; i < 5; i-- ){ //i = 5
            System.out.println("Hello World");
        }
*/

        for(int i =1; i <= 10; ++i ) { // i++: 1,2,3,4,5,6,7,8, 9, 10
            // i+=2: 1, 3, 5, 7, 9, 11
            System.out.println(i+" : " + (i*i));
        }







    }
}
