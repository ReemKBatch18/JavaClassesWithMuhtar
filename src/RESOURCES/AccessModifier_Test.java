package RESOURCES;
import day39_AccessModifiers.c03_AccessModifiers;
public class AccessModifier_Test {
    // This class is not in the same package with c03_AccessModifier class
    // c03_AccessModifier class from day39_AccessModifiers package

    public static void main(String[] args) {

        // to create an object from c03_AccessModifier class I need to import it here first

        c03_AccessModifiers obj = new c03_AccessModifiers();

    //    System.out.println(obj.defaultAccess); // default: only accessible in same package
        System.out.println(obj.publicAccess); // public : accessible everywhere


    }
}
