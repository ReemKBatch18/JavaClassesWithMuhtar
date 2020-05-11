package day37_Constructors;
// import java.util.Arrays; // this only imports Arrays class from java util
import java.util.*; // this imports all classes in this package : java util including Array
/*
// here I will import static features from c03_Data:
import static day37_Constructors.c03_Data.staticVariable;
// now I will import static method
import static day37_Constructors.c03_Data.staticMethod;
*/
 import static day37_Constructors.c03_Data.*;
public class c02_ImportStatement {
    public static void main(String[] args) {
        // if we have an array:
        int[] arr = {1,5,7,2};
        // if we want to sort this array==> use sort() method
        // but first we need to import the Array class from java.util.Arrays package to use sort() method
        Arrays.sort(arr);

        /*
        regular imports:
        import packageName.ClassName;
        import packageName.*;

        Static imports: we can import static variables or methods... like this
        import static packageName.className.name; // this will only import either variable or method
        but if we use this syntax:
         import static packageName.className.*; // this will import all static features (variables and methods)
         */
        System.out.println(staticVariable);
        staticMethod();

    }
}
