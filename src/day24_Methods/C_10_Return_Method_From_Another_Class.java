package day24_Methods;

import java.util.Arrays;
import RESOURCES.Library;
public class C_10_Return_Method_From_Another_Class {

  // MAIN PURPOSE OF HAVING STATIC AS SPECIFIER IS TO BE ABLE TO CALL METHODS FROM OTHER CLASSES THAT ARE IN THE SAME PACKAGE
  // IF WE NEED TO USE A METHOD LOCATED IN A CLASS WHICH IS NOT IN THE SAME PACKAGE LIKE HERE WE NEED TO IMPORT THE CLASS
  // TO IMPORT CLASS : import packageName.className;
    public static void main(String[] args) {
        String str = "Reem";
       // Since our method's specifier is "static" then we can call a method from another class
        // we call by : classname.method's name
        // Then assign to the right data type
        String RevStr = Library.Reverse2(str);
        // We are calling Reverse2 method from Library class which is from a different package called RESOURCES

        System.out.println(RevStr); //meeR


        int [] arr = {1234,456,4785,5478,2000};
        // in order to sort in descending order we can call the descedning method from the other class (where we created it)

        arr = Library.sortDescend(arr);
        System.out.println(Arrays.toString(arr));







    }
}
