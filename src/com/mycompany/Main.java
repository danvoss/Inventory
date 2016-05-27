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
        updateName.quantity = Integer.valueOf(quant);
    }

    public static InventoryItem createItem(String itemName, int quantity, String category) {
        switch (category) {
            case "Fruit":
                return new Fruit(itemName, quantity, category);
            case "Vegetable":
                return new Vegetable(itemName, quantity, category);
            case "Dairy":
                return new Dairy(itemName, quantity, category);
            case "Beef":
                return new Beef(itemName, quantity, category);
            case "Poultry":
                return new Poultry(itemName, quantity, category);
            default:
                System.out.println("Enter a valid category.");
        }
        return null;
    }


    public static void main(String[] args) {

        ArrayList<InventoryItem> inventory = new ArrayList<>();

        while (true) {

            System.out.println("Here is your inventory: ");

            for (InventoryItem item : inventory) {
                System.out.printf("%s.) %s [%s] - %s\n", (inventory.indexOf(item) + 1), item.itemName, item.quantity,
                item.category);
            }

            System.out.println("What would you like to do? Enter a number:");
            System.out.println("1. Enter a new item");
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