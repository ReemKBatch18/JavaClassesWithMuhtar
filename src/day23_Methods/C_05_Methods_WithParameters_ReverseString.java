package day23_Methods;

import com.sun.org.apache.regexp.internal.RE;

public class C_05_Methods_WithParameters_ReverseString {
// create a function that can reverse any string

    // first we ask: Do we need a parameter for creating this method??
    // do we need any extra information to perform the function? if yes ==> parameter
    // If name is "Reem" ==> function will print "meeR"
    // based on the info given ==> result different

    // let's create our method:
    public static void ReverseString(String str){
        // how do we right the function to reverse it? by using loop starting from last index with decrement iterator
        for (int i = str.length()-1 ; i >=0; i--){
            System.out.print(str.charAt(i));
            }
        System.out.println();
    }


   //THIS IS OUR MAIN METHOD TO CALL OTHER METHODS WE CREATED
    public static void main(String[] args) {

        String name = "Reem";
        ReverseString(name);        // meeR

        String name2 = "Khalil";
        ReverseString(name2);       // lilahk


    }


}
