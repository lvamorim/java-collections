package javacollections.map.search.inventoryofproducts;

public class App {
  public static void main(String[] args) {
    InventoryOfProducts inventoryOfProducts = new InventoryOfProducts();
    inventoryOfProducts.addProduct(001, "Electronics", 799.99, 20);
    inventoryOfProducts.addProduct(002, "Smartphone", 999.00, 30);
    inventoryOfProducts.addProduct(003, "Athletic Shoes", 129.99, 50);
    inventoryOfProducts.addProduct(004, "Smart TV", 699.99, 10);
    inventoryOfProducts.addProduct(005, "Wristwatch", 149.95, 15);
    inventoryOfProducts.showProducts();
    inventoryOfProducts.calcTotalInventoryPrice();
    inventoryOfProducts.getMostExpensiveProduct();
    inventoryOfProducts.getCheapestProduct();
    inventoryOfProducts.getProductWithBiggestQuantityByPrice();
  }
}
