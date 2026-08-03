package org.example.part1;

import java.util.Scanner;

public class CinemaTicket {

    static void main() {

        Scanner s = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.valueOf(s.nextLine());
        if(age < 7){
            System.out.println("Free ticket");
        }else if(age >= 7 && age <= 17){
            System.out.println("Child ticket");
        }else if(age >= 18 && age <= 64){
            System.out.println("Regular ticket");
        }else if(age >= 65){
            System.out.println("Senior ticket");
        }
    }
}
