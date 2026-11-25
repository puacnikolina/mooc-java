package org.example.part8.VehicleRegistry;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//        // the following is the same sample program shown in ex 8.13 description
//
//        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
//        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
//        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
//
//        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
//        finnishPlates.add(li1);
//        finnishPlates.add(li2);
//
//        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
//        if (!finnishPlates.contains(newLi)) {
//            finnishPlates.add(newLi);
//        }
//        System.out.println("finnish: " + finnishPlates);
//        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg
//
//        HashMap<LicensePlate, String> owners = new HashMap<>();
//        owners.put(li1, "Arto");
//        owners.put(li3, "Jürgen");
//
//        System.out.println("owners:");
//        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
//        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
//        // if the hasCode-method hasn't been overwritten, the owners won't be found


            // --- Blok 1: LicensePlate (primer iz zadatka) ---
            LicensePlate li1 = new LicensePlate("FI", "ABC-123");
            LicensePlate li2 = new LicensePlate("FI", "UXE-465");
            LicensePlate li3 = new LicensePlate("D", "B WQ-431");

            ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
            finnishPlates.add(li1);
            finnishPlates.add(li2);

            LicensePlate newLi = new LicensePlate("FI", "ABC-123");
            if (!finnishPlates.contains(newLi)) {
                finnishPlates.add(newLi);
            }
            System.out.println("finnish: " + finnishPlates);   // očekuješ: ?

            System.out.println(li1.equals(newLi));                    // očekuješ: ?
            System.out.println(li1.hashCode() == newLi.hashCode());   // očekuješ: ?
            System.out.println(li1.equals(li2));                      // očekuješ: ?
            System.out.println(li1.equals(null));                     // očekuješ: ?
            System.out.println(li1.equals("FI ABC-123"));             // očekuješ: ?

            // --- Blok 2: add / get / remove ---
            VehicleRegistry registry = new VehicleRegistry();

            System.out.println(registry.add(li1, "Arto"));                            // ?
            System.out.println(registry.add(new LicensePlate("FI", "ABC-123"), "X")); // ?
            System.out.println(registry.get(li1));                                    // ?
            System.out.println(registry.get(li2));                                    // ?
            System.out.println(registry.remove(li2));                                 // ?
            System.out.println(registry.remove(li1));                                 // ?
            System.out.println(registry.get(li1));                                    // ?

            // --- Blok 3: ispis ---
            registry.add(li1, "Arto");
            registry.add(li2, "Arto");
            registry.add(li3, "Jürgen");

            registry.printLicensePlates();   // koliko redova očekuješ?
            registry.printOwners();          // koliko redova očekuješ, i zašto?
    }



}


