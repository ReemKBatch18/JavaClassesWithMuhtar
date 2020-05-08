package Tasks.Replits;

import java.util.Scanner;

public class Rep_084_ZombieAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inhabitants = scan.nextInt();
        byte day = 0;
        if (inhabitants==0){
            System.out.println("----EXTINCT----");
            System.exit(0);
        }
        System.out.println("Day " + day + " [" + inhabitants + "]");

        for (day = 1; day <=127; ) {
            inhabitants /=2;


            if (inhabitants == 0) {
                System.out.println("----EXTINCT----");
                break;
            }
            System.out.println("Day " + day + " [" + inhabitants  + "]");
            day++;

        }
    }
}

