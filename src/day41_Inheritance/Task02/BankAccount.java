package day41_Inheritance.Task02;
/*
create a class called BankAccount
			variables:  accountNumber, accountHolder, Balance
			methods: deposit, showBalance, toString
 */
public class BankAccount {

    public long accountNumber;
    public String accountHolder;
    public double balance;

    public void deposit(double deposit){
        balance += deposit;
    }

    public void showBalance(){
        System.out.println("Available Balance: "+balance);
    }

    public String toString(){
        return "Name: "+accountHolder+", Balance: $"+balance ;
    }


}
