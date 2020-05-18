package day41_Inheritance.Task02;
/*
create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance
 */
public class CheckingAccount extends BankAccount {
    /*
    accountNumber   (inherited)
    accountHolder   (inherited)
    balance        (inherited)

    withdraw

    deposit        (inherited)
    showBalance    (inherited)
    toString       (inherited)
     */

    public void withdraw(int amount) {
        balance -= amount;
        // This method must be instance (not static) because we are using the instance variable balance in it
        // variable balance is inherited from Bank Account : it was declared instance variable
    }
}
