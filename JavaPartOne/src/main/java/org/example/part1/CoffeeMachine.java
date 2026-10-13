package org.example.part1;

import java.util.Scanner;

public class CoffeeMachine {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        final int ESSPRESSO = 180;
        final int CAPPUCCINO = 220;
        final int LATTE = 250;
        final int TEA = 120;
        final int PACKAGING_FEE = 20;

        System.out.println("====== MENU ======\n" +
                "1 - Espresso (180)\n" +
                "2 - Cappuccino (220)\n" +
                "3 - Latte (250)\n" +
                "4 - Tea (120)");

        System.out.println("Select a drink: ");
        int drink = Integer.valueOf(scanner.nextLine());

        if(drink <= 0 || drink > 4){
            System.out.println("Invalid selection");
        }else{
            System.out.println("How many?");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.println("Takeaway? (yes/no)");
            String takeaway = scanner.nextLine().trim();

            int total = 0;
            String name = "";
            int price = 0;

            switch(drink){
                case 1:
                    name = "Espresso";
                    price = ESSPRESSO;
                    break;
                case 2:
                    name = "Cappuccino";
                    price = CAPPUCCINO;
                    break;
                case 3:
                    name = "Latte";
                    price = LATTE;
                    break;
                case 4:
                    name = "Tea";
                    price = TEA;
                    break;
            }

            System.out.println("Selected: " + name);
            System.out.println("Quantity: " + quantity);

            if(takeaway.equalsIgnoreCase("yes")){
                total = price * quantity + PACKAGING_FEE;
                System.out.println("Packaging fee: " + PACKAGING_FEE);
            }else{
                total = price * quantity;
            }

            System.out.println("Total:  " + total);
        }

    }

}
