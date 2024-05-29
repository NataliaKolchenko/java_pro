import org.example.Address;
import org.example.BankAccount;
import org.example.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {
    Address adr = new Address("Germany", 140900, "Berlin", "Pulßstrasse", 3);
    User user = new User("Ger", "Müller", adr);

    //check create user
    @Test
    void createUserExceptionTest () {
        assertThrows(RuntimeException.class, () -> new BankAccount(new User("", "", adr), 0));
    }

    @Test
    void getFirstNameSuccessTest () {
        assertEquals("Ger", user.getFirstName());
    }

    @Test
    void getFullNameSuccessTest() {
        assertEquals("Müller Ger", user.getFullName());
    }

    @Test
    void getFullInfoSuccessTest() {
        assertEquals("Полное имя: Müller Ger Адрес: COUNTRY: Germany,\n" +
                "ZIPCODE: 140900,\n" +
                "CITY: Berlin,\n" +
                "STREET: Pulßstrasse,\n" +
                "HOUSE: 3\n", user.getFullInfo());
    }

    @Test
    void updateFullNameSuccessTest() {
        user.updateFullName("Nata", "Kolh");
        assertEquals("Kolh Nata", user.getFullName());
    }

    @Test
    void updateFullNameExceptionTest () {
        assertThrows(RuntimeException.class, () -> user.updateFullName("", ""));
    }





}
