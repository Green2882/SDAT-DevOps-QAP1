package AccountTests;

import Accounts.BankAccount;
import Accounts.SavingsAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingsAccountTest {

    @Test
    public void testSavingsAccountApplyInterest(){
        SavingsAccount savingsAccount = new SavingsAccount("test","test",
                "test", 500);
        savingsAccount.applyInterest();

        Assertions.assertEquals(510,savingsAccount.getBalance());
    }
}
