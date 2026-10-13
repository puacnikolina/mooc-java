package org.example.part1;

import java.util.Scanner;

public class PracticeOne {
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
