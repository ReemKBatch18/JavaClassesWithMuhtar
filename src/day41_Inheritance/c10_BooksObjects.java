package day41_Inheritance;

public class c10_BooksObjects {

    public static void main(String[] args) {

        // here we will create our Book object from EBook
        c09_EBook book1 = new c09_EBook();
        System.out.println(book1);  //  Book Title: null, Author: null, For: $0.0

        book1.title = "Hamlet";
        book1.author = "Shakespeare";
        book1.price = 20;

        System.out.println(book1);  //  Book Title: Hamlet, Author: Shakespeare, For: $20.0

        book1.size = "1.5 MB";
        book1.pages = 432;
        System.out.println("Size: "+book1.size);    //Size: 1.5 MB
        System.out.println("pages: "+book1.pages);  // pages: 432
        book1.readbook();           // Reading Hamlet

        System.out.println("=====================================");

        // here we will create our Book object from AudioBook:
        c08_AudioBook book2 = new c08_AudioBook();
        System.out.println(book2);  // Book Title: null, Author: null, For: $0.0
        book2.title = "Becoming";
        book2.author = "Michelle Obama";
        book2.price = 30;
        book2.length="19 hours and 3 minutes";
        System.out.println(book2);  //Book Title: Becoming, Author: Michelle Obama, For: $30.0
        System.out.println("Length of the Audio Book: "+book2.title+" is "+book2.length);
                //  Length of the Audio Book: Becoming is 19 hours and 3 minutes
        //if I need to put title in " " I need to add \"
        System.out.println("Length of the Audio Book: \""+book2.title+"\" is "+book2.length);
                // Length of the Audio Book: "Becoming" is 19 hours and 3 minutes

        book2.listen(); // Listening to Becoming






    }


}
