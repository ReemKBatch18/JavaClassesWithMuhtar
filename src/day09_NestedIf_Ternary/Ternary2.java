package day09_NestedIf_Ternary;

public class Ternary2 {
    public static void main(String[] args) {
        //
        String result = "";
        if (9 > 10) {
            result = "9 is greater";
        } else {
            result = "10 is greater";
        }

        String result2 = (9 > 10) ? "9 is greater" : "10 is greater";

        System.out.println(result);
        System.out.println(result2);

        int age = 25;
        boolean eligibility = (age >= 21) ? true : false;
        System.out.println(eligibility);

        System.out.println("===================================================================================");
        int ageOfPerson = 20;
        String eligibleToVote="";
        if (ageOfPerson>=18){
            eligibleToVote ="Yes";

        }else {
            eligibleToVote = "No";
        }

            String eligibleToVote2 =(ageOfPerson>=18)? "Yes":"No";
            System.out.println(eligibleToVote);
        System.out.println(eligibleToVote2);

    }
}
