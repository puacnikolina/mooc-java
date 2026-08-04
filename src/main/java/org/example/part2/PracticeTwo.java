package org.example.part2;

import java.util.Scanner;

public class PracticeTwo {

    static void main() {
 //       numbers();
//        sumOfASequence();
//        factorial();
//        rBr();

//        printStars(5);
//        printStars(3);
//        printStars(9);
//        printSquare(4);
//        printRectangle(17,3);
//        printTriangle(4);
        christmasTree(5);

    }

    private static void numbers(){
        Scanner scanner = new Scanner(System.in);
        double count = 0.0;
        double sum = 0.0;
        double avg = 0.0;
        while(true){
            System.out.println("Give number: ");
            int num = Integer.parseInt(scanner.nextLine());
            if(num == 0){
                break;
            }else{
                if(num > 0){
                    count ++;
                    sum +=num;
                }
            }

        }
        avg = sum/count;
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + avg);
    }

    private static void sumOfASequence(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int f = Integer.parseInt(scanner.nextLine());
        System.out.println("Last number? ");
        int l = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for(int i = f; i <= l; i++){
            sum+= i;
        }
        System.out.println("The sum is " + sum);
    }

    private static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int n = Integer.parseInt(scanner.nextLine());
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }

    private static void rBr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        double sum = 0.0;
        double count = 0.0;
        double avg = 0.0;
        int even = 0;
        int odd = 0;
        while(true){
            double num = Double.parseDouble(scanner.nextLine());

            if(num == -1){
                break;
            }

            if(num % 2 == 0){
                even++;
            }else{
                odd++;
            }

            sum += num;
            count++;
            avg = sum/count;


        }
        System.out.println("Tnx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }

    private static void printStars(int number) {
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    private static void printSquare(int size){
        for(int i = 0; i < size; i++){
            printStars(size);
        }
    }

    private static void printRectangle(int width, int height){
        for(int i = 0; i < height; i++){
            printStars(width);
        }
    }

    private static void printTriangle(int size){
        for(int i = 1; i <= size; i++){
            printSpaces(size-i);
            printStars(i);
        }
    }

    private static void printSpaces(int number){
        for(int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    private static void christmasTree(int height){
        //print centered triangle
        int stars = 3;
        for(int i = 1; i <= height; i++){
            printSpaces(height - i);
            if(i == 1){
                printStars(1);
            }else{
                printStars(stars);
                stars +=2;
            }
        }
        //print base (centered)
        int space = (stars - 3) / 2 - 1;
        for(int i = 0; i < 2; i++){
            printSpaces(space);
            printStars(3);
        }

    }
}
