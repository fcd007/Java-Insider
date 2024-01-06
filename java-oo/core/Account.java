package core;

public class Account {
    String AccountNumber;
    String AccountOwner;
    double balance;

    boolean deposit(double value) {
        if(value > 0) {
            balance += value;
            return true;
        } else {
            System.out.println("Valor negativo inválido");
            return false;
        }
    }

    boolean deposit(String amount) {
        return deposit(Double.parseDouble(amount));
    }

    boolean withDraw(double amount) {
        if(balance > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }else {
            System.out.println("Saldo insuficiente na conta");
            return false;
        }
    }

    void transfer(double amount, Account targetAccount) {
        withDraw(amount);
        targetAccount.deposit(amount);
    }

    void printBalance() {
        System.out.println("Balance: R$ " + balance);
    }
}
