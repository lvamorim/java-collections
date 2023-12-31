package javacollections.map.search.inventoryofproducts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javacollections.Common;

public class InventoryOfProducts {
  private Map<Long, Product> inventoryOfProducts;
  
  private String toString(Map.Entry<Long, Product> entry) {
    return "Code: " + entry.getKey() + " | " + entry.getValue();
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

  private void getMostExpensiveOrCheapestProducts(Boolean option) {
    Common.printCustomOperationName((option ? "Most expensive" : "Cheapest") + " " + data + "(s)");

    try {
      if (inventoryOfProducts.isEmpty()) {
        throw new Exception();
      }

      double mostExpensive = Double.MIN_VALUE;
      double cheapest = Double.MAX_VALUE;

      for (Product product : inventoryOfProducts.values()) {
        double price = product.getPrice();

        if (option ? price > mostExpensive : price < cheapest) {
          if (option) {
            mostExpensive = price;
          }

          cheapest = price;
        }
      }

      for (Map.Entry<Long, Product> entry : inventoryOfProducts.entrySet()) {
        if (entry.getValue().getPrice() == (option ? mostExpensive : cheapest)) {
          System.out.println(toString(entry));
        }
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void getMostExpensiveProduct() {
    getMostExpensiveOrCheapestProducts(true);
  }

  public void getCheapestProduct() {
    getMostExpensiveOrCheapestProducts(false);
  }

  public void getProductWithBiggestQuantityByPrice() {
    Common.printCustomOperationName(data + "(s) with biggest quantity by price");

    try {
      if (inventoryOfProducts.isEmpty()) {
        throw new Exception();
      }

      List<Map.Entry<Long, Product>> productsWithBiggestPrice = new ArrayList<>();
      double biggestPrice = 0;

      for (Map.Entry<Long, Product> entry : inventoryOfProducts.entrySet()) {
        double price = entry.getValue().getPrice() * entry.getValue().getQuantity();

        if (price > biggestPrice) {
          biggestPrice = price;
          productsWithBiggestPrice.clear();
          productsWithBiggestPrice.add(entry);
        }
        
        else if (price == biggestPrice) {
          productsWithBiggestPrice.add(entry);
        }
      }

      for (Map.Entry<Long, Product> entry : productsWithBiggestPrice) {
        System.out.println(toString(entry));
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }
}
