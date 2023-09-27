package javacollections.list.orderingofnumbers;

public class App {
  public static void main(String[] args) {
    OrderingOfNumbers orderingOfNumbers = new OrderingOfNumbers();
    orderingOfNumbers.addNumber(88);
    orderingOfNumbers.addNumber(25);
    orderingOfNumbers.addNumber(53);
    orderingOfNumbers.addNumber(72);
    orderingOfNumbers.addNumber(9);
    orderingOfNumbers.addNumber(61);
    orderingOfNumbers.addNumber(44);
    orderingOfNumbers.addNumber(13);
    orderingOfNumbers.addNumber(78);
    orderingOfNumbers.addNumber(35);
    orderingOfNumbers.showNumbers();
    orderingOfNumbers.ascendingOrder();
    orderingOfNumbers.descendingOrder();
  }
}
