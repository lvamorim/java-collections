package javacollections.list.basicoperations.shoppingcart;

import java.util.Locale;

public class Item {
  private String name;
  private double price;
  private int quantity;

  public Item(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  @Override
  public String toString() {
    Locale.setDefault(Locale.US);
    
    return "Name: " + name + " | Price: " + String.format("$%.2f", price) + " | Quantity: " + quantity;
  }
}
