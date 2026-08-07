package org.example.part4.three;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class GuestList {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        String file = "src/main/java/org/example/part4/three/" + fileName;

        ArrayList<String> guests = new ArrayList<>();
        try(Scanner s = new Scanner(Paths.get(file))){
            while(s.hasNextLine()){
                String line = s.nextLine().trim();
                guests.add(line.toLowerCase());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");

        System.out.println("Enter names, an empty line quits: ");
        while(true){
            String name = scanner.nextLine().trim().toLowerCase();
            if(name.isEmpty()){
                break;
            }

            if(guests.contains(name)){
                System.out.println("The name is on the list.");
            }else{
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
    }


}
