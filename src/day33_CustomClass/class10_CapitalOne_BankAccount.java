package day33_CustomClass;

public class class10_CapitalOne_BankAccount {
    public static void main(String[] args) {

        BankAccount Anna = new BankAccount();
        // after Anna opened this acount we need to make sure account holder and account number are provided
        Anna.accountHolder = "Anna";
        Anna.accountNumber = 123456;

        // what's the balance of Anna right now?
        // to check balance, we call checkingBalance() method

        Anna.checkingBalance(); // 0.0
        Anna.deposit(33);
        Anna.checkingBalance(); // 33.0
        Anna.withDraw(13);
        Anna.checkingBalance(); // 20.0
        System.out.println("================================ ");
        // is there any bug in this code? there is a bug
        // if Anna withdrew 30 from balance 20==> Anna will have negative ... and should get penalty
        // and if amount is negative ==> it should not allow you to withdraw anymore ==> You do not have enough balance

        // when I print Anna ==> hashcode ==> I need to create toString() method that will apply automatically
        // account holder name, account number, balance
        System.out.println(Anna);





    }
}
