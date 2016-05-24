package com.mycompany;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void enterNew (Scanner scanner, ArrayList<InventoryItem> inventory) {
        System.out.println("Enter the name of the new item.");
        String newName = scanner.nextLine();
        InventoryItem newItem = new InventoryItem(newName, 1);
        inventory.add(newItem);
    }

    public static void removeItem (Scanner scanner, ArrayList<InventoryItem> inventory) {
        System.out.println("Enter the number of the item to be removed.");
        String remove = scanner.nextLine();
        int removeInt = Integer.valueOf(remove);
        inventory.remove(removeInt - 1);
    }

    public static void updateQuantity (Scanner scanner, ArrayList<InventoryItem> inventory) {
        System.out.println("Enter the number of the item to be updated.");
        String update = scanner.nextLine();
        int updateInt = Integer.valueOf(update);
        System.out.println("Enter the new quantity.");
        String quant = scanner.nextLine();
        InventoryItem updateName = inventory.get(updateInt - 1);
        updateName.setQuantity(Integer.valueOf(quant));
    }


    public static void main(String[] args) {

        ArrayList<InventoryItem> inventory = new ArrayList<>();

        InventoryItem item1 = new InventoryItem("apples", 10);
        inventory.add(item1);
        InventoryItem item2 = new InventoryItem("bananas", 5);
        inventory.add(item2);

        while (true) {

            System.out.println("Here is your inventory: ");

            for (InventoryItem item : inventory) {
                System.out.println((inventory.indexOf(item) + 1) + ".) " + item.itemName + " " + "[" +
                        item.quantity + "]");
            }

            System.out.println("What would you like to do? Enter a number:");
            System.out.println("1. Create a new item");
            System.out.println("2. Remove an item");
            System.out.println("3. Update item quantity");

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    enterNew(scanner, inventory);
                    break;
                case "2":
                    removeItem(scanner, inventory);
                    break;
                case "3":
                    updateQuantity(scanner, inventory);
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        }
    }
}