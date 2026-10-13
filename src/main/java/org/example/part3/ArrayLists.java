package org.example.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

    static void main() {
//        thirdElement();
//        secondPlusThird();
//        listOperations();
//        remeberTheseNumbers();
//        greatestInTheList();
//        indexOf();
//        onTheList();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

//        System.out.println("The numbers in the range [0, 5]");
//        printNumbersInRange(numbers, 0, 5);
//
//        System.out.println("The numbers in the range [3, 10]");
//        printNumbersInRange(numbers, 3, 10);

        System.out.println(sum(numbers));

    }

    private static ArrayList<String> loadNames(Scanner scanner){
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Give me names: ");
        while(true){
            String s = scanner.nextLine();
            if(s.equals("")){
                break;
            }
            names.add(s);

        }
        return names;
    }

    private static ArrayList<Integer> loadNumbers(Scanner scanner){
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Give me numbers: ");
        while(true){
            int n = Integer.parseInt(scanner.nextLine());
            if(n == -1){
                break;
            }
            numbers.add(n);
        }
        return numbers;
    }

    private static void thirdElement(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = loadNames(scanner);
        System.out.println(names.get(2));
        System.out.println("In total: " + names.size());

    }

    private static void secondPlusThird(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = loadNumbers(scanner);
        System.out.println(numbers.get(1) + numbers.get(2));
    }

    private static void listOperations(){
        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Simon");
        teachers.add("Samuel");
        teachers.add("Ann");
        teachers.add("Anna");

        System.out.println("Size: " + teachers.size());
        System.out.println("First: " + teachers.get(0));
        System.out.println("Last: " + teachers.get(teachers.size() - 1));
    }

    private static void remeberTheseNumbers(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = loadNumbers(scanner);

        System.out.println("From where? ");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("To where? ");
        int end = Integer.parseInt(scanner.nextLine());

        for(int i = start; i <= end; i++){
            System.out.println(numbers.get(i));
        }
    }

    private static void greatestInTheList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = loadNumbers(scanner);

        int smallest = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) < smallest){
                smallest = numbers.get(i);
            }
        }
        System.out.println("Smallest in the list: " + smallest);
    }

    private static void indexOf(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = loadNumbers(scanner);
        System.out.println("Search for: ");
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < numbers.size(); i++){
            if(n == numbers.get(i)){
                System.out.println(n + " is at index " + i);
            }
        }
    }

    private static void onTheList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = loadNames(scanner);
        System.out.println("Search for? ");
        String name = scanner.nextLine();
        if(names.contains(name)){
            System.out.println(name + " was found!");
        }else{
            System.out.println(name + " was not found!");
        }
    }

    private static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(int n : numbers){
            if(n >= lowerLimit && n <= upperLimit){
                System.out.println(n);
            }
        }
    }

    public static int sum(ArrayList<Integer> numbers){
        if(numbers.size() == 0){
            return -1;
        }

        int sum = 0;
        for(int n : numbers){
            sum += n;
        }

        return sum;
    }
}
