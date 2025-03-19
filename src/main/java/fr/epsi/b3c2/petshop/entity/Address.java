package fr.epsi.b3c2.petshop.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;

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

    @OneToOne(mappedBy = "address")
    private PetStore store;

    public Address(String number, String street,String city ,String zip  ) {
        this.number = number;
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    public Address() {
    }

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

    public void setNumber(String number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
