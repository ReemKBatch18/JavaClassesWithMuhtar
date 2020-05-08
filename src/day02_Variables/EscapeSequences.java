package day02_Variables;

public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("\tHello");
        System.out.println("\t\t\tHello");
        // \t means a paragraph space
        System.out.println("Cybertek School");
        System.out.println("Cyberteck\nSchool");
        // \n moves what's after to a new line
        System.out.println("\nMy\nName\nIs\nReem");
        // \n means new line, starts with new line

        //print: My favorite TV show is "Game of Thrones"
        System.out.println("My Favorite TV show is \"Game of Thrones\"");
        //to print double quote " we need to puyt \" before then \" after

        System.out.println("My favorite book is \"The Power of the Subconcious Mind\"");
        System.out.println("\\");
        // when we need single slash \ we need to put \\ and then one \ will print
        // backword slash / can be printed as is /

        System.out.println("My favorite book is 'Java'");
        //single quote ' can be printed by adding it. nothing needs to be before or after.



    }



}
