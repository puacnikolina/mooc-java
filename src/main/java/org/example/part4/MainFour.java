package org.example.part4;

import java.util.Scanner;

public class MainFour {

    static void main() {

//        firstBankTransfer();
//        whistle();
//        decreasing();
//        debt();
//        person();
//        statistics();
        statisticsTwo();
    }

    private static void firstBankTransfer(){
        Account matthewsAcc = new Account("Matthews account", 1000.0);
        Account myAccount = new Account("My account", 0);

        System.out.println(matthewsAcc.withdraw(100.0));
        System.out.println(myAccount.deposit(100.0));
    }
    private static void whistle(){
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
    private static void decreasing(){
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
    private static void debt(){

        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();

    }
    private static void person(){
        Person matti = new Person("Matti");
        Person juhana = new Person("Juhana");

        matti.setHeight(180);
        matti.setWeight(86);
        matti.setAge(45);

        juhana.setHeight(175);
        juhana.setWeight(64);
        juhana.setAge(26);

        System.out.println(matti);
        System.out.println(juhana);
    }
    private static void statistics(){
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
    private static void statisticsTwo(){
        Scanner scanner = new Scanner(System.in);
        Statistics all = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        while(true){
            int num = Integer.parseInt(scanner.nextLine());
            if(num == -1){
                break;
            }
            all.addNumber(num);

            if(num % 2 == 0){
                even.addNumber(num);
            }else{
                odd.addNumber(num);
            }
        }
        System.out.println("Sum: " + all.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }

}
