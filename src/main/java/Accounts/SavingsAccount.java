package Accounts;

public class SavingsAccount extends BankAccount{

    private double interestRate = 0.02;

    public SavingsAccount(String firstName, String lastName, String accountNumber, double balance) {
        super(firstName,lastName, accountNumber, balance);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        double interest = this.getBalance() * interestRate;
        deposit(interest);
    }
}
