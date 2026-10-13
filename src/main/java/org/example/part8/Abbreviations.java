package org.example.part8;

import java.util.HashMap;

public class Abbreviations {

    static void main() {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }

    HashMap<String,String> abbervations;

    public Abbreviations(){
        this.abbervations = new HashMap<>();
    }


    public void addAbbreviation(String abbreviation, String explanation){
        this.abbervations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        return abbreviation.contains(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
       return abbervations.get(abbreviation);
    }


}
