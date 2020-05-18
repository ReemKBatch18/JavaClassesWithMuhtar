package day41_Inheritance;

public class c08_AudioBook extends c07_Book {
    /*
   title    (inherited)
   author   (inherited)
   price    (inherited)
   toString() (inherited)

   length
   narrator
   listen()
    */

    // Visible variables and methods from Book class are inherited in this class
    public String length;
    public String narrator;
    // 3 instance variables were inherited and 2 instance variables were declared ==> total is 5 instance variables I can use

    public void listen(){
        System.out.println("Listening to "+title);
    }
}
