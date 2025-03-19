package fr.epsi.b3c2.petshop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "code")
    private String code;
    @Column(name = "label")
    private String label;

    @Column(name = "Price")
    private double price;

    @Enumerated(EnumType.STRING)
    private ProdType type;


    public int getId(){
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

    public void setId(){
        this.id = id;
    }

    public void setCode(){
        this.code = code;
    }

    public void setLabel(){
        this.label = label;
    }

    public void setPrice(){
        this.price = price;
    }

    public void setType(){
        this.type = type;
    }
}
