package com.mycompany;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<InventoryItem> inventory = new ArrayList<>();

        while (true) {

            System.out.println("Here is your inventory: ");

            for (InventoryItem item : inventory) {
                System.out.println(item);
            }

            System.out.println("What would you like to do?:");
            System.out.println("1. Create a new item");
            System.out.println("2. Remove an item");
            System.out.println("3. Update item quantity");


        }
    }
}
