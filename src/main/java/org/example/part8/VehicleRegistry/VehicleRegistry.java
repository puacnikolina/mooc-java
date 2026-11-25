package org.example.part8.VehicleRegistry;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> cars = new HashMap<>();

    public boolean add(LicensePlate licensePlate, String owner){
        if(cars.containsKey(licensePlate)){
            return false;
        }
        cars.put(licensePlate,owner);
        return true;
    }

    public String get(LicensePlate licensePlate){
        return cars.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if(cars.containsKey(licensePlate)){
            cars.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates(){
        for(LicensePlate k : cars.keySet()){
            System.out.println(k);
        }
    }

    public void printOwners(){
        Set<String> oweners = new HashSet<>();
        for(String v : cars.values()){
            oweners.add(v);
        }
        for(String o : oweners){
            System.out.println(o);
        }
    }
}
