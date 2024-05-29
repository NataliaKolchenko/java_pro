import org.example.Address;
import org.example.BankAccount;
import org.example.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressNewTest {
//    BankAccount account1 = new BankAccount(new User("Peter", "Müller", new Address("Germany", 140900, "Berlin", "Pulßstrasse", 3)), 500);

    Address adr = new Address("Germany", 140900, "Berlin", "Pulßstrasse", 10);
    User us = new User ("Peter", "Müller", adr);

    BankAccount userTest1 = new BankAccount(us, 500);

    @Test
    void createAddressSuccessTest() {

        assertEquals("""
                COUNTRY: Germany,
                ZIPCODE: 140900,
                CITY: Berlin,
                STREET: Pulßstrasse,
                HOUSE: 10
                """, userTest1.getOwner().getUserAddress().getFullAddress());
    }

    @Test
    void updateFullAddressSuccessTest () {


        userTest1.getOwner().getUserAddress().updateFullAddress("Spain", 100435, "Barcelona", "Play", 34);
        assertEquals("""
                COUNTRY: Spain,
                ZIPCODE: 100435,
                CITY: Barcelona,
                STREET: Play,
                HOUSE: 34
                """, userTest1.getOwner().getUserAddress().getFullAddress());
    }

    @Test
    void updateFullAddressCountryIsEmptyTest () {
        userTest1.getOwner().getUserAddress().updateFullAddress("", 100435, "Barcelona", "Play", 34);
        assertEquals("""
                COUNTRY: ,
                ZIPCODE: 100435,
                CITY: Barcelona,
                STREET: Play,
                HOUSE: 34
                """, userTest1.getOwner().getUserAddress().getFullAddress());
    }

    @Test
    void updateFullAddressZipcodeIsEmptyTest () {
        userTest1.getOwner().getUserAddress().updateFullAddress("Spain", 0, "Barcelona", "Play", 34);
        assertEquals("""
                COUNTRY: Spain,
                ZIPCODE: 0,
                CITY: Barcelona,
                STREET: Play,
                HOUSE: 34
                """, userTest1.getOwner().getUserAddress().getFullAddress());
    }

    @Test
    void updateFullAddressCityIsEmptyTest () {
        userTest1.getOwner().getUserAddress().updateFullAddress("Spain", 100435, "", "Play", 34);
        assertEquals("""
                COUNTRY: Spain,
                ZIPCODE: 100435,
                CITY: ,
                STREET: Play,
                HOUSE: 34
                """, userTest1.getOwner().getUserAddress().getFullAddress());
    }
    @Test
    void updateFullAddressStreetIsEmptyTest () {
        userTest1.getOwner().getUserAddress().updateFullAddress("Spain", 100435, "Barcelona", "", 34);
        assertEquals("""
                COUNTRY: Spain,
                ZIPCODE: 100435,
                CITY: Barcelona,
                STREET: ,
                HOUSE: 34
                """, userTest1.getOwner().getUserAddress().getFullAddress());
    }

    @Test
    void updateFullAddressHouseIsEmptyTest () {
        userTest1.getOwner().getUserAddress().updateFullAddress("Spain", 100435, "Barcelona", "Play", 0);
        assertEquals("""
                COUNTRY: Spain,
                ZIPCODE: 100435,
                CITY: Barcelona,
                STREET: Play,
                HOUSE: 0
                """, userTest1.getOwner().getUserAddress().getFullAddress());
    }

    @Test
    void updateFullAddressIsEmptyTest () {
        userTest1.getOwner().getUserAddress().updateFullAddress("", 0, "", "", 0);
        assertEquals("""
                COUNTRY: ,
                ZIPCODE: 0,
                CITY: ,
                STREET: ,
                HOUSE: 0
                """, userTest1.getOwner().getUserAddress().getFullAddress());
    }




}
