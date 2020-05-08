package day24_Methods;

public class C_05_2MethodsCombined {

    public static void main(String[] args) {




        printHelloCybertek(); // Hello Cybertek


    }

    // This method prints : Hello
    public static void printHello(){

        System.out.println("Hello");

    }


    // This method prints: Cybertek
    public static void printCybertek(){

        System.out.println("Cybertek");
    }


    // In This method, we combined the top two methods to print : Hello Cybertek
    public static void printHelloCybertek(){
        printHello(); // Hello
        printCybertek(); //Cybertek

    }









}

