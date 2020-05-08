package Tasks.Replits;

import java.util.Scanner;

public class Rep_Asses1_CalorieBurnCalcu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double weight = 0;
        double cal = 0;
        System.out.println("Enter weight in pounds:");
        weight= s.nextDouble();

       double metRun = 10*30;
       double metBasket = 8*30;
       double metSleep = 6*60;
       cal = 0.0175 * (metBasket+metRun+metSleep) * weight /2.2;
        System.out.println("Calories Burned: "+(int)cal);









    }
}
