package org.example.part4.animalAdoption;

import java.util.Scanner;

public class Main {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        AdoptionCenter center = new AdoptionCenter();

        addTestData(center);

        while (true) {

            showMenu();

            int option = readInt(scanner);

            if (option == 10) {
                System.out.println("Thank you for using Animal Adoption Center!");
                break;
            }

            switch (option) {

                case 1:
                    center.showAllAnimals();
                    break;

                case 2:
                    addAnimal(scanner, center);
                    break;

                case 3:
                    searchAnimals(scanner, center);
                    break;

                case 4:
                    center.showAvailableAnimals();
                    break;

                case 5:
                    registerAdopter(scanner, center);
                    break;

                case 6:
                    center.showAllAdopters();
                    break;

                case 7:
                    adoptAnimal(scanner, center);
                    break;

                case 8:
                    center.showAdoptionHistory();
                    break;

                case 9:
                    center.statistics();
                    break;

                default:
                    System.out.println("Invalid option.");
            }

            System.out.println();
        }

        scanner.close();
    }


    private static void showMenu() {
        System.out.println("====== ANIMAL ADOPTION CENTER ======\n"
                + "\n" + "1. Show all animals\n"
                + "2. Add animal\n"
                + "3. Search animals\n"
                + "4. Show available animals\n"
                + "5. Register adopter\n"
                + "6. Show adopters\n"
                + "7. Adopt animal\n"
                + "8. Show adoption history\n"
                + "9. Statistics\n"
                + "10. Exit\n"
                + "\n" + "Choose option:");
    }


    private static void addAnimal(Scanner scanner, AdoptionCenter center) {

        System.out.println("Animal name:");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        System.out.println("Animal type:");
        String type = scanner.nextLine().trim();

        if (type.isEmpty()) {
            System.out.println("Type cannot be empty.");
            return;
        }

        System.out.println("Animal age:");
        int age = readInt(scanner);

        if (age < 0) {
            System.out.println("Age cannot be negative.");
            return;
        }

        center.addAnimal(name, type, age);
    }


    private static void searchAnimals(Scanner scanner, AdoptionCenter center) {

        System.out.println("Search:");
        String query = scanner.nextLine().trim();

        if (query.isEmpty()) {
            System.out.println("Search cannot be empty.");
            return;
        }

        center.searchAnimals(query);
    }


    private static void registerAdopter(Scanner scanner, AdoptionCenter center) {

        System.out.println("First name:");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        System.out.println("Last name:");
        String surname = scanner.nextLine().trim();

        if (surname.isEmpty()) {
            System.out.println("Surname cannot be empty.");
            return;
        }

        System.out.println("Contact:");
        String contact = scanner.nextLine().trim();

        if (contact.isEmpty()) {
            System.out.println("Contact cannot be empty.");
            return;
        }

        center.registerAdopter(name, surname, contact);
    }


    private static void adoptAnimal(Scanner scanner, AdoptionCenter center) {

        System.out.println("Animal ID:");
        int animalId = readInt(scanner);

        if (animalId <= 0) {
            System.out.println("Invalid animal ID.");
            return;
        }

        System.out.println("Adopter ID:");
        int adopterId = readInt(scanner);

        if (adopterId <= 0) {
            System.out.println("Invalid adopter ID.");
            return;
        }

        center.adoptAnimal(animalId, adopterId);
    }


    private static int readInt(Scanner scanner) {

        while (true) {

            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number:");
            }
        }
    }


    private static void addTestData(AdoptionCenter center) {


        center.addAnimal("Luna", "Dog", 3);

        center.addAnimal("Max", "Dog", 5);

        center.addAnimal("Mimi", "Cat", 2);

        center.addAnimal("Oliver", "Rabbit", 1);

        center.addAnimal("Bella", "Cat", 4);


        center.registerAdopter("Delilah ", "Judd", "0641234567");

        center.registerAdopter("Kim", "Grayson", "0659876543");

        center.registerAdopter("Presley", "Peck", "0635555555");
    }
}