package com.mycompany;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

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

            System.out.println("What would you like to do?:");
            System.out.println("1. Create a new item");
            System.out.println("2. Remove an item");
            System.out.println("3. Update item quantity");

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Enter the name of the new item.");
                    String newName = scanner.nextLine();
                    InventoryItem newItem = new InventoryItem(newName, 1);
                    inventory.add(newItem);
                    break;
                case "2":
                    System.out.println("Enter the index number of the item to be removed.");
                    String remove = scanner.nextLine();
                    int removeInt = Integer.valueOf(remove);
                    inventory.remove(removeInt - 1);
                    break;
                case "3":
                    System.out.println("Enter the index number of the item to be updated.");
                    String update = scanner.nextLine();
                    int updateInt = Integer.valueOf(update);
                    System.out.println("Enter the new quantity.");
                    String quant = scanner.nextLine();
                    InventoryItem updateName = inventory.get(updateInt - 1);
                    updateName.setQuantity(Integer.valueOf(quant));
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        }
    }
}