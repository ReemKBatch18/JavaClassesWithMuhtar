package day44_Exceptions;
/*
    multi-catch block:
            * parent catch block MUST come after child  catch block. It can not come before it's child exception
            * once I give the parent class exception ==> I can not give any of the child class exception
 */
import java.util.NoSuchElementException;

public class c07_multi_catch_blocks {

    public static void main(String[] args) {

        try{
            System.out.println(100/0); // run time exception
        }catch (ClassCastException e){  // this exception class will not handle the exception again ==> will not handle
            System.out.println("class cast exception"); // nothing will print
            //will not handle ==> statement will not print
        }catch (NoSuchElementException e){
            System.out.println("no such element exception"); // nothing will print
            // will not handle ==> statement will not print
            // I can keep giving catch blocks until I handle the exception
        }catch (IndexOutOfBoundsException e){
            System.out.println("index out of bound"); // nothing will print
            // will not handle ==> will not print statement
        }catch (ArithmeticException e){ // child
            System.out.println("arithmetic"); // prints "arithmetic"
            // this one WILL handle exception ==> will print "arithmetic"
            // we can give more catch blocks but only one will handle
        }catch (RuntimeException e){ // parent
            //even though this one is correct but since the previous catch block handled exception ==> no more catch blocks will execute
            System.out.println("runtime"); // nothing will print
        }catch (Exception e){       // grandparent
            System.out.println("exception");
        } // child class comes before parent and parent comes before grandparent


    }
}
