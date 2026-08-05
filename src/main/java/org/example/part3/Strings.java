package org.example.part3;

import java.util.Scanner;

public class Strings {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        login(scanner);
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

}
