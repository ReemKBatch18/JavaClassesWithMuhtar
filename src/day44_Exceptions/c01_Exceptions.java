package day44_Exceptions;
/*
Exceptions:
        unchecked and checked exception
        try and catch blocks
        multi-catch blocks
        finally block
        throws
        throw
        Custom Exception

Exceptions: are unexpected or unwanted events
Two types of exceptions:
        1. unchecked : unexpected event ==> only occurs during run time.
                        Code fragments before UNCHECKED EXCEPTIONS (runtime exceptions) get executed.
                        RuntimeException is the parent of all unchecked exceptions
        2. checked  : unwanted event ==> occurs during compile time.
                        Must be handled immediately.
                        Code fragments before CHECKED EXCEPTIONS do NOT get executed.

ALL EXCEPTIONS ARE REPRESENTED BY CLASSES IN JAVA

multi-catch block:
            * we can have as many catch blocks as we want BUT only one gets executed
            * parent catch block MUST come after child  catch block. It can not come before it's child exception
            * once I give the parent class exception ==> I can not give any of the child class exception

printStackTrace()   : prints the stack trace of exception
getMessage()        : returns description of exception (returns as a String ==> can be assigned to String)

Exception Handling :
        using try and catch blocks:
            try{
                exception statement
         } catch (ExceptionClass variable name) { }

finally block :
                * always gets executed regardless of exception was handled or not
                * MUST come after try catch blocks. Can NOT exist by itself => compiler error
                try{
                }catch(){
                }finally{
                }

respective order is :
                1. try block
                2. catch block
                3. more catch blocks
                4. finally block (at the end always) DOES NOT HANDLE EXCEPTION BUT EXECUTES ALWAYS

 */
public class c01_Exceptions {
}
