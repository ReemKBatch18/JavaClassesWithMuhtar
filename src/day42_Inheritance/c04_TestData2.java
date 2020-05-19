package day42_Inheritance;

public class c04_TestData2 extends c03_AccessModifier {
    // now testdata inherited acessmodifier class ==> public, protected, default variables and methods can be used here

    public static void main(String[] args) {
    // since we declared the variables in access modifier class as static ==> we can call them through class name
    // here we will call the variables BUT private variable cannot be called into inherited
        System.out.println(c04_TestData2.publicVariable);
        System.out.println(c04_TestData2.protectedVariable);
        System.out.println(c04_TestData2.defaultVariable);

    // here we will call the method that were created in AccessModifier class into here
    // only public, protected, and default methods only can be inherited and used here
        c04_TestData2.publicMethod();
        c04_TestData2.protectedMethod();
        c04_TestData2.defaultMethod();

        // because they are static method we can call them like this too
        publicMethod();
        protectedMethod();
        defaultMethod();
    }
}
