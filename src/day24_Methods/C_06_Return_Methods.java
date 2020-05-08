package day24_Methods;

public class C_06_Return_Methods {



    // Return type here is "Void" : it only executes its function. The function is what's in the body of method
    // if we assign values to variable in the main method it will give compiler error
    // This means: in a "void" type method we can execute the function of method only once, we can not assign to variable
    public static void maxNum (int a, int b){
        if (a >= b ){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }


    //THIS IS OUR MAIN METHOD TO CALL METHODS WE CREATE:
    public static void main(String[] args) {
        // if we assign values to variable to the execution of a "void" return method, it will give compiler error
       // int a = maxNum(10,20); // compiler error WE CAN NOT ASSIGN TO VARIABLE "int a"
        // The maximum number 20 we get here can not be re-used

        Addition(10,20); //30

        //Now we can assign to a variable using a return method "int" to return us int
        int result = Addition2(10,20);
        System.out.println(result);
        int result2 = result +20 ; // 50
    }

    public static void Addition (int a, int b){     //  void method
   //     System.out.println(a+b); //30
        // we can return a data from this method.. Can we make it reusable? Yes by assigning another type other than void
    }

    public static int Addition2 (int a, int b){     //  int method

   //     System.out.println(a+b);
        // we can return a data from this method..
        // Can we make it reusable? Yes by assigning another type other than void
        // It is MANDATORY to return data from this method then
        // Return value  must match return type from method
        // If return type is void, we cannot return any value
        // Closing statement MUST be the  return statement then method is closed...
        // nothing can be executed after return statement. It exits the method.
     //   return 20; // if we write it this way, it will return us 20 whatever numbers we give as a and b
        return a + b; // Now this will add a and b when we use this method in the main method
    }
}
