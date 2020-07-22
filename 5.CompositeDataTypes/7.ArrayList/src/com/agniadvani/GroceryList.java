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
        if (groceryList.size() <=0){
            System.out.println("You have 0 items on your grocery list.");
        }
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void replaceItem(int position, String item) {
        String theItem = groceryList.get(position - 1);
        groceryList.set(position - 1, item);
        System.out.println(theItem + " replaced with " + item);
    }

    public void removeItem(int position) {
        String theItem = groceryList.get(position - 1);
        groceryList.remove(position - 1);
        System.out.println(theItem + " was removed from the list.");
    }

    public void findItem(String item) {
        for (int i = 0; i < groceryList.size(); i++) {
            if (item.toLowerCase().equals(groceryList.get(i).toLowerCase())) {
                System.out.println("The item is on number " + (i + 1) + " on the list.");
                return;
            }
        }
        System.out.println("The item is not available on the list.");
    }
}
