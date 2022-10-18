package de.webApp.WebApp2.dto;


import de.webApp.WebApp2.model.Address;
import de.webApp.WebApp2.model.TshirtSizeType;

import java.sql.Timestamp;

public class GiftTshirtDto {
// klein integer kann nie null sein
    // grosses Integer kann null sein
    private Integer tshirtId;
    public TshirtSizeType tshirtSize;
    public String firstName;
    public String lastName;
    public String street;
    public Number houseNumber;
    public Number zipCode;
    public String city;
    public String email;
    public Timestamp agreement;

    public GiftTshirtDto(int tshirtId, TshirtSizeType tshirtSize, String firstName, String lastName, String street, Number houseNumber, Number zipCode, String city, String email, Timestamp agreement) {
        this.tshirtId = tshirtId;
        this.tshirtSize = tshirtSize;
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.email = email;
        this.agreement = agreement;
    }

    public Integer getTshirtId() {
        return tshirtId;
    }

    public void setTshirtId(int tshirtId) {
        this.tshirtId = tshirtId;
    }

    public TshirtSizeType getTshirtSize() {
        return tshirtSize;
    }

    public void setTshirtSize(TshirtSizeType tshirtSize) {
        this.tshirtSize = tshirtSize;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Number getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Number houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Number getZipCode() {
        return zipCode;
    }

    public void setZipCode(Number zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getAgreement() {
        return agreement;
    }

    public void setAgreement(Timestamp agreement) {
        this.agreement = agreement;
    }



}