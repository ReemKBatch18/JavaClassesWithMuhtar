package Tasks.WarmUpPractices;

public class KgToPounds {

    public static void main(String[] args) {
/*
Task01:
        create a class called KgTopounds, and write a program that can convert Kg to pound and print the result
            Ex:
                kg = 10;

                output:
                    10 kg is equal to 22.0462 pounds
                kg = 20
                output:
                    20 kg is equal to 44.0925 pound

 */
          byte kg =10;
          double lb = kg * 2.20462;
        System.out.println(kg + " Kgs are equal to " +lb + " pounds.");

        kg = 20;
        lb = kg * 2.20462;
        System.out.println(kg + " Kgs are equal to " +lb + " pounds.");

        kg = 1;
        lb = kg * 2.20462;
        System.out.println(kg + " Kg is equal to " +lb + " pounds.");

    }
}
