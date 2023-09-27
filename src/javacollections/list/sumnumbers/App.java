package javacollections.list.sumnumbers;

public class App {
  public static void main(String[] args) {
    SumNumbers sumNumbers = new SumNumbers();
    sumNumbers.addNumber(42);
    sumNumbers.addNumber(18);
    sumNumbers.addNumber(7);
    sumNumbers.addNumber(56);
    sumNumbers.addNumber(32);
    sumNumbers.addNumber(10);
    sumNumbers.addNumber(23);
    sumNumbers.addNumber(14);
    sumNumbers.addNumber(67);
    sumNumbers.addNumber(39);
    sumNumbers.showNumbers();
    sumNumbers.calcSum();
    sumNumbers.findHighestNumber();
    sumNumbers.findLeastNumber();
  }
}
