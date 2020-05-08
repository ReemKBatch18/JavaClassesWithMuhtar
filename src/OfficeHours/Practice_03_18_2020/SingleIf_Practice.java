package OfficeHours.Practice_03_18_2020;

public class SingleIf_Practice {

    public static void main(String[] args) {
        int a = 200;
        int b = 200;
        boolean aGreater = a > b;
        boolean bGreater = b > a;

        if(aGreater) {
            System.out.println(a + " is greater number");
        }
        if(bGreater){
            System.out.println(b + " is greater number");
        }
        // boolean aEqualb = a == b; OR we can try the following
         // boolean aEqualb = aGreater == false && bGreater == false; Or we can use the following
        boolean aEqualb = aGreater == bGreater;
        if (aEqualb) {
            System.out.println(a + " is equal to " +b);
        }




    }
}
