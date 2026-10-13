package org.example.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class Strings {

    static void main() {
        Scanner scanner = new Scanner(System.in);
//        login(scanner);
//        lineByLine(scanner);
//        containsString(scanner);
//        ageOfTheOldest(scanner);
//        nameOfTheOldest(scanner);
        personalDetails(scanner);
    }

    private static void login(Scanner scanner){
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if((username.equals("alex") && password.equals("sunshine")) || (username.equals("emma") && password.equals("haskell"))){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }
    }

    private static void lineByLine(Scanner scanner){
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        for(String w: words){
            System.out.println(w);
        }
    }

    private static void containsString(Scanner scanner){
        while(true){
            String line = scanner.nextLine().toLowerCase();
            if(line.isEmpty()){
                break;
            }

            String[] words = line.split(" ");
            for(String w : words){
                if(w.contains("av")){
                    System.out.println(w);
                }
            }
        }
    }

    private static void ageOfTheOldest(Scanner scanner){
        int oldestAge = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }

            String[] parts = input.split(",");
            int currentAge = Integer.parseInt(parts[1]);

            if (currentAge > oldestAge) {
                oldestAge = currentAge;
            }
        }
        System.out.println("Age of the oldest: " + oldestAge);
    }

    private static void nameOfTheOldest(Scanner scanner){
        int oldestAge = 0;
        String name = "";
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }

            String[] parts = input.split(",");
            int currentAge = Integer.parseInt(parts[1]);

            if (currentAge > oldestAge) {
                oldestAge = currentAge;
                name = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }

    private static void personalDetails(Scanner scanner){
        double avg = 0.0;
        double sum = 0.0;
        double count = 0.0;
        String longestName = "";
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            String[] parts = input.split(",");
            sum += Integer.parseInt(parts[1]);
            count++;
            String currentName = parts[0];
            if(currentName.length() > longestName.length()){
                longestName = currentName;
            }

        }
        avg = sum / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth year: " + avg);
    }
}
