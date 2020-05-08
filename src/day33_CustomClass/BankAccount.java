package day33_CustomClass;

public class BankAccount {
     /*
        Practice task:
            create a custom class for bank account
                attributes:
                    accountholder, accountnumber, balance
                actions: checkingBalance(), withDraw(), deposit()
                when we withdraw we need to pass info how much
                when we deposit we need to pass info how much
                everytime we withdraw ==> balance decreases
                everytime we deposit ==> balance increases


         */
     String  accountHolder;
     long accountNumber;
     double balance;

     // how would customer be able to check balance
    // we create method
    public void checkingBalance(){
        // when this method is called ==> should give us the available balance
        System.out.println("Avaialable Balance: "+ balance);
    }

    public void withDraw (double amount){
        // as soon as this is being called :
        System.out.println("Withdrawing $"+amount);
        // after withdrawing, balance will be decreased:
        balance -= amount;
    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance += amount;
    }

    public String toString(){
        String result = "Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber+"\nAvailable Balance: $"+balance;
        return result;
    }


}
