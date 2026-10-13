package org.example.part6.heightorder;
public class Person {

    private String name;
    private int height;

    public Person(String name,int height) {
        this.name = name;
        this.height = height;

    }

    public int getHeight(){
        return this.height;
    }

    @Override
    public String toString() {
        return this.name + " " + "(" + this.height + ")";
    }
}