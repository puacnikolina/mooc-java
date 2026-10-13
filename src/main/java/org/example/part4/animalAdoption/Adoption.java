package org.example.part4.animalAdoption;

public class Adoption {

    private Animal animal;
    private Adopter adopter;

    public Adoption(Animal animal, Adopter adopter){
        this.animal = animal;
        this.adopter = adopter;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Adopter getAdopter() {
        return adopter;
    }
}
