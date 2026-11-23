package org.example.part7;

import java.util.Scanner;

public class MainTest {

    static void main() {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
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
                    first.add(amount);
                    break;
                case "move":
                    first.remove(amount);
                    second.add(amount);
                    break;
                case "remove":
                   second.remove(amount);
                    break;
            }

        }
    }
}
