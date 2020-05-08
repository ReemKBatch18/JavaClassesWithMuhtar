package day36_StaticBlock;

public class class05_CapitalOne {
    public static void main(String[] args) {
        System.out.println(class04_HumanResources.dev1);
        // but if I set other info for dev1 ==>
        class04_HumanResources.dev1.setInfo("Saia","Developer",130_000,19931);
        System.out.println(class04_HumanResources.dev1); // it will print the new set info
    }
}
