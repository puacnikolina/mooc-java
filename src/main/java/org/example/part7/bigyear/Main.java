package org.example.part7.bigyear;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void main() {

        ArrayList<Bird> birds = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("?");
            String input = s.nextLine();

            switch (input){
                case "quit" -> {return;}
                case "add" ->{
                    System.out.print("Name: ");
                    String name = s.nextLine();
                    System.out.print("Name in Latin: ");
                    String nameLatin = s.nextLine();
                    birds.add(new Bird(name,nameLatin));
                }
                case "observation" -> {
                    System.out.print("Bird? ");
                    String name = s.nextLine();
                    boolean found = false;
                    for (Bird b : birds) {
                        if (b.getName().equals(name)) {
                            b.addObservation();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Not a bird!");
                    }

                }
                case "all" -> {
                    for(Bird b : birds){
                        System.out.println(b.getName() + "("+b.getLatinName()+"):" + b.getObservations() + " observations");
                    }
                }
                case "one" -> {
                    System.out.print("Bird? ");
                    String name = s.nextLine();
                    for(Bird b : birds){
                        if(b.getName().equals(name)){
                            System.out.println(b.getName() + "("+b.getLatinName()+"):" + b.getObservations() + " observations");
                        }
                    }
                }
            }
        }


    }

}
