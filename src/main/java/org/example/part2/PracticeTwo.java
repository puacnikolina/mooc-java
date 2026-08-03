package org.example.part2;

import java.util.Scanner;

public class PracticeTwo {

    static void main() {

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


}
