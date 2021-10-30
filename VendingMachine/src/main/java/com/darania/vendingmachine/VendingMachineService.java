package com.darania.vendingmachine;

//anything in this class will include functionality. Keep functionality separate for clean coding.
public class VendingMachineService {

    public int addItem(VendingMachine machine, Item item) {
        // check capacity
        // put item in
        // increment count
    if (machine.getCount() + 1 <= machine.getCapacity()) {
          Item[] items = machine.getItems();
          //getting the items
          items[machine.getCount()] = item;
          //this will be 2 as it is counting how many ar originally inside the machine.
          int count = machine.getCount();
          //get the count
          machine.setCount(++count);
          //increment by one
          return 1;
        }
    return 1;
    }

}
