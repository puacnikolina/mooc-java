package org.example.part4;

import java.util.ArrayList;

public class Statistics {
    private int count;
    private ArrayList<Integer> numbers;

    public Statistics() {
       this.count = 0;
       this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
        count++;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        int sum = 0;
        for(int n : numbers){
            sum += n;
        }
        return sum;
    }

    public double average() {
        return (double)this.sum() / count;
    }
}
