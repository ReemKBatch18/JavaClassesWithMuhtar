public class day36_StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method executed");
        method1();

    }


    public static void method1(){
        System.out.println("Custom method executed");

    }

    static{
        System.out.println("static block executed");
    }



}
