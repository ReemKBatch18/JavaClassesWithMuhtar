package day42_Inheritance;

/*
public      = accessible at everywhere, visible to world
protected   = visible in same package, visible in sub class outside package
default     = only visible in same package
private     = only visible within the same class

private:     can never be inherited in sub class
default:     can be inherited as long as sub class is in the same package
protected:   can be inherited always to any subclass
public:      can be inherited always to any subclass

To sort according to visibility: PUBLIC > PROTECTED > DEFAULT > PRIVATE

Super Class CAN NOT inherit anything from Sub Class


 */
public class c01_Data {
    // in order to get the access modifier: we add public, protected, private (no need to add default keyword)
    public static String publicData = "public";
    protected static String protectedData = "protected";
    static String defaultData = "default";
    private String privateData = "private";
}


// here we will test access modifier more:
// i'll create class called testing
// testing and Data are in the same package but they are different classes
// if I extend Data to testing ==> I will be able to inherit: public, protected, and default variables BUT NOT private
class testing extends c01_Data {
// public , protected , default are now visible in this class ==> I can call them through class name:
public static void main(String[] args) {

    System.out.println((testing.publicData));
    System.out.println(testing.protectedData);
    System.out.println(testing.defaultData);
  //System.out.println(testing.privateData); // private can never be inherited
}

}

