package com.agniadvani;

public class Main {

    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        groceryList.printList();
        groceryList.addItem("Sugar");
        groceryList.addItem("Milk");
        groceryList.addItem("Honey");
        groceryList.addItem("Chicken");
        groceryList.printList();
        groceryList.replaceItem(3, "Stevia");
        groceryList.printList();
        groceryList.removeItem(2);
        groceryList.printList();
        groceryList.findItem("sugar");
        groceryList.findItem("chicken");
        groceryList.findItem("flour");
    }
}
