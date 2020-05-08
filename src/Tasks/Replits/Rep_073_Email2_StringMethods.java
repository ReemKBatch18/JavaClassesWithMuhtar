package Tasks.Replits;
import java.util.Scanner;
public class Rep_073_Email2_StringMethods {




        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
          /*  String email = scan.next();

            String first = email.substring(0,email.indexOf("_"));
            first = first.substring(0,1).toUpperCase() +first.substring(1).toLowerCase();

            String last = email.substring(email.indexOf("_")+1 , email.indexOf("@"));
            last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

            String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
            String tDomain = email.substring(email.indexOf(".")+1);

            System.out.println("First name: "+first);
            System.out.println("Last name: "+ last);
            System.out.println("Domain: "+domain);
            System.out.println("Top-Level Domain: "+ tDomain);
            */

            int n = scan.nextInt();


            int sum=0;
            for(int i=1;i<=n;i++){
                sum +=i;
            }System.out.print(sum);


        }
    }

