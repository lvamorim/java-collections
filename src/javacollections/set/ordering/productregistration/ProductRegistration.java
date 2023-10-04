package javacollections.set.ordering.productregistration;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javacollections.Common;

public class ProductRegistration {
  private Set<Product> productRegistration;
  private String data = "product";

  public ProductRegistration() {
    this.productRegistration = new HashSet<>();

    Common.printAppName("Product registration");
  }

  public void addProduct(long code, String name, double price, int quantity) {
    Common.printCommonOperationName(1, data);

    try {
      if (code == 0 || name == null || name.isBlank() || price == 0 || quantity == 0) {
        throw new IllegalArgumentException();
      }

      Product product = new Product(code, name, price, quantity);
      productRegistration.add(product);
      Common.printSuccessfulMessage(product);
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
  }

  private void showProductsBy(String method) {
    Common.printCustomOperationName("Show " + data + "s by " + method);

    try {
      if (productRegistration.isEmpty()) {
        throw new Exception();
      }

      switch (method) {
        case "name":
          Set<Product> productsByName = new TreeSet<>(productRegistration);

          for (Product product : productsByName) {
            System.out.println(product);
          }
          break;
        
        case "price":
          Set <Product> productsByPrice = new TreeSet<>(new ComparatorByPrice());
          productsByPrice.addAll(productRegistration);

          for (Product product : productsByPrice) {
            System.out.println(product);
          }
          break;
        
        default:
          break;
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void showProductsByName() {
    showProductsBy("name");
  }

  public void showProductsByPrice() {
    showProductsBy("price");
  }
}
