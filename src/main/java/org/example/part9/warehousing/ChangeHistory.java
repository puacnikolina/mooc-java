package org.example.part9.warehousing;

import java.util.ArrayList;

public class ChangeHistory {

    ArrayList<Double> history;

    public ChangeHistory(){
        history = new ArrayList<>();
    }

    public void add(double status){
        history.add(status);
    }

    public void clear(){
        history.clear();
    }

    public double maxValue(){
        if(history.isEmpty())
            return 0;
        double largest = history.get(0);
        for(int i = 0; i < history.size(); i++){
            if(history.get(i) > largest){
                largest = history.get(i);
            }
        }
        return largest;
    }

    public double minValue(){
        if(history.isEmpty())
            return 0;
        double smallest = history.get(0);
        for(int i = 0; i < history.size(); i++){
            if(history.get(i) < smallest){
                smallest = history.get(i);
            }
        }
        return smallest;
    }

    public double average(){
        if(history.isEmpty())
            return 0;
        double sum = 0.0;
        for(Double v : history){
            sum += v;
        }
        return sum/history.size();
    }

    public String toString(){
        return history.toString();
    }
}
