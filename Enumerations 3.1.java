// Enum for Account Types
enum AccountType {
    SAVINGS, CHECKING, LOAN
}

// AbstractBankAccount Class
abstract class AbstractBankAccount {
    protected String accountHolderName;
    protected int accountNumber;
    protected double balance;
    protected AccountType accountType;

    public AbstractBankAccount(String accountHolderName, int accountNumber, double balance, AccountType accountType) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Account Type: " + accountType);
    }
}

// Account Class (concrete implementation)
class Account extends AbstractBankAccount {

    public Account(String accountHolderName, int accountNumber, double balance, AccountType accountType) {
        super(accountHolderName, accountNumber, balance, accountType);
    }
}

// TestCreditAccount Class
class TestCreditAccount {

    public static void main(String[] args) {
        AbstractBankAccount a1 = new Account("Sanjay Gupta", 11556, 300, AccountType.SAVINGS);
        AbstractBankAccount a2 = new Account("He Xai", 22338, 500, AccountType.SAVINGS);
        AbstractBankAccount a3 = new Account("Ilya Mustafana", 44559, 1000, AccountType.SAVINGS);

        a1.displayAccountInfo();
        System.out.println();
        a2.displayAccountInfo();
        System.out.println();
        a3.displayAccountInfo();
    }
}

// TestCustomerAccount Class
class TestCustomerAccount {

    public static void main(String[] args) {
        AbstractBankAccount[] bankAccounts = new AbstractBankAccount[3];

        bankAccounts[0] = new Account("Sanjay Gupta", 11556, 300, AccountType.SAVINGS);
        bankAccounts[1] = new Account("He Xai", 22338, 500, AccountType.SAVINGS);
        bankAccounts[2] = new Account("Ilya Mustafana", 44559, 1000, AccountType.SAVINGS);

        for (AbstractBankAccount account : bankAccounts) {
            account.displayAccountInfo();
            System.out.println();
        }
    }
}
