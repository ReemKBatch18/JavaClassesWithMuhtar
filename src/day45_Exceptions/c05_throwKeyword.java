package day45_Exceptions;

import java.util.NoSuchElementException;

public class c05_throwKeyword {
    // whenever we have to throw exception manually we have to use throw keyword
    // each exception in java is a class
    // if it's a class, can I create an object from it? yes I can

    public static void main(String[] args) {

        // I will create an object from exception class: NoSuchElementException like the following"

        NoSuchElementException obj = new NoSuchElementException();

        // we can throw manually like this:
       // throw obj;

        // but because in Java, we will not need to use obj so ==> we can use throw and then the object immediatlely
        // (we create object by new keyword and calling default constructor of that class)
        //  In our case : new NoSuchElementException(); creates an object from this class
        //   To manually throw exception by using object from exception class:
    //    throw new NoSuchElementException();

        // BUT AFTER THIS THROW LINE: NOTHING WILL GET EXECUTED

        //ANOTHER EXAMPLE:
        boolean breaktime = true;
        if(breaktime){
            throw new RuntimeException("it's break time, we should take break");
        }

        // THROW keyword:
        //          we use it manually to throw the exception.
        //          It CREATES an exception.
        //          it DOES NOT HANDLE exception
        //          We needed when we need to throw an exception manually
        //          We create an object from an exception class but using new keyword and constructor of that class
        //          easily used to throw UNCHECKED exceptions
        //          you MUST have an object of the exception class to throw an exception manually
        //          throw keyword can throw ONE EXCEPTION at a time :
        //          because once an exception is thrown NOTHING is executed after
        //          When you manually throw exception ==> you do not handle it ==> because the purpose was to CREATE it

        // THROWS keyword:
        //          we use it to HANDLE an exception temporarily
        //          we use throws keyword in the method signature
        //          if the method is called somewhere else ==> caller method needs to throw exception again in its signature
        //          after throws keyword: order of exceptions is child to parent class ( if we wanted to use multiple classes)
        //          if I use two exception classes, it is ok if the child class is not the class that handles exception,
        //          ==> as long as parent class handles it
        //          'throws' keyword MUST BE USED IN THE METHOD'S SIGNATURE not in the body
        //          Disadvantage of throws key word ==> the CALLER of the method MUST handle exception by throwing exception
        //          if we use the 'throws' keyword in the method's sig ==> it will handle MULTIPLE of EXCEPTIONS all at once
    }
}
