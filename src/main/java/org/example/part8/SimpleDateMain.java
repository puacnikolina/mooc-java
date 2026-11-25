package org.example.part8;

import java.util.HashSet;
import java.util.Set;

public class SimpleDateMain {

    static void main() {
        SimpleDate a = new SimpleDate(2, 1, 2000);
        SimpleDate b = new SimpleDate(2, 1, 2000);
        System.out.println(a.equals(b));                    // očekuješ: ?
        System.out.println(a.hashCode() == b.hashCode());   // očekuješ: ?

        Set<Integer> hashes = new HashSet<>();
        int total = 0;

        for (int year = 1900; year <= 2100; year++) {
            for (int month = 1; month <= 12; month++) {
                for (int day = 1; day <= 31; day++) {
                    for (int hour = 0; hour <= 23; hour++){
                        hashes.add(new SimpleDate(day, month, year, hour).hashCode());
                        total++;
                    }

                }
            }
        }

        System.out.println("Probano datuma: " + total);
        System.out.println("Različitih hasheva: " + hashes.size());
    }


}
