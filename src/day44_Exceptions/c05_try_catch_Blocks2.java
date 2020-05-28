package day44_Exceptions;

public class c05_try_catch_Blocks2 {

    public static void main(String[] args) {

        System.out.println("hello");

        try{            // if try block fixes the exception ==> "try block" will print
            Thread.sleep(2000);
            System.out.println("try block"); // system prints "try block"

        }catch(Exception e){    // either try block or catch block handle exception ==> block gets executed
            System.out.println("catch block"); // catch block always handles unexpected events
        }

        System.out.println("world");    // after handling the exception ==> after 2 seconds prints "world"
    }
}
