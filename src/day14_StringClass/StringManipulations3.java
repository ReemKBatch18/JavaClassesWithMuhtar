package day14_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {
        String str1 = "CYBERTEK";
        String str2 = "cybertek";
        System.out.println(str1.equals(str2));// false
        System.out.println(str1.equalsIgnoreCase(str2));// true, ignores case sensitivity

        String s1 = "Cybertek School";
        // to verify if s1 contains school:
        boolean r1 = s1.contains("School"); // true - case sensitive
        System.out.println(r1);

        String s3 = "United States";
        System.out.println(s3.startsWith("U")); // true - case sensitive









    }
}
