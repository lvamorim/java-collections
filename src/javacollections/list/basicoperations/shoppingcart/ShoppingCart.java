package javacollections.list.basicoperations.shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javacollections.Common;

public class ShoppingCart {
  private List<Item> shoppingCart;
  private String data = "item";

  public ShoppingCart() {
    this.shoppingCart = new ArrayList<>();

    Common.printAppName("Shopping cart");
  }

  public void addItem(String name, double price, int quantity) {
    Common.printCommonOperationName(1, data);

    try {
      if (name == null || name.isBlank() || price == 0 || quantity == 0) {
        throw new IllegalArgumentException();
      }

      Item item = new Item(name, price, quantity);
      shoppingCart.add(item);
      Common.printSuccessfulMessage(item);
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
  }

  public void removeItem(String name) {
    Common.printCommonOperationName(2, data);

    try {
      if (name == null || name.isBlank()) {
        throw new IllegalArgumentException();
      }

      if (shoppingCart.isEmpty()) {
        throw new Exception();
      }

      List<Item> itemsToRemove = new ArrayList<>();

      for (Item item : shoppingCart) {
        if (item.getName().equalsIgnoreCase(name)) {
          itemsToRemove.add(item);
        }
      }

      if (itemsToRemove.isEmpty()) {
        throw new Exception();
      }

      shoppingCart.removeAll(itemsToRemove);

      for (Item item : itemsToRemove) {
        Common.printSuccessfulMessage(item);
      }
    }

    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(2);
    }
  }

  public void showItems() {
    Common.printCommonOperationName(4, data);

    try {
      if (shoppingCart.isEmpty()) {
        throw new Exception();
      }
      
      for (Item item : shoppingCart) {
        System.out.println(item);
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void totalPrice() {
    Common.printCustomOperationName("Total price");

    double totalPrice = 0d;

    for (Item item : shoppingCart) {
      double totalItemPrice = item.getQuantity() * item.getPrice();

      totalPrice += totalItemPrice;
    }

    Locale.setDefault(Locale.US);
    System.out.printf("$%.2f", totalPrice);
  }
}
