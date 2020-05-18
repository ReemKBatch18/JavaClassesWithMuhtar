package day41_Inheritance;

public class c02_BankOfAmerica {

    public static void main(String[] args) {

        c01_BankAccount Irina = new c01_BankAccount("Irina", "Li");
        // how can I print this private data: I can use getter
        System.out.println(Irina.getAccountHolder()); //Irina Li

        // How can read balance : it's private==> through getter
        System.out.println(Irina.getBalance());// now it's 0.0

        // to check balance:
        Irina.checkBalance();

        // can I deposit some money? yes be calling deposit action and pass amount
        Irina.depositing(120);

        // now iif I call check balance:
        Irina.checkBalance(); // "Available Balance: $120.00"

        // Now I want to withdraw:
        Irina.withdrawing(80);
        // balance
        Irina.checkBalance(); // "Available Balance: $40"

        // if I want to print all info :
        System.out.println(Irina); //Full Name: Irina Li, Available Balance: $40.0




    }
}
