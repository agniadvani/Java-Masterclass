package com.agniadvani;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item) {
        groceryList.add(item);
        System.out.println("Item " + item + " added to the list.");
    }

    public void printList() {
        System.out.println("Grocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void replaceItem(int position, String item) {
        String theItem = groceryList.get(position - 1);
        groceryList.set(position - 1, item);
        System.out.println(theItem + " replaced with " + item);
    }
}
