// AbstractBankAccount.java
public abstract class AbstractBankAccount {
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
}

// Account.java
public class Account extends AbstractBankAccount {

    public Account(String accountNumber, double initialBalance) {
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

    public static void main(String[] args) {
        // Create an Account with an initial balance of 1000
        Account account = new Account("123456789", 1000.00);

        // Display the initial balance
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit 500
        account.deposit(500);
        System.out.println("Balance after depositing 500: " + account.getBalance());

        // Withdraw 200
        account.withdraw(200);
        System.out.println("Balance after withdrawing 200: " + account.getBalance());

        // Try to withdraw an amount greater than the balance
        account.withdraw(1500);
        System.out.println("Balance after trying to withdraw 1500: " + account.getBalance());
    }
}
