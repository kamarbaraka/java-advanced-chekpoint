package java_advanced_checkpoint.Q1;

public class CheckingAccount extends Account{


    public CheckingAccount(String accountName, String accountHolder, double balance) {

        super(accountName, accountHolder, balance);
    }

    public double withdraw(double amount){

        if (amount<super.getBalance()){
            super.setBalance(super.getBalance() - amount);
            return super.getBalance();}

        return 0.0;

    }

    public boolean deposit(double amount){

        super.setBalance(amount + super.getBalance());

        return true;
    }
}
