package org.example.part8.Storage;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> facilities;

    public StorageFacility(){
        this.facilities = new HashMap<>();
    }

    public void add(String unit, String item){

        //napravi se nova lista za unit ako nije postojala vec
        facilities.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> items = facilities.get(unit);
        items.add(item);

        //moze isto da se napise i kao
        //this.facilities.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        return facilities.get(storageUnit);
    }

    public void remove(String storageUnit, String item){
        facilities.get(storageUnit).remove(item);
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        for(String s : facilities.keySet()){
            if(facilities.get(s).isEmpty()){
                continue;
            }
            units.add(s);
        }
        return units;
    }

}
