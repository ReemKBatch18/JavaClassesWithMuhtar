package day42_Inheritance;

/*
public = accessible at everywhere, visible to world
protected = visible in same package, visible in sub class outside package
default = only visible in same package
private = only visible within the same class

private:     can never be inherited in sub class
default:     can be inherited as long as sub class is in the same package
protected:   can be inherited always to any subclass
public:      can be inherited always to any subclass

To sort according to visibility: PUBLIC > PROTECTED > DEFAULT > PRIVATE
 */
    public class c02_TestData extends c01_Data {
    // TestData inherited DaTa class ==>
    // protected and public variables are inherited
    // Also default variable is inherited because both classes are in the same package
    // private variable is NOT inherited
    public static void main(String[] args) {

        System.out.println(c02_TestData.publicData);
        System.out.println(c02_TestData.protectedData);
        System.out.println(c02_TestData.defaultData);
     // System.out.println(TestData.privateData); PRIVATE VARIABLE CAN NEVER BE INHERITED

    }

}
