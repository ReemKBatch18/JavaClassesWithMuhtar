package day44_Exceptions;
/*
    getMessage() method: returns the brief description of the exception

    If we are testing and an unexpected event happened at any stage while testing, are we gonna stop executing?
    NO, we can handle it and still continue testing next steps
    testCase:
            step1
            step2
            step3
            step4
            ....
            step10

   In selenium, only unchecked exceptions occur ==> try block will not print ==> compiler jumps to catch block

   When declaring a String variable to return the getMessage() method in the block ==> it is a local variable ==> can not use outside blocks
   But if we declare a String variable outside the blocks then assign it inside to getMessage(), we can use it outside block
 */
public class c06_ExceptionHandling {

    public static void main(String[] args) {

        String str = "cybertek";

        try{
            System.out.println(str.charAt(100));    //  index out of bound
        }catch (RuntimeException e){
            // we will call getMessage() method which returns a string as description of the exception
            String description = e.getMessage();
            System.out.println(description);        // prints: String index out of range: 100
        }


            // I will declare try catch blocks
        try {
            System.out.println(100 / 0); // unchecked exception ==> name is ArithmeticException
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());     // prints: / by zero
        }
        System.out.println("completed");

    }
}
