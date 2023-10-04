package javacollections.set.ordering.productregistration;

public class App {
  public static void main(String[] args) {
    ProductRegistration productRegistration = new ProductRegistration();
    productRegistration.addProduct(14646, "pasta", 48.5, 2);
    productRegistration.addProduct(15646, "apple", 9.5, 21);
    productRegistration.addProduct(15746, "banana", 3.2, 2);
    productRegistration.addProduct(15446, "pear", 8.5, 23);
    productRegistration.showProductsByName();
    productRegistration.showProductsByPrice();
  }
}
