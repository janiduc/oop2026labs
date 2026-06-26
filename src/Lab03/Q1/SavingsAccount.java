package Lab03.Q1;

public class SavingsAccount {

    // Private attributes (Encapsulation)
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public SavingsAccount(double initialBalance) {

        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Balance set to 0.");
        }
    }

    // (b) Getters and Setters for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getters and Setters for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // (c) Getter for balance (No Setter)
    public double getBalance() {
        return balance;
    }

    // (d) Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Amount deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // (e) Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Amount withdrawn: " + amount);
        }
    }

    // (f) Display Account Details
    public void displayAccountDetails() {
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Account Holder : " + getAccountHolderName());
        System.out.println("Current Balance: " + getBalance());
    }
}
