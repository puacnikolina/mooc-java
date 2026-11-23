package org.example.part7;

public class Container {

    private int liquid;

    public Container(){
        this.liquid = 0;
    }

    public int contains(){
        return liquid;
    }

    public void add(int amount){
        if(amount < 0){
            return;
        }
        if(liquid + amount > 100){
            liquid = 100;
            return;
        }
        liquid += amount;
    }

    public void remove(int amount){
        if(amount < 0){
            return;
        }
        if(liquid - amount < 0){
            liquid = 0;
            return;
        }
        liquid -= amount;
    }

    public String toString(){
        return liquid + "/100";
    }

}
