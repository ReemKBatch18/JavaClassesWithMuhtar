package day37_Constructors;

public class c08_StaticsReviews_5 {
}

class Test1{            // question 10
    int Inum = 10;  // 2 copies of Inum: each object has its own. We have 2 objects

    public static void main(String[] args) {
        Test1 obj1 = new Test1();
        obj1.Inum = 20; // now we assigned a new value to this instance variable
        // obj1's own copy of instance variable Inum is 20 (not 10)

        Test1 obj2 = new Test1(); // since instance variable is already initialized as 10 ==> default value is 10 and not 0

        System.out.println(obj2.Inum); // this will print the default value which is in this case 10 becuase it is given like this before

        // if our variable was static ==> then we initialize a value to it, this value will be used for all objects
        // if a value of a static object was RE-INITIALIZED ==> the new value will be used
    }
}
