package AccountTests;

import Accounts.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void testBankAccountDeposit(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setFirstName("Test");
        bankAccount.setLastName("Test");
        bankAccount.setAccountNumber("Test");
        bankAccount.setBalance(0);
        bankAccount.deposit(500);

        Assertions.assertEquals(500, bankAccount.getBalance());
    }

    @Test
    public void testBankAccountWithdraw(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setFirstName("Test");
        bankAccount.setLastName("Test");
        bankAccount.setAccountNumber("Test");
        bankAccount.setBalance(1000);
        bankAccount.withdraw(500);

        Assertions.assertEquals(500, bankAccount.getBalance());
    }
}
