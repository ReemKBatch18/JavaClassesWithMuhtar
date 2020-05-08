package OfficeHours.Practice_04_22_2020;

public class class_01_methods_void {

    /*
    declare:
			Access-modifier  specifier  return-Type  methodName(parameter){
					statements;
			}
     */


    public static void main(String[] args) {

        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");

        System.out.println("============================");

        print();

        System.out.println("=============================");
        boolean USCitizen = true;
        int age = 21;

        Vote(age , USCitizen);

        Vote(35, false);

        System.out.println("=============================");
        // 28
        EligibleToBuCig(17);

    }

    public static void print(){
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");

    }

    // write a function that can identify if a p[reson is eligible to vote
    // MUST know: age, USCitizen

    public static void Vote(int age, boolean USCitizen){

        boolean eligibleToVote =  age >= 18 && USCitizen == true;
        if(eligibleToVote){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote yet");
        }

    }


    // write a method if a person is eligle to bu cig
    // MUST know: age

    public static void EligibleToBuCig(int age){
        if(age > 18){
            System.out.println("Eligible to but");
        }else{
            System.out.println("Not eligible to buy");
        }

    }

}
