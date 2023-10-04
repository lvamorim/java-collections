package javacollections.list.ordering.orderingofnumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javacollections.Common;

public class OrderingOfNumbers {
  private List<Number> orderingOfNumbers;
  private String data = "number";

  public OrderingOfNumbers() {
    this.orderingOfNumbers = new ArrayList<>();

    Common.printAppName("Ordering of numbers");
  }

  public void addNumber(int number) {
    Common.printCommonOperationName(1, data);

    Number newNumber = new Number(number);
    orderingOfNumbers.add(newNumber);
    Common.printSuccessfulMessage(number);
  }

  public void showNumbers() {
    Common.printCommonOperationName(4, data);

    try {
      if (orderingOfNumbers.isEmpty()) {
        throw new Exception();
      }

      for (Number number : orderingOfNumbers) {
        System.out.println(number.getNumber());
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  private void orderBy(boolean order) {
    Common.printCustomOperationName(order ? "Ascending" : "Descending" + " order");

    try {
      if (orderingOfNumbers.isEmpty()) {
        throw new Exception();
      }

      if (order) {
        Collections.sort(orderingOfNumbers, new NumberComparator());
      } else {
        Collections.sort(orderingOfNumbers, Collections.reverseOrder(new NumberComparator()));
      }
      
      for (Number number : orderingOfNumbers) {
        System.out.println(number.getNumber());
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void ascendingOrder() {
    orderBy(true);
  }

  public void descendingOrder() {
    orderBy(false);
  }
}
