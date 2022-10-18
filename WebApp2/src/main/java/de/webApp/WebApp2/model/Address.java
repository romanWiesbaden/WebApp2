package de.webApp.WebApp2.model;

public class Address {
    public String firstName;
    public String lastName;
    public String street;
    public Number houseNumber;
    public Number zipCode;
    public String city;

    public Address(String firstName, String lastName, String street, Number houseNumber, Number zipCode, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
