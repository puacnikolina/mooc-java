package org.example.part9.person;

public class Teacher extends Person{

    int salary;

    public Teacher(String name, String address,int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  salary " + salary + " euro/month";
    }
}

