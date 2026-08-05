package org.example.part3;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Array {

    static void main() {
        Scanner scanner = new Scanner(System.in);
//        swap(scanner);
//        indexNotFound(scanner);
        int[] numbers = {5, 1, 3, 4, 2};
//        System.out.println(sumOfNumbersInArray(numbers));
//        printNeatly(numbers);
        printArrayInStars(numbers);
    }


    private static void swap(Scanner scanner){

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

    private static void indexNotFound(Scanner scanner){

        int[] numbers = new int[4];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;

        System.out.println("Search for? ");
        int n = Integer.parseInt(scanner.nextLine());

        boolean found = false;
        int index = 0;
        for(int i = 0; i < numbers.length; i++){
            if(n == numbers[i]){
                found = true;
                index = i;
            }
        }
        if(found){
            System.out.println(n + " is at index " + index);
        }else{
            System.out.println(n + " was not found");
        }

    }

    private static int sumOfNumbersInArray(int[] array){
        int sum = 0;
        for(int n : array){
            sum+= n;
        }
        return sum;
    }

    private static void printNeatly(int[] array){
       for(int i = 0; i < array.length; i++){
           System.out.print(array[i]);

           if(i < array.length - 1){
               System.out.print(", ");
           }
       }
    }

    private static void printArrayInStars(int[] array){
        for(int n : array){
            for(int i = 1; i <= n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
