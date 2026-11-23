package org.example.part7;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstAmount = 0;
        int secondAmount = 0;

        while (true) {
            System.out.println("First: " + firstAmount + "/100");
            System.out.println("Second: " + secondAmount + "/100");
            System.out.print("> ");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int amount = Integer.parseInt(parts[1]);
            if(amount < 0){
                continue;
            }
            switch (parts[0]){
                case "add":
                    if(firstAmount == 100){
                        continue;
                    }
                    if((firstAmount + amount) > 100){
                        firstAmount = 100;
                        continue;
                    }
                    firstAmount += amount;
                    break;
                case "move":
                    if(firstAmount == 0){
                        continue;
                    }
                    if(amount > firstAmount){
                        secondAmount += firstAmount;
                        firstAmount = 0;
                        continue;
                    }
                    firstAmount -= amount;
                    if(secondAmount + amount > 100){
                        secondAmount = 100;
                        continue;
                    }
                    secondAmount += amount;
                    break;
                case "remove":
                    if(secondAmount < amount){
                        secondAmount = 0;
                        continue;
                    }
                    secondAmount -= amount;
                    break;
                default:
                    break;
            }

        }
    }

}

