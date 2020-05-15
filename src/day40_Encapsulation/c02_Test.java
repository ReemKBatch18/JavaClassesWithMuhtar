package day40_Encapsulation;

public class c02_Test {
    public static void main(String[] args) {

        // new object from c01_EncapsulationINtro class
        c01_EncapsulationIntro obj = new c01_EncapsulationIntro();
     //   System.out.println(obj.SSN); // private variable = no direct access

        // Now we will call the GETTER to call the PRIVATE variable like this:
        System.out.println(obj.getSSN());

        // since we cannot get to our private directly we can NOT do this:
        // obj.SSN = 123456789;

        obj.setSSN(123456789);
     //   System.out.println(obj.SSN); // can't get private data like this = compiler error

        // to get the private data:
        System.out.println(obj.getSSN()); // 123456789
    }
}
