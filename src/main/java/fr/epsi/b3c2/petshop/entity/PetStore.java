package fr.epsi.b3c2.petshop.entity;

import jakarta.persistence.*;
import java.util.List;

//Représente l'entité petstore dans la base de donnée
@Entity
@Table(name = "petstore")
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "managerName", nullable = false)
    private String managerName;

    @OneToMany(mappedBy = "petstore")
    private List<Animal> animals;

    @OneToOne()
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @ManyToMany()
    @JoinTable(
            name = "petstore_product",
            joinColumns = @JoinColumn(name = "petstore_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
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

    // Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

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
