package day41_Inheritance;
/*
create custom class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance
	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)
	 		create a constructor that can initialize firstName and fullName
	 				(DO NOT USE SHORTCUT)
	 		action:
	 				depositing
	 				withdrawing
	 				availablebalance
	 				toString: returns the full name and balance
 */
public class c01_BankAccount {

    // public variables
    // I can declare banKName as static ==> one copy shared by all account holders
    public static String bankName = "Bank of America";
    public String firstName;
    public String lastName;

    // private variables: I need to declare them instance ==> each object will have its own copy
    private String accountHolder;
    private long accountNumber;
    private double balance;

    // constructor that can initialize firstName, lastName and fullName ==> need to pass parameter
    public c01_BankAccount(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountHolder = firstName +" "+ lastName;
    }

    // Encapsulations
    // for accountHolder variable, I do not need the setter because of the above constructor
    // I can create it but I do not need it. But I need to create the getter
    // getter for accountHolder
    public String getAccountHolder(){
        return accountHolder;
    }
    // setter for accountHolder : I need to pass two variables here firstName and lastName like this
    public void setAccountHolder(String firstName, String lastName) {
        this.accountHolder = firstName +" "+ lastName;
    }

    //setter for accountNumber
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // getter for accountNumber
    public long getAccountNumber() {
        return accountNumber;
    }

    // getter for balance
    public double getBalance() {
        return balance;
    }

    // setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Should I declare depositing () method as static or instance? Must be instance method because we need to use instance variables
    // we can use void return type because we just need to set the value of balance at the end
    // in order to deposit, what extra info I need? amount of deposit ==> need parameter with int amount
    public void depositing(int amount){
        // we can apply the setter to increase it by given amount:
        setBalance(balance+amount);
    }

    // we will create the withdrawing() method, we need to pass amount to withdraw
    // in order to complete this action : we need to pass the amount of money we are withdrawing
    public void withdrawing(int amount){
        balance -= amount;
        // I didn't use this. keyword, because the local variable (int amount) doesn't have the same name with the instance variable (balance)
        // I can use the setter method too like this
        // setBalance(balance - amount);
        // we can add here more conditions like if balance = 0 or negative....
    }

    //checkBalance() method : only need to display the available balance
    public void checkBalance(){
     //   System.out.println("Available Balance: " + balance);
        //or
        System.out.println("Available Balance: $" +getBalance());
    }

    // toString() method
    public String toString(){
        // to return full name: we can call accountHolder variable OR call getAccountHolder() method
        return "Full Name: "+getAccountHolder()+", Available Balance: $"+getBalance();
    }

}
