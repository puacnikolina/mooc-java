package org.example.part1;

import java.util.Scanner;

public class ShoppingDiscount {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Total price: ");
        int price = Integer.valueOf(s.nextLine());
        double discout = 0;
        double finalPrice = 0;
        if(price <= 500){
            discout = 0;
            finalPrice = price;
        }else if(price <= 999){
            discout = 5.0/100;
            finalPrice = price - (discout * price);
        }else if(price >= 1000 && price <= 1999){
            discout = 10.0/100;
            finalPrice = price - (discout * price);
        }else if(price >= 2000){
            discout = 20.0/100;
            finalPrice = price - (discout * price);
        }

        System.out.println("Discount: ");
        System.out.println(discout * 100 + "%");
        System.out.println("Final price: ");
        System.out.println(finalPrice);
    }
}
