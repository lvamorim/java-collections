package javacollections.list.sumnumbers;

import java.util.ArrayList;
import java.util.List;

import javacollections.Common;

public class SumNumbers {
  private List<Number> sumNumbers;
  private String data = "number";

  public SumNumbers() {
    this.sumNumbers = new ArrayList<>();
    Common.appName("Sum numbers");
  }

  public void addNumber(int number) {
    Number newNumber = new Number(number);

    if (number == 0) {
      Common.noZeroAcceptedMessage();
    }

    else {
      sumNumbers.add(newNumber);
    }
  }

  public void showNumbers() {
    Common.operationName("Numbers list");
    
    if (sumNumbers.isEmpty()) {
      Common.emptyDataMessage(data);
    }
    
    else {
      for (Number number : sumNumbers) {
        System.out.println(number.getNumber());
      }
    }
  }

  public void calcSum() {
    Common.operationName("Sum of numbers");

    if (sumNumbers.isEmpty()) {
      Common.emptyDataMessage(data);
    }

    else {
      int total = 0;

      for (Number number : sumNumbers) {
        total += number.getNumber();
      }

      System.out.println(total);
    }
  }

  public void findHighestNumber() {
    Common.operationName("Highest number");

    if (sumNumbers.isEmpty()) {
      Common.emptyDataMessage(data);
    }

    else {
      int highestNumber = Integer.MIN_VALUE;

      for (Number number : sumNumbers) {
        int currentNumber = number.getNumber();

        if (currentNumber > highestNumber) {
          highestNumber = currentNumber;
        }
      }

      System.out.println(highestNumber);
    }
  }

  public void findLeastNumber() {
    Common.operationName("Least number");

    if (sumNumbers.isEmpty()) {
      Common.emptyDataMessage(data);
    }

    else {
      int leastNumber = Integer.MAX_VALUE;

      for (Number number : sumNumbers) {
        int currentNumber = number.getNumber();

        if (currentNumber < leastNumber) {
          leastNumber = currentNumber;
        }
      }

      System.out.println(leastNumber);
    }
  }
}
