package fr.epsi.b3c2.petshop.entity;

import jakarta.persistence.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
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
    @JoinColumn(name = "petstore_id")
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

    public void setBirth(String birthDateStr) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        this.birth = formatter.parse(birthDateStr);
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = this.petStore;
    }

}
