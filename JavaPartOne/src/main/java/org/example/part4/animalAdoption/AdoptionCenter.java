package org.example.part4.animalAdoption;

import java.util.ArrayList;

public class AdoptionCenter {

    private ArrayList<Animal> animals;
    private ArrayList<Adopter> adopters;
    private ArrayList<Adoption> adoptions;

    private int nextAnimalId = 1;
    private int nextAdopterId = 1;

    public AdoptionCenter() {
        this.animals = new ArrayList<>();
        this.adopters = new ArrayList<>();
        this.adoptions = new ArrayList<>();
    }


    public void showAllAnimals(){
        if(animals.isEmpty()){
            System.out.println("No animals registered.");
            return;
        }
        for(int i = 0; i < animals.size(); i++){
            System.out.println((i+1) + ". " + animals.get(i).getName() + " - " + animals.get(i).getType() +" - " + animals.get(i).getAge() + " years " + animals.get(i).getStatus());
        }
    }

    public void addAnimal(String name, String type, int age) {

        Animal animal = new Animal(nextAnimalId, name, type, age);

        animals.add(animal);
        nextAnimalId++;

        System.out.println("Animal added successfully.");
    }

    public void searchAnimals(String query){
        query = query.toLowerCase();
        int found = 0;
        for(Animal a : animals){
            if(a.getName().toLowerCase().contains(query)){
                System.out.println(a);
                found++;
            }
        }
        if(found == 0){
            System.out.println("No animals found.");
        }
    }

    public void showAvailableAnimals(){
        int available = 0;
        for(int i = 0; i < animals.size(); i++){
            if(animals.get(i).getStatus().equals("Available")){
                available++;
                System.out.println((i+1) + ". "+ animals.get(i).getName() + " - " + animals.get(i).getType() + " - " + animals.get(i).getAge() + " years");
            }
        }
        if(available == 0){
            System.out.println("No animals available for adoption.");
        }
    }

    public void registerAdopter(String name, String surname, String contact) {

        Adopter adopter = new Adopter(nextAdopterId, name, surname, contact);

        adopters.add(adopter);
        nextAdopterId++;

        System.out.println("Adopter registered successfully.");
    }

    public void showAllAdopters(){
        if(adopters.isEmpty()){
            System.out.println("No adopters registered.");
            return;
        }
        for(Adopter a : adopters){
            System.out.println(a);
        }
    }

    public void adoptAnimal(int animalId, int adopterId){
        Animal animal = null;
        Adopter adopter = null;
        for(int i = 0; i < animals.size(); i++){
            if(animals.get(i).getId() == animalId){
                animal = animals.get(i);
            }
        }

        if(animal == null){
            System.out.println("Animal not found.");
            return;
        }

        for(int i = 0; i < adopters.size(); i++){
            if(adopters.get(i).getId() == adopterId){
                adopter = adopters.get(i);
            }
        }
        if(adopter == null){
            System.out.println("Adopter not found.");
            return;
        }


        if(animal.getStatus().equals("Adopted")){
            System.out.println("Animal has already been adopted.");
        }else{
            Adoption adoption = new Adoption(animal, adopter);
            adoptions.add(adoption);

            animal.setStatus("Adopted");
            System.out.println(animal.getName() + " has been adopted by " + adopter.getName() + " " + adopter.getSurname());
        }

    }

    public void showAdoptionHistory(){
        if(adoptions.isEmpty()){
            System.out.println("No adoption history.");
        }
        for(int i = 0; i < adoptions.size(); i++){
            Animal animal = adoptions.get(i).getAnimal();
            Adopter adopter = adoptions.get(i).getAdopter();
            System.out.println(animal.getName() + " (" + animal.getType() + ") " + " -> " + adopter.getName() + " " + adopter.getSurname());
        }
    }

    public void statistics(){
        int totalAnimals = animals.size();
        int totalAdopters = adopters.size();
        int totalAdoptions = adoptions.size();
        int availableAnimals = 0;
        int adoptedAnimals = 0;

        for(Animal a : animals){
            if(a.getStatus().equals("Adopted")){
                adoptedAnimals++;
            }else{
                availableAnimals++;
            }
        }

        System.out.println("====== STATISTICS ======\n" +
                "\n" +
                "Total animals: " + totalAnimals + "\n" +
                "Available animals: " + availableAnimals + "\n" +
                "Adopted animals: " + adoptedAnimals + "\n" +
                "\n" +
                "Total adopters: " + totalAdopters + "\n" +
                "Total adoptions: " + totalAdoptions);

    }


}
