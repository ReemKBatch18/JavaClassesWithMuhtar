package day25_MethodsRecap;

public class class02_ReturnStatement_VS_SystemExit {

    public static void main(String[] args) {

        /*
        if ( 10 > 9 ){
            return;// return exits the current method only immediately
        }
        System.out.println("Hello");
        */
        method1();
        System.out.println("Hello");// this will still print on the console (because return in method1 only exits method1 but not main

        method2();
        System.out.println("Hello"); // This will not print because method2 exits the entire system.
    }

   public static void method1(){
        if ( 10 > 9){
            // can i use return statement in the void method? yes I can but only if I am not returning anything from this method.
            // I can only use to exit the method BUT never to return anything from this method (because this is a void method)
        return; // This return statement exits the current method which is method1 only. But it will not exit another method
        }
       System.out.println("Hello World"); // will not get executed becuase of return statement that will exit current method
   }

    public static void method2(){

        if ( 10 > 9 ){
            System.exit(0); // This will exit the whole system not just the current method
        }
        System.out.println("Hello World");

    }
}
