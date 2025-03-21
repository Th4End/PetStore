package fr.epsi.b3c2.petshop.entity;

import jakarta.persistence.*;
@Entity
@DiscriminatorValue("FISH")
public class Fish extends Animal {
    @Enumerated(EnumType.STRING)
    private FishLivEnv fishLivEnv;
    public Fish() {}

    public FishLivEnv getFishLivEnv() {
        return fishLivEnv;
    }

    public void setFishLivEnv(FishLivEnv fishLivEnv) {
        this.fishLivEnv = fishLivEnv;
    }

}
