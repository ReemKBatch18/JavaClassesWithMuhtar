package day41_Inheritance;

public class c07_Book {
    /*
    title
    author
    price
     */

   // we give public access modifier so we can use variables everywhere
    public String title;
    public String author;
    public double price;

    //we will create toString() method here ==> will be inherited in EBook and in AudioBook
    public String toString(){
        return "Book Title: "+title+", Author: " + author+ ", For: $"+price;
    }
}
