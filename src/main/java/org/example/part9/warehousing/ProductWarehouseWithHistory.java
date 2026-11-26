package org.example.part9.warehousing;

public class ProductWarehouseWithHistory extends ProductWarehouse{

    ChangeHistory ch;
    private double initialBalance;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.initialBalance = initialBalance;
        this.ch = new ChangeHistory();
        ch.add(initialBalance);
    }

    public void addToWarehouse(double amount){

    }

    public double takeFromWarehouse(double amount){

    }

    public String history(){
        return ch.toString();
    }
}
