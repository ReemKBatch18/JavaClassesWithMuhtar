package day14_StringClass;

public class StringManipulations {

    public static void main(String[] args) {

        //indexof() returns first index of
        String str = "I like to learn Java. I like to watch the movie Jumanji";
        int a1 = str.indexOf("J"); // returns index num of first matching J
        System.out.println(a1);
        int a2 = str.indexOf("Jum"); // used to return index number of J in Jumanji
        System.out.println(a2);
        int a3 = str.indexOf(" I")+1; //to return index of l in second like
        System.out.println(a3);

        String s = "I like Java, and I like reading";
          int b1 =  s.lastIndexOf("I");
        System.out.println(b1);
          int b2 = s.lastIndexOf("l");
        System.out.println(b2);

        String z = "I like C#, C# is cool";
        //to return first C
        int c1 = z.indexOf("C");
        System.out.println(c1);
        // to return second C
        int c2 = z.lastIndexOf("C");
        System.out.println(c2);

        String x = "I like Java, Java is fun, Java programming is fun";
        // find index of second J
        int d1 = x.indexOf("Java is"); // pick a unique value of this J
        System.out.println(d1);
        //or
        int d2 = x.indexOf(", J")+2; //first matching will be returned
        System.out.println(d2);

        //to find the last J, we can use lastindexof()
        int d3 = x.lastIndexOf("J");
        System.out.println(d3);
        //or indexof() with unique string
        int d4 = x.indexOf("Java p");
        System.out.println(d4);

        // to return the char at an index number:
        char ch1 = x.charAt(26);
        System.out.println(ch1); //J




    }
}
