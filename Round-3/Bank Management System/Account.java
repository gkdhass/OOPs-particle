public class Account {

    int accountNumber;
    String accountHolderName;
    String password;
    double balance;

    // Deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " Deposited. New Balance: $" + balance);
    }

    // Withdraw
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("$" + amount + " Withdrawn. New Balance: $" + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Display Account Details
    public void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }
}