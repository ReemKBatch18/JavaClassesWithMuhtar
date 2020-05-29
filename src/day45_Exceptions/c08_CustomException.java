package day45_Exceptions;

// I will create a custom exception called BreakTimeException
// if we want it to be unchecked exception ==> it has to extend RuntTimeException
// Any exception that occurs during run time is an unchecked exception
class BreakTimeException extends RuntimeException{
    //constructor for this class
    public BreakTimeException(){
        super("it's break time, we should take a break");
    }

    // another constructor with argument
    public BreakTimeException(String str){
        super(str);
    }
}

public class c08_CustomException {
    public static void main(String[] args) {
        boolean breakTime = true;
        if (breakTime){
        //to manually throw the exception
       // we use throw keyword with object from exception class created by its constructor
        throw new BreakTimeException("let's have a break");
        // this message (let's have a break) will print on the console with the exception name
        // if we don't use an argument in the above constructor then when we run it will print:
            // "it's break time, we should take a break" from default constructor
        }else {
            System.out.println("continue the class");
        }

        throw new RuntimeException("it's break time, we should take a break");
    }
}
