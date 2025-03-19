package fr.epsi.b3c2.petshop.entity;

import jakarta.persistence.*;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;
@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "number")
    private String number;

    @Column(name = "street")
    private String street;

    @Column(name = "zipCode")
    private String zip;

    @Column(name = "city")
    private String city;

    public String getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public Long getId() {
        return id;
    }

    public void setNumber() {
        this.number = number;
    }

    public void setStreet() {
        this.street = street;
    }

    public void setZip() {
        this.zip = zip;
    }

    public void setCity() {
        this.city = city;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
