package de.webApp.WebApp2.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Timestamp;
import org.springframework.data.domain.Persistable;

// Class to take data for the gift tshirt
@Table("giftTshirt")
//Die klasse für die Speicherung in der Datenbank zuständig
public class GiftTshirt implements Persistable<Integer> {
    @Id
    private int tshirtId;
    public TshirtSizeType tshirtSize;
    public Address address;
    public String email;
    public Timestamp agreement;

    public GiftTshirt(TshirtSizeType tshirtSize, Address address, String email, Timestamp agreement) {
        this.tshirtSize = tshirtSize;
        this.address = address;
        this.email = email;
        this.agreement = agreement;
    }

    public int getTshirtId() {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    @Override
    public Integer getId() {
        return getTshirtId();
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
