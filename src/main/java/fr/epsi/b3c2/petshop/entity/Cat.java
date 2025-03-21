package fr.epsi.b3c2.petshop.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("CAT")
public class Cat extends Animal {

    @Column(name = "chipid")
    private String chipId;

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String number) {
        this.chipId = chipId;
    }
}
