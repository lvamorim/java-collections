package javacollections.list.orderingofnumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javacollections.Common;

public class OrderingOfNumbers {
  private List<Number> orderingOfNumbers;
  private String data = "number";

  public OrderingOfNumbers() {
    this.orderingOfNumbers = new ArrayList<>();
    Common.appName("Ordering of numbers");
  }

  public void addNumber(int number) {
    Number newNumber = new Number(number);

    if (number == 0) {
      Common.noZeroAcceptedMessage();
    }

    else {
      orderingOfNumbers.add(newNumber);
    }
  }

  public void showNumbers() {
    Common.operationName("Numbers list");

    if (orderingOfNumbers.isEmpty()) {
      Common.emptyDataMessage(data);
    }

    else {
      for (Number number : orderingOfNumbers) {
        System.out.println(number.getNumber());
      }
    }
  }

  public void ascendingOrder() {
    Common.operationName("Ascending order");

    if (orderingOfNumbers.isEmpty()) {
      Common.emptyDataMessage(data);
    }

    else {
      Collections.sort(orderingOfNumbers, new NumberComparator());
      
      for (Number number : orderingOfNumbers) {
        System.out.println(number.getNumber());
      }
    }
  }

  public void descendingOrder() {
    Common.operationName("Descending order");

    if (orderingOfNumbers.isEmpty()) {
      Common.emptyDataMessage(data);
    }

    else {
      Collections.reverse(orderingOfNumbers);
      
      for (Number number : orderingOfNumbers) {
        System.out.println(number.getNumber());
      }
    }
  }
}
