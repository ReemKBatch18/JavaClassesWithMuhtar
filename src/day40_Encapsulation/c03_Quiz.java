package day40_Encapsulation;

public class c03_Quiz { // question 11

    public c03_Quiz(){          // constructor w no arg
        System.out.println("A");
    }

    public c03_Quiz(int a){     // constructor w int
        this(2.5);
        System.out.println("B");
    }

    public c03_Quiz(double a){  // constructor w double
        this();
        System.out.println("C");
    }

    public static void main(String[] args) {
        c03_Quiz obj = new c03_Quiz(100);
        // the constructor with int arg will be executed
        //first line it's calling the cons with double
        // con w double ==> it's calling default first ==>A
        // then it prints C
        // then B
        // ACB will print
    }
}
