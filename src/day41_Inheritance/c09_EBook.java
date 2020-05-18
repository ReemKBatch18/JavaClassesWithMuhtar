package day41_Inheritance;

public class c09_EBook extends c07_Book {
        /*
        title   (inherited)
        author  (inherited)
        price   (inherited)
        toString() (inherited)

        size
        pages
        readbook()
         */

    // Visible variables and methods from Book class are inherited in this class
   // public access modifier
    public String size;
    public int pages;
    //I declared 2 variables and inherited 3 ==> I have 5 instance variables

    public void readbook(){
        System.out.println("Reading "+title);
    }
}
