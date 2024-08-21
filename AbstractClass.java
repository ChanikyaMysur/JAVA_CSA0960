import java.util.ArrayList;
import java.util.List;

// AbstractBankAccount.java
abstract class AbstractBankAccount {
    protected String accountNumber;
    protected double balance;

    public AbstractBankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}

// CreditAccount.java
class CreditAccount extends AbstractBankAccount {
    private double creditLimit;

    public CreditAccount(String accountNumber, double initialBalance, double creditLimit) {
        super(accountNumber, initialBalance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + creditLimit) >= amount) {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Credit Limit: " + creditLimit;
    }
}

// SavingsAccount.java
class SavingsAccount extends AbstractBankAccount {

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

// Bank.java
class Bank {
    private List<AbstractBankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(AbstractBankAccount account) {
        accounts.add(account);
    }

    public void showAllAccounts() {
        System.out.println("All Accounts:");
        for (AbstractBankAccount account : accounts) {
            System.out.println(account);
        }
    }

    public void showAllCreditAccounts() {
        System.out.println("All Credit Accounts:");
        for (AbstractBankAccount account : accounts) {
            if (account instanceof CreditAccount) {
                System.out.println(account);
            }
        }
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Add different types of accounts
        bank.addAccount(new CreditAccount("CA123", 1000.0, 5000.0));
        bank.addAccount(new SavingsAccount("SA456", 2000.0));
        bank.addAccount(new CreditAccount("CA789", 1500.0, 3000.0));

        // Show all accounts
        bank.showAllAccounts();

        // Show only credit accounts
        bank.showAllCreditAccounts();
    }
}
