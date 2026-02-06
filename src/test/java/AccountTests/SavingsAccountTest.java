package AccountTests;

import Accounts.BankAccount;
import Accounts.SavingsAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class SavingsAccountTest {

    @Test
    public void testSavingsAccountApplyInterest(){
        SavingsAccount savingsAccount = new SavingsAccount("test","test",
                "test", 500);
        savingsAccount.applyInterest();

        Assertions.assertEquals(510,savingsAccount.getBalance());
    }
    @Test
    public void testSavingsAccountIncreaseInterestRate(){
        // Test account being over 6 months old so applying interest works
        LocalDate sixMonthsAgo = LocalDate.now().minusMonths(6);

        SavingsAccount savingsAccount1 = new SavingsAccount("test","test",
                "test", 500, sixMonthsAgo);

        savingsAccount1.increaseInterestRate();

        Assertions.assertEquals(0.025, savingsAccount1.getInterestRate());

        // Test account being under 6 months old so applying interest does not work
        SavingsAccount savingsAccount2 = new SavingsAccount("test","test",
                "test", 500);

        savingsAccount2.increaseInterestRate();

        Assertions.assertEquals(0.02, savingsAccount2.getInterestRate());
    }
}
