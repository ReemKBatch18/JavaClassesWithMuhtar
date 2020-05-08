package day14_StringClass;

public class practice {

    public static void main(String[] args) {

        String gmail = "cybertekschool@gmail.com";
        String userinputGmail = "Cybertekschool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userinputGmail); //false

        if (result){
            System.out.println("Logged in");
        }

        System.out.println("========================================");
        /* Valid password must contain a special character such as (!,_,$)
        valid password should not contain spaces*/
        String PassWord = "aabb1234";
        if(PassWord.contains(" ")){
            System.out.println("Password cannot have space in it");//this print if aabb 1234
        }else{
            System.out.println("valid password");
        }
        System.out.println("=======================================");

        // every website has "www." at the beginning of the web address
        String webAddress = "www.amazon.com";
        if (webAddress.startsWith("www.")){
            // we can't use contains because it means it can be contained anywhere in the string
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
        System.out.println("=========================================");
        // Every single gmail address ends with @gmail.com
        String email= "CybertekSchool@yahoo.com";
        if (email.endsWith("@gmail.com")){
            System.out.println("valid gmail");
        }else{
            System.out.println("Invalid gmail");
        }











    }
}
