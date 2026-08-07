package org.example.part4;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        if((balance - 2.60) < 0){
            return;
        }
        balance -= 2.60;


    }

    public void eatHeartily() {
        if((balance - 4.60) < 0){
            return;
        }
        balance -= 4.60;
    }

    public void addMoney(double amount) {
        if(amount < 0){
            return;
        }
        if(balance + amount >= 150){
            balance = 150;
            return;
        }
        balance += amount;
    }


    public String toString() {
        return "The card has a balance of "+ balance +" euros";
    }

}
