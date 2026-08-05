package org.example.part3;

import java.util.Scanner;

public class Array {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        swap();
    }


    private static void swap(){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        numbers[4] = 1;

        for(int n: numbers){
            System.out.println(n);
        }

        System.out.println("Give two indices to swap: ");
        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());

        int x = numbers[one];
        numbers[one] = numbers[two];
        numbers[two] = x;

        for(int n: numbers){
            System.out.println(n);
        }
    }

    private static void indexNotFound(){

        int[] numbers = new int[4];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;

        System.out.println("Search for? ");

    }
}
