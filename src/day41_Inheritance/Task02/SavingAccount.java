package day41_Inheritance.Task02;
/*
create sub class of BankAccount and name it SavingAccount
			variables: accountNumber, accountHolder, balance, interestRate
			methods: deposit, showBalance
 */
public class SavingAccount extends BankAccount {
    /*
    accountNumber   (inherited)
    accountHolder   (inherited)
    balance        (inherited)

    interestRate

    deposit        (inherited)
    showBalance    (inherited)
    toString       (inherited)
     */
    // I need to declare this variable here: static because it is the same
    public static double interestRate;
    // because it is static: I can assign it (initialize it ) in a static block

    static {
        interestRate = 0.02;
    }
}
