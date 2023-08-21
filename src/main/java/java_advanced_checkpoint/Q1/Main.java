package java_advanced_checkpoint.Q1;

public class Main {

    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount("kamarbaraka", "baraka",
                50000);

        SavingsAccount savingsAccount = new SavingsAccount("kamarbaraka", "baraka",
                10000);

        System.out.println(savingsAccount.getBalance());
        System.out.println(savingsAccount.deposit(checkingAccount.withdraw(15000)));
        System.out.println(savingsAccount.getBalance());

        System.out.println(checkingAccount.getBalance());
        System.out.println(checkingAccount.deposit(savingsAccount.withdraw(5000)));
        System.out.println(checkingAccount.getBalance());

    }
}
