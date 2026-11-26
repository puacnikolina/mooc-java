package org.example.part9.person;

public class Student extends Person{

    int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public void study(){
        this.credits++;
    }

    public int credits(){
        return this.credits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "  Study credits " + credits;
    }
}
