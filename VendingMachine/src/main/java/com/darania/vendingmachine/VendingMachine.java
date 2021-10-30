package com.darania.vendingmachine;

public class VendingMachine {

    //array of items
    private Item [] items;
    //capacity of Vending Machine
    private int capacity;
    //number
    private int count;

    public VendingMachine ( int capacity, int count) {
        //when we create a new vending machine we can add to this array.
        this.items = new Item [capacity];
        this.capacity = capacity;
        this.count = count;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}





