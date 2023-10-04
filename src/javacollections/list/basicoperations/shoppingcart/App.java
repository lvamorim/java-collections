package javacollections.list.basicoperations.shoppingcart;

public class App {
  public static void main(String[] args) {
    ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.addItem("Apple", 2.99, 5);
    shoppingCart.addItem("Milk", 1.99, 2);
    shoppingCart.addItem("Chicken", 8.49, 1);
    shoppingCart.addItem("Bread", 2.49, 3);
    shoppingCart.addItem("Egg", 3.29, 2);
    shoppingCart.addItem("Pasta", 1.79, 4);
    shoppingCart.removeItem("Pasta");
    shoppingCart.showItems();
    shoppingCart.totalPrice();
  }
}
