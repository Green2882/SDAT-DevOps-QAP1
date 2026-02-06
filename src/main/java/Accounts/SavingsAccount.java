package Accounts;
import java.time.LocalDate;

public class SavingsAccount extends BankAccount{

    private double interestRate = 0.02;
    private LocalDate startDate;
    private LocalDate nextInterestIncrease;

    public SavingsAccount(String firstName, String lastName, String accountNumber, double balance) {
        super(firstName,lastName, accountNumber, balance);
        this.startDate = LocalDate.now();
        this.nextInterestIncrease = startDate.plusMonths(6);
    }

    //Created for testing, so I can manually set start date
    public SavingsAccount(String firstName, String lastName, String accountNumber, double balance,
                          LocalDate startDate) {
        super(firstName, lastName, accountNumber, balance);
        this.startDate = startDate;
        this.nextInterestIncrease = startDate.plusMonths(6);
    }


    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getNextInterestIncrease() {
        return nextInterestIncrease;
    }

    public void applyInterest(){
        double interest = this.getBalance() * interestRate;
        deposit(interest);
    }

    public void increaseInterestRate() {
        if (!LocalDate.now().isBefore(nextInterestIncrease)) {
            interestRate += 0.005;
            nextInterestIncrease = nextInterestIncrease.plusMonths(6);
        }
    }
}

