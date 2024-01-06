package core;

public class IdGeneratedAccount {
    private final String accountNumber;
    private final String accountOwner;

    private double balance;

    public IdGeneratedAccount(String accountNumber, String accountOwner) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
    }

    boolean deposit(double amount) {
        if(amount > 0) {
            balance +=amount;
            return true;
        }
        return false;
    }

    boolean witdraw(double amount) {
        if(amount > 0) {
            balance-=amount;
            return true;
        }
        return false;
    }

    void transfer(double amount, IdGeneratedAccount targetAccount) {
        witdraw(amount);
        targetAccount.deposit(amount);
    }

    void printBalance() {
        System.out.println("Balance R$ " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public double getBalance() {
        return balance;
    }
}
