package com.darania.vendingmachine;

public class Main {
    public static void main(String[] args) {
        Item twix = new Item ("Twix", 0.96);
        Item walkers = new Item ("Walkers: salt & vinegar", 0.96);
        Item [] items = {twix, walkers};

        VendingMachine vendingMachine= new VendingMachine(50, 0);
        VendingMachineService vendingMachineService = new VendingMachineService();
        //loop through the items and add the items.
        for (Item item : items) {
           int result = vendingMachineService.addItem(vendingMachine, item);
            System.out.println(result);
        }

        System.out.println();
    }
}
