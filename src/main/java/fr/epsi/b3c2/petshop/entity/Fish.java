package fr.epsi.b3c2.petshop.entity;

public class Fish extends Animal {
    private FishLivEnv fishLivEnv;
    public Fish() {}

    public FishLivEnv getFishLivEnv() {
        return fishLivEnv;
    }

    public void setFishLivEnv(FishLivEnv fishLivEnv) {
        this.fishLivEnv = fishLivEnv;
    }

}
