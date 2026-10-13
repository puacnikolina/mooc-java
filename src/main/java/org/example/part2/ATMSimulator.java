package org.example.part2;

import java.util.Scanner;

public class ATMSimulator {

    static void main() {

        double balance = 1000.0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            showMenu();
            int option = Integer.parseInt(scanner.nextLine());

            if(option == 4){
                System.out.println("Thank you for using our ATM.");
                break;
            }

            switch (option){
                case 1:
                    System.out.println("Current balance: " + balance);
                    break;
                case 2:
                    System.out.println("Amount to deposit: ");
                    double depositAmount = Double.parseDouble(scanner.nextLine());
                    balance = deposit(balance,depositAmount);
                    break;
                case 3:
                    System.out.println("Amount to withdraw: ");
                    double withdrawAmount = Double.parseDouble(scanner.nextLine());
                    balance = withdraw(balance,withdrawAmount);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

    }

    private static void showMenu(){
        System.out.println("====== ATM ======\n" +
                "\n" +
                "1. Check balance\n" +
                "2. Deposit money\n" +
                "3. Withdraw money\n" +
                "4. Exit\n" +
                "\n" +
                "Choose option:");
    }

    private static double deposit(double balance, double amount){
        if(amount < 0){
            System.out.println("Invalid amount.");
            return balance;
        }
        System.out.println("Transaction successful.");
        return balance + amount;
    }

    private static double withdraw(double balance, double amount){
        if(amount < 0){
            System.out.println("Invalid amount.");
            return balance;
        }
        if(balance < amount){
            System.out.println("Insufficient funds.");
            return balance;
        }

        System.out.println("Transaction successful.");
        return balance - amount;
    }

}
