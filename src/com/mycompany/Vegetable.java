package com.mycompany;

/**
 * Created by Dan on 5/24/16.
 */
public class Vegetable extends InventoryItem {
    public Vegetable(String itemName, int quantity, String category) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.category = "Vegetable";
    }
}
