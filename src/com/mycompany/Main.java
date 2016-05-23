package com.mycompany;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<InventoryItem> inventory = new ArrayList<>();

        InventoryItem item1 = new InventoryItem("apple", 10);
        inventory.add(item1);
        InventoryItem item2 = new InventoryItem("banana", 5);
        inventory.add(item2);

        while (true) {

            System.out.println("Here is your inventory: ");

            System.out.println("What would you like to do?:");
            System.out.println("1. Create a new item");
            System.out.println("2. Remove an item");
            System.out.println("3. Update item quantity");

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    //
                    break;
                case "2":
                    //
                    break;
                case "3":
                    //
                    break;
                default:
                    System.out.println("Invalid option.");
            }




        }
    }
}