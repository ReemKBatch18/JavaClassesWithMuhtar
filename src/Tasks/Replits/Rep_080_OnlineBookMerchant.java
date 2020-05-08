package Tasks.Replits;

import java.util.Scanner;

public class Rep_080_OnlineBookMerchant {
    public static void main(String[] args) {
       /*
       premium = 1 free w 5 or more
                2 free w 8 or more
      regular = 1 free w 7 or more
                2 free w 12 or more
        */
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);


        System.out.println("Is customer a premium customer?");
        boolean isPremiumCustomer = scan.nextBoolean();
        System.out.println("How many books did customer purchase?");
        int nbooksPurchased = scan.nextInt();

        if (isPremiumCustomer){
            if (nbooksPurchased >=5 && nbooksPurchased<=7){
                freeBooks=1;
            }else if(nbooksPurchased>=8){
                freeBooks = 2;
            }else {
                freeBooks = 0;
            }
        }else if (!isPremiumCustomer){
            if (nbooksPurchased >=7 && nbooksPurchased<=11){
                freeBooks=1;
            }else if(nbooksPurchased>=12){
                freeBooks = 2;
            }else {
                freeBooks = 0;
            }
        }
        System.out.println("Number of free books customer gets is: "+ freeBooks+" books.");











    }
}
