package javacollections.list.ordering.orderingofnumbers;

import java.util.Comparator;

public class Number implements Comparable<Number> {
  private int number;

  public Number(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  @Override
  public int compareTo(Number number) {
    return Integer.compare(this.number, number.number);
  }
}

class NumberComparator implements Comparator<Number> {
  @Override
  public int compare(Number number1, Number number2) {
    return Integer.compare(number1.getNumber(), number2.getNumber());
  }
}
