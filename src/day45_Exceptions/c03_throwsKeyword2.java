package day45_Exceptions;

public class c03_throwsKeyword2 {

    public static void main(String[] args) throws Exception {
        // if we need to handle the exception with try catch ==> we will need to use it multiple times
        // but if we use the 'throws' keyword in the method's sig ==> it will handle all of them at once
        System.out.println("java");
        Thread.sleep(3000);
        System.out.println("cyber");
        Thread.sleep(3000);
        System.out.println("batch18");
        Thread.sleep(4000);
        System.out.println("complete");
    }
}
