package fr.epsi.b3c2.petshop.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PetStore")
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "managerName")
    private String managerName;

    @OneToMany(mappedBy = "petStore")
    private List<Animal> animals;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToMany(mappedBy = "petStore")
    private List<Product> products;
// Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManagerName() {
        return managerName;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public Address getAddress() {
        return address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }
// Setters
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
