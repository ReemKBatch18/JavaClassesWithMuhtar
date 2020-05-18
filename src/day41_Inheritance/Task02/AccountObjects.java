package day41_Inheritance.Task02;
// relationship: account object has a saving account
//               account object has a checking account

public class AccountObjects {
// here we will test our classes by creating objects
    public static void main(String[] args) {

        CheckingAccount checking = new CheckingAccount();
        checking.showBalance();       //  0
        System.out.println(checking); // Name: null, Balance: $0.0

        checking.accountHolder = "Saban";
        // Now I need to deposit amount calling deposit() method
        checking.deposit(25000);
        checking.showBalance();   // Available Balance: 25000.0

        checking.withdraw(10000);
        checking.showBalance();   // Available Balance: 15000.0

        System.out.println(checking); //Name: Saban, Balance: $15000.0

        System.out.println("*************************************");

        SavingAccount saving = new SavingAccount();
        // static variable interestRate can be called from the object or from the class name
        System.out.println(saving.interestRate);    // 0.02
        System.out.println(SavingAccount.interestRate);  // 0.02
        System.out.println(saving);   //Name: null, Balance: $0.0
        saving.accountHolder="Elif";
        System.out.println(saving);  //Name: Elif, Balance: $0.0
        saving.deposit(3000);
        saving.showBalance();        // Available Balance: 3000.0


    }
}
