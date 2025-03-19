package fr.epsi.b3c2.petshop.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "Animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "birth")
    private Date birth;

    @Column(name = "couleur")
    private String colors;
    @ManyToOne
    private PetStore petStore;

    public String getColors() {
        return colors;
    }

    public Date getBirth() {
        return birth;
    }

    public Long getId() {
        return id;
    }

    public PetStore getPetStore() {
        return petStore;
    }

    public void setBirth() {
        this.birth = birth;
    }

    public void setColors() {
        this.colors = colors;
    }

    public void setPetStore() {
        this.petStore = petStore;
    }

}
