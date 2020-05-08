package Tasks.Replits;
import java.util.Scanner;
public class Replit072_Email_StringMethods {
       public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String email = scan.next();



            if (email.contains("_")){
                String first = email.substring(0, email.indexOf("_"));
                String last = email.substring(email.indexOf("_")+1 , email.indexOf("@"));
                System.out.println(last.concat("_").concat(first).concat("@gmail.com"));
            }else{
                System.out.println(email);
            }





        }
    }

