package org.example.part4;

public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public double withdraw(double amount){
        if(amount < 0){
            System.out.println("Invalid amount.");
            return balance;
        }
        if(balance < amount){
            System.out.println("Insufficient funds.");
            return balance;
        }

        balance -= amount;
        return balance;
    }

    public double deposit(double amount){
        if(amount < 0){
            System.out.println("Invalid amount.");
            return balance;
        }
        balance += amount;
        return balance;

    }

    public double getBalance() {
        return balance;
    }
}
