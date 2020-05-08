package day14_StringClass;

public class WebAddress {
    public static void main(String[] args) {
        /*
         write a program that validates if a web address is valid
        must starts with www.
        must ends with .com, or .edu, or .gov
        */
        String website = "WWW.cybertek.Gov";

        website = website.toLowerCase();

        boolean validEnding = website.endsWith(".com")||website.endsWith(".edu")||website.endsWith(".gov");

        if (website.startsWith("www.") && validEnding){
            System.out.println("Valid address");
        }else{
            System.out.println("Invalid address");
        }

    }
}
