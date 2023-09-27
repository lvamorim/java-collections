package javacollections.list.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import javacollections.Common;

public class ShoppingCart {
  private List<Item> shoppingCart;
  private String data = "item";

  public ShoppingCart() {
    this.shoppingCart = new ArrayList<>();

    Common.appName("Shopping cart");
  }

  public void addItem(String name, double price, int quantity) {
    Item item = new Item(name, price, quantity);

    if (name.isBlank() || price == 0 || quantity == 0) {
      Common.missingDataMessage(data);
    }

    else {
      shoppingCart.add(item);
    }
  }

  public void removeItem(String name) {
    List<Item> itemsToRemove = new ArrayList<>();

    for (Item item : shoppingCart) {
      if (item.getName().equalsIgnoreCase(name)) {
        itemsToRemove.add(item);
      }
    }

    if (itemsToRemove.isEmpty()) {
      Common.notFoundToRemoveMessage(data);
    }
    
    else {
      shoppingCart.removeAll(itemsToRemove);
    }
  }

  public void showItems() {
    Common.operationName("items");

    if (shoppingCart.isEmpty()) {
      Common.emptyDataMessage(data);
    }

    else {
      for (Item item : shoppingCart) {
        System.out.println(item);
      }
    }
  }

  public void totalPrice() {
    int numberOfItems = shoppingCart.size();
    Common.operationName("Total price");

    if (numberOfItems == 0) {
      System.out.println(0);
      Common.emptyDataMessage(data);
    }

    else {
      double totalPrice = 0.0;

      for (Item item : shoppingCart) {
        double totalItemPrice = item.getQuantity() * item.getPrice();

        totalPrice += totalItemPrice;
      }

      System.out.println("$" + totalPrice);
    }
  }
}
