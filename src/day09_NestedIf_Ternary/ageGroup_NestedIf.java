package day09_NestedIf_Ternary;
/*
    write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
     */
public class ageGroup_NestedIf {
    public static void main(String[] args) {
        byte a = 30;
        String ageGroup = "";
        if (a >=0 && a <=150){
           ageGroup= (a<21)?"Teenager":(a<55)?"Adult":"Senior";
        }else {
            ageGroup= "Invalid";
        }
        System.out.println(ageGroup);




    }
}
