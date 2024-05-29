package org.example;

import static org.example.Constants.ADDRESS;
import static org.example.Constants.FULL_NAME;

public class User {

    private String firstName;
    private String lastName;
    private Address userAddress;

    public User(String firstName, String lastName, Address userAddress) {
        if (firstName.isBlank() || lastName.isBlank()) {
            throw new RuntimeException("EXP: We can't create user");
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
            this.userAddress = userAddress;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName () {
        return lastName + " " + firstName;
    }

    public String getFullInfo() {
        return FULL_NAME + lastName + " " + firstName + ADDRESS + userAddress.getFullAddress();
    }


    public void updateFullName(String newFirstName, String newLastName) {
        if (newFirstName.isBlank() || newLastName.isBlank()) {
            throw new RuntimeException("EXP: We can't create user");
        } else {
            this.firstName = newFirstName;
            this.lastName = newLastName;
        }
    }

    public Address getUserAddress() {
        return userAddress;
    }
}
