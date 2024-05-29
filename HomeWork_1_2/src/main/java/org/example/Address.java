package org.example;

public class Address {
    private String country;
    private int zipCode;
    private String city;
    private String street;
    private int house;

    public Address(String country, int zipCode, String city, String street, int house) {
        this.country = country;
        this.zipCode = zipCode;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public String getFullAddress () {
        return """
                COUNTRY: %s,
                ZIPCODE: %d,
                CITY: %s,
                STREET: %s,
                HOUSE: %d
                """.formatted(country, zipCode, city, street, house);
    }

    public void updateFullAddress(String newCountry, int newZipCode, String newCity, String newStreet, int newHouse) {
        country = (newCountry.isBlank()) ? "" : newCountry;
        zipCode = (newZipCode == 0) ? 0 : newZipCode;
        city = (newCity.isBlank()) ? "" : newCity;
        street = (newStreet.isBlank()) ? "" : newStreet;
        house = (newHouse == 0) ? 0 : newHouse;
    }

}
