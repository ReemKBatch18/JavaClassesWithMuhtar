package day45_Exceptions;

public class c04_throwsKeyword3 {

    public static void method1() throws Exception{
        // by using throws keyword == means the method (main method in our case) throws exception
        Thread.sleep(3000);
        // if method is needed to be called somewhere else.. calling method must throw exception
    }

    // here is my main
    public static void main(String[] args) {
    //    method1();
    }
}
