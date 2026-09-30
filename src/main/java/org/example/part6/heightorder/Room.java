package org.example.part6.heightorder;

import java.util.ArrayList;

public class Room {

    static void main() {
        Room room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        while (!room.isEmpty()) {
            System.out.println(room.take());
        }

    }

    public ArrayList<Person> people;

    public Room(){
        this.people = new ArrayList<>();
    }

    public void add(Person person){
        this.people.add(person);
    }

    public boolean isEmpty(){
        return this.people.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return this.people;
    }

    public Person shortest(){
        Person shortest = people.get(0);
        for(Person p : people){
            if(p.getHeight() < shortest.getHeight()){
                shortest = p;
            }
        }
        return shortest;
    }

    public Person take(){
        if(people.isEmpty()){
            return null;
        }
        Person s = shortest();
        this.people.remove(s);
        return s;
    }



}
