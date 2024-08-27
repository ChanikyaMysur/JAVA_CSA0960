import java.util.ArrayList;

// Abstract base class for different types of bank accounts
abstract class AbstractBankAccount {
    protected String accountHolderName;
    protected int accountNumber;
    protected double balance;

    public AbstractBankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract String getAccountInfo();
}

// A concrete class for credit accounts
class CreditAccount extends AbstractBankAccount {
    public CreditAccount(String accountHolderName, int accountNumber, double balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public String getAccountInfo() {
        return "Credit Account [Name: " + accountHolderName + ", Account Number: " + accountNumber + ", Balance: $" + balance + "]";
    }
}

// Main class for the JavaBank application
public class JavaBank {
    // Replacing static array with an ArrayList
    static ArrayList<AbstractBankAccount> myAccounts = new ArrayList<AbstractBankAccount>();

    public static void main(String[] args) {
        // Adding some accounts to the ArrayList
        myAccounts.add(new CreditAccount("John Doe", 12345, 1000.00));
        myAccounts.add(new CreditAccount("Jane Smith", 67890, 2000.00));

        // Displaying all accounts
        displayAccounts();
    }

    // Method to display account information
    public static void displayAccounts() {
        System.out.println("List of all accounts:");
        for (int i = 0; i < myAccounts.size(); i++) {
            System.out.println(myAccounts.get(i).getAccountInfo());
        }
    }
}
