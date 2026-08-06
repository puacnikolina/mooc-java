package org.example.part4;

public class MainFour {

    static void main() {

//        firstBankTransfer();
//        whistle();
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
}
