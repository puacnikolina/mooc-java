package org.example.part3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ContactManager {

    static void main() {

        ArrayList<String> contacts = new ArrayList<>();
        contacts.add("Lara");
        contacts.add("Kratos");
        contacts.add("Ellie");
        contacts.add("Ada");

        Scanner scanner = new Scanner(System.in);
        while(true){
            showMeni();
            int option = Integer.parseInt(scanner.nextLine());

            if(option == 6){
                break;
            }

            switch (option){
                case 1:
                    if(contacts.isEmpty()){
                        System.out.println("No contacts.");
                        break;
                    }else{
                        showContacts(contacts);
                    }
                    break;
                case 2:
                    addContact(scanner,contacts);
                    break;
                case 3:
                    if(contacts.isEmpty()){
                        System.out.println("No contacts.");
                        break;
                    }else{
                        removeContact(scanner,contacts);
                    }
                    break;
                case 4:
                    searchContacts(scanner,contacts);
                    break;
                case 5:
                    showStatistics(contacts);
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }

    }

    private static void showMeni(){
        System.out.println("====== CONTACT MANAGER ======\n" +
                "\n" +
                "1. Show contacts\n" +
                "2. Add contact\n" +
                "3. Remove contact\n" +
                "4. Search contact\n" +
                "5. Contact statistics\n" +
                "6. Exit\n" +
                "\n" +
                "Choose option:");
    }

    private static void showContacts(ArrayList<String> contacts){
        for(int i = 0; i < contacts.size(); i++){
            System.out.println((i+1) + ". " + contacts.get(i));
        }
    }
    private static void addContact(Scanner scanner, ArrayList<String> contacts ){
        System.out.println("Enter contact name:");
        String name = scanner.nextLine().trim();
        if(name.isEmpty()){
            System.out.println("Invalid input.");
            return;
        }

        for (String contact : contacts) {
            if (contact.equalsIgnoreCase(name)) {
                System.out.println("Contact already exists");
                return;
            }
        }

        contacts.add(name);
        System.out.println("Contact added");


    }
    private static void removeContact(Scanner scanner, ArrayList<String> contacts){
        System.out.println("Enter contact name:");
        String name = scanner.nextLine().trim();
        if(name.isEmpty()){
            System.out.println("Invalid input.");
            return;
        }
        for (String contact : contacts) {
            if (contact.equalsIgnoreCase(name)) {
                contacts.remove(contact);
                System.out.println("Contact removed");
                return;
            }
        }
        System.out.println("Contact not found");

    }
    private static void searchContacts(Scanner scanner, ArrayList<String> contacts){
        System.out.println("Search... ");
        String query = scanner.nextLine().trim().toLowerCase();
        for(String c : contacts){
            if(c.toLowerCase().contains(query))
                System.out.println(c);

        }
    }
    private static void showStatistics(ArrayList<String> contacts){
        int numOfContacts = contacts.size();
        int[] lengths = new int[numOfContacts];
        double sum = 0.0;
        double avgLength = 0.0;
        String longestName = "";
        String shortestName = contacts.get(0);

        for(int i = 0;i < contacts.size(); i++){
            lengths[i] = contacts.get(i).length();
            String currentName = contacts.get(i);
            if(currentName.length() < shortestName.length()){
                shortestName = currentName;
            }

            if(currentName.length() > longestName.length()){
                longestName = currentName;
            }
        }

        for(int i : lengths){
            sum+=i;
        }

        avgLength = sum/numOfContacts;

        System.out.println("Contacts: " + numOfContacts);
        System.out.println("Longest name: " + longestName);
        System.out.println("Shortest name: " + shortestName);
        System.out.println("Average length: " + avgLength);

    }

}
