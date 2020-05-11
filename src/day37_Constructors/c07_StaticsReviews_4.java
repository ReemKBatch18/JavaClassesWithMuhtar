package day37_Constructors;
/*
Static methods can not access instance methods and instance variables directly
Instance methods can access instance methods and instance variables directly
In static methods we can not use the “this” keyword
Instance methods can also access static methods and static variables directly
 */
public class c07_StaticsReviews_4 {         // question 12
    static String name = "Aaron";

    public static void main(String[] args) { // this method gets executed NEXT right after STATIC block
        System.out.println("Daniel");
    }
    public static void print (String str){
        System.out.println(str);
    }
    static { // This method gets executed FIRST
        print(name); // name = Aaron
    }

    // answer is : Aaron then Daniel




}
