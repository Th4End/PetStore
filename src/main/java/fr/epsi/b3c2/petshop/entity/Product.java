package fr.epsi.b3c2.petshop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product") // Garde le nom de la table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "label")
    private String label;

    @Column(name = "price")
    private double price;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private ProdType type;

    @ManyToOne
    @JoinColumn(name = "petstore_id")
    private PetStore store;

    // Getters
    public Long getId(){
        return this.id;
    }

    public String getCode(){
        return this.code;
    }

    public String getLabel(){
        return this.label;
    }

    public double getPrice(){
        return this.price;
    }

    public ProdType getType(){
        return this.type;
    }

    public PetStore getStore(){
        return this.store;
    }

    // Setters
    public void setCode(String code){
        this.code = code;
    }

    public void setLabel(String label){
        this.label = label;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setType(ProdType type){
        this.type = type;
    }

    public void setStore(PetStore store){
        this.store = store;
    }
}
