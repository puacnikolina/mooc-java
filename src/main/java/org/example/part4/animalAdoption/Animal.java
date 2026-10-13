package org.example.part4.animalAdoption;

public class Animal {

    private int id;
    private String name;
    private String type;
    private int age;
    private String status;

    public Animal(int id, String name, String type, int age) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
        this.status = "Available";
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", name: '" + name + '\'' +
                ", type: '" + type + '\'' +
                ", age: " + age +
                ", status: '" + status + '\'';
    }
}