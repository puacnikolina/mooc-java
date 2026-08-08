package org.example.part4.animalAdoption;

public class Adopter {

    private int id;
    private String name;
    private String surname;
    private String contact;

    public Adopter(int id, String name, String surname, String contact) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", name: '" + name + '\'' +
                ", surname: '" + surname + '\'' +
                ", contact: '" + contact + '\'';
    }
}