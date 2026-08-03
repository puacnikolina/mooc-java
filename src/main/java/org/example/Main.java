package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the year:");
        int y = Integer.valueOf(scanner.nextLine());
        if(y%100 == 0){
            if(y%400==0) {
                System.out.println("The year is a leap year.");
            }else{
                System.out.println("The year is not a leap year.");
            }
        }else if(y%4 == 0){
            System.out.println("The year is a leap year.");
        }else{
            System.out.println("The year is not a leap year.");
        }

    }
}
