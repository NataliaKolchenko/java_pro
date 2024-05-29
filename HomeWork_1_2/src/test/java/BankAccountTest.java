import org.example.Address;
import org.example.BankAccount;
import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BankAccountTest {

    BankAccount accountWithMoney = new BankAccount(new User("Bill", "Müller", new Address("Germany", 140900, "Berlin", "Pulßstrasse", 3)), 500);
    BankAccount accountWithoutMoney = new BankAccount(new User("Bill", "Müller", new Address("Germany", 140900, "Berlin", "Pulßstrasse", 3)), 0);


    //check "create account"
    @Test
    void createCorrectAccountTest(){
        assertEquals("Полное имя: Müller Bill Адрес: Germany 140900 Berlin Pulßstrasse 3", accountWithMoney.getOwner().getFullInfo());
    }

    @Test
    void createAccountExceptionTest() {
        assertThrows(RuntimeException.class, () -> new BankAccount(new User("Bill", "Müller", new Address("Germany", 140900, "Berlin", "Pulßstrasse", 3)), -1));
    }

    //check "deposit"
    @Test
    void depositIsCorrectTest() {
        accountWithoutMoney.deposit(10);
        Assertions.assertEquals(10, accountWithoutMoney.getBalance());
    }

    @Test
    void depositExceptionTest() {
        assertThrows(RuntimeException.class, () -> accountWithMoney.deposit(0));
    }

    //check printBalance
    @Test
    void printBalanceTest() {
        assertEquals("Баланс счета Müller Bill500.0", accountWithMoney.printBalance());
    }

    //check add Interest (bank's %)
    @Test
    void addInterestCorrectTest (){
        accountWithMoney.addInterest();
        assertEquals("Баланс счета Müller Bill570.0", accountWithMoney.printBalance());

    }

    //check "withdraw" money
    @Test
    void withdrawCorrectTest() {
        accountWithMoney.withdraw(100);
        assertEquals(400, accountWithMoney.getBalance());
    }

    @Test
    void withdrawExceptionTest() {
        assertThrows(RuntimeException.class, () -> accountWithMoney.withdraw(1000));
    }
}

