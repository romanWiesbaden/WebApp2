package de.webApp.WebApp2.dto;


public class ClientDto {
    String clientId;
    String firstName;
    String lastName;
    String myAddress;
    String myEmail;
    String size;
    String color;

    public ClientDto(String clientId, String firstName, String lastName, String myAddress, String myEmail, String size, String color) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.myAddress = myAddress;
        this.myEmail = myEmail;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ClientDto{" +
                "clientId='" + clientId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", myAddress='" + myAddress + '\'' +
                ", myEmail='" + myEmail + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}