package com.mycompany;

/**
 * Created by Dan on 5/24/16.
 */
public class Fruit extends InventoryItem {
    public Fruit(String itemName, int quantity, String category) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.category = "Fruit";
    }
}
