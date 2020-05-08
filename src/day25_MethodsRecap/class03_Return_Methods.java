package day25_MethodsRecap;

public class class03_Return_Methods {

    public static void main(String[] args) {

        max(10,9);
        System.out.println(max (10,9));
        System.out.println(max2 (10,9));
    }

   // Return max number between two a,b
    public static int max(int a, int b){
        int max = 0;
        if (a >= b){
            max = a;
        }else{
            max = b;
        }

        return max;
    }


    // we will try the top requirement with a different approach by exiting the method earlier
    // Return max number between a , b
    public static int max2( int a , int b) {
        if (a >= b) {
            return a; // if this condition is true we will return a
        } else {

            return b; // This will only get executed if the top condition is false which means "a" will not execute or exit the method
        }
    }
}
