package fr.epsi.b3c2.petshop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;
    @Column(name = "label")
    private String label;

    @Column(name = "Price")
    private double price;

    @Enumerated(EnumType.STRING)
    private ProdType type;

    @ManyToOne()
    @JoinColumn(name = "PetStore.id")
    private PetStore store;

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


    public void setCode(){
        this.code = code;
    }

    public void setLabel(String nourriturePourChat){
        this.label = label;
    }

    public void setPrice(double v){
        this.price = price;
    }

    public void setType(ProdType food){
        this.type = type;
    }

    public void setStore(){
        this.store = store;
    }
}
