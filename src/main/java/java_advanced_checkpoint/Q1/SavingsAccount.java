package java_advanced_checkpoint.Q1;

public class SavingsAccount extends Account{


    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
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
