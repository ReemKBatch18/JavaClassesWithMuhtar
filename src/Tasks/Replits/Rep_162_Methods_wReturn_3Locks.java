package Tasks.Replits;
/*
This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
It returns true only if both a and b are true or c is true.
https://en.wikipedia.org/wiki/Truth_table
 */
public class Rep_162_Methods_wReturn_3Locks {
    public static void main(String[] args) {

    }

    public static boolean threeLocks(boolean a, boolean b, boolean c) {

        if ((a && b ) || c == true ){
            return true;
        }else {
            return false;
        }



    }//end threeLocks
}
