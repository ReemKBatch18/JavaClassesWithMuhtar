package day14_StringClass;

public class mePractice {
    public static void main(String[] args) {

        String str = "Cybertek";
        // index num: 01234567
        //charAt(index) returns the char at the index number
        char ch = str.charAt(4);
        System.out.println(ch);// r

        //length(): returns total number of characters as int. That's why we can assign it back to int
        int totalLength = str.length();
        System.out.println(totalLength);

        String str2 = "Today is great day, Java is fun";
                    // return me maximum index .... maximum index = length - 1
        int length = str2.length();
        System.out.println(length);
        int maxIndexNum = str2.length() - 1;
        System.out.println(maxIndexNum);

        String s1 = "Cybertek";
            s1 = s1.concat(" School"); //Cybertek School
        System.out.println(s1);

        String s2 = "Java";
        System.out.println(s2.concat(" is a programming language!"));
        System.out.println(s2); // Java (only)

        s2 = s2.concat(" is a programming language!");
        System.out.println(s2); // Java is a programming language!

        String r1 = "Java is fun";
                r1 = r1.concat(" and it is easy");
        System.out.println(r1);// Java is fun and it is easy

        // toLowerCase() change to lower case
        String name1 = "CYBERTEK";
            name1 = name1.toLowerCase();
        System.out.println(name1);

        String name2= "cybertek school";
        name2 = name2.toUpperCase();
        System.out.println(name2);

        //trim() used to remove space not used (any space not separating words, letters or punctuations

        String a1= "        Today is a great day     ";
        System.out.println(a1);
        a1 = a1.trim();
        System.out.println(a1);

        //substring() returns part of the string.. using beginning index and ending index

        String s = "Reem Khalil is a future SDET student";
        String name = s.substring(0,11);
        System.out.println(name);

        String fullname = "Reem Khalil";
                        // 0123456789..
        String first = fullname.substring(0,4);
        String last = fullname.substring(5,11);
        System.out.println(first);
        System.out.println(last);








    }
}
