package Accounts;

public class BankAccount {
    private String firstName;
    private String lastName;
    private String accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName, String accountNumber, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return (firstName + ", " + lastName + ", account number: " + accountNumber + ", balance: " + balance);
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public boolean withdraw(double amount) {
        if(balance < amount){
           return false;
        }
        balance -= amount;
        return true;
    }

    public void balanceInquiry() {
        System.out.printf("Your current balance is: $%.2f%n", getBalance());
    }
}
