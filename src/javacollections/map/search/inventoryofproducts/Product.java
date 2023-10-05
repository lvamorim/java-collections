package javacollections.map.search.inventoryofproducts;

import java.util.Locale;

public class Product {
  private String name;
  double price;
  int quantity;

  public Product(String name, double price, int quantity) {
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
