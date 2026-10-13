package org.example.part4.one;

public class Debt {

    double balance;
    double interestRate;

    public Debt(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void printBalance(){
        System.out.println("Current balance: " + balance);
    }

    public void waitOneYear(){
        balance *= interestRate;
    }

}
