package javacollections.map.search.inventoryofproducts;

import java.util.HashMap;
import java.util.Map;

import javacollections.Common;

public class InventoryOfProducts {
  private Map<Long, Product> inventoryOfProducts;
  
  private String toString(Map.Entry<Long, Product> entry) {
    return "Code: " + entry.getKey() + " | Product: " + entry.getValue();
  }

  private String data = "product";

  public InventoryOfProducts() {
    this.inventoryOfProducts = new HashMap<>();

    Common.printAppName("Inventory of " + data + "s");
  }

  public void addProduct(long code, String name, double price, int quantity) {
    Common.printCommonOperationName(1, data);

    try {
      if (code == 0 || name == null || name.isBlank() || price == 0 || quantity == 0) {
        throw new IllegalArgumentException();
      }

      Product product = new Product(name, price, quantity);
      inventoryOfProducts.put(code, product);

      Common.printSuccessfulMessage("Code: " + code + " | " + product);
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
  }

  public void showProducts() {
    Common.printCommonOperationName(4, data);

    try {
      if (inventoryOfProducts.isEmpty()) {
        throw new Exception();
      }

      for (Map.Entry<Long, Product> entry : inventoryOfProducts.entrySet()) {
        System.out.println(toString(entry));
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void calcTotalInventoryPrice() {
    Common.printCustomOperationName("Total price of inventory");

    try {
      if (inventoryOfProducts.isEmpty()) {
        throw new Exception();
      }

      double price = 0;

      for (Product product : inventoryOfProducts.values()) {
        price += product.getPrice() * product.getQuantity();
      }

      System.out.println(String.format("$%.2f", price));
    }
    
    catch (Exception e) {
      Common.printCustomErrorMessage("The inventory is empty.");
    }
  }

  private void getMostExpensiveOrCheapestProduct(Boolean option) {
    Common.printCustomOperationName((option ? "Most expensive" : "Cheapest") + " " + data);

    try {
      if (inventoryOfProducts.isEmpty()) {
        throw new Exception();
      }

      Product foundProduct = null;
      double mostExpensive = Double.MIN_VALUE;
      double cheapest = Double.MAX_VALUE;

      for (Product product : inventoryOfProducts.values()) {
        double price = product. getPrice();

        if (option ? price > mostExpensive : price < cheapest) {
          foundProduct = product;

          if (option) {
            mostExpensive = price;
          }

          cheapest = price;
        }
      }

      for (Map.Entry<Long, Product> entry : inventoryOfProducts.entrySet()) {
        if (entry.getValue() == foundProduct) {
          System.out.println("Code: " + entry.getKey() + " | " + foundProduct);
          break;
        }
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void getMostExpensiveProduct() {
    getMostExpensiveOrCheapestProduct(true);
  }

  public void getCheapestProduct() {
    getMostExpensiveOrCheapestProduct(false);
  }

  public void getProductWithBiggestQuantityByPrice() {
    Common.printCustomOperationName(data + " with biggest quantity by price");

    try {
      if (inventoryOfProducts.isEmpty()) {
        throw new Exception();
      }

      Product foundProduct = null;
      double biggestQuantity = 0;

      for (Map.Entry<Long, Product> entry : inventoryOfProducts.entrySet()) {
        double price = entry.getValue().getPrice() * entry.getValue().getQuantity();

        if (price > biggestQuantity) {
          biggestQuantity = price;
          foundProduct = entry.getValue();
        }
      }

      System.out.println(foundProduct);
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }
}
