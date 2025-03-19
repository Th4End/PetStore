package fr.epsi.b3c2.petshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "animal_id")
public class Cat extends Animal {

    private String chipId;

    public String getChipId() {
        return chipId;
    }

    public void setChipId() {
        this.chipId = chipId;
    }
}
