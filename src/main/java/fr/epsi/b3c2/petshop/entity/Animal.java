package fr.epsi.b3c2.petshop.entity;
import jakarta.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//Représente l'entitée animal
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "animal_type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Temporal(TemporalType.DATE)  // Indique que c'est une date (sans heure)
    @Column(name = "birth")
    private Date birth;

    @Column(name = "couleur")
    private String colors;

    @ManyToOne()
    @JoinColumn(name = "petstoreid")
    private PetStore petstore;

    @Column(name = "animal_type", insertable = false, updatable = false)
    private String animalType;

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
        return petstore;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setBirth(Date birth){
        this.birth = birth;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public void setPetStore(PetStore petStore) {
        this.petstore = petStore;
    }

}
