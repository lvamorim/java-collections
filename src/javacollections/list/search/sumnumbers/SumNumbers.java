package javacollections.list.search.sumnumbers;

import java.util.ArrayList;
import java.util.List;

import javacollections.Common;

public class SumNumbers {
  private List<Number> sumNumbers;
  private String data = "number";

  public SumNumbers() {
    this.sumNumbers = new ArrayList<>();

    Common.printAppName("Sum numbers");
  }

  public void addNumber(int number) {
    Common.printCommonOperationName(1, data);

    Number newNumber = new Number(number);

    sumNumbers.add(newNumber);
    Common.printSuccessfulMessage(number);
  }

  public void showNumbers() {
    Common.printCommonOperationName(4, data);

    try {
      if (sumNumbers.isEmpty()) {
        throw new Exception();
      }

      for (Number number : sumNumbers) {
        System.out.println(number.getNumber());
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void calcSum() {
    Common.printCustomOperationName("Sum of numbers");
    
    int total = 0;

    for (Number number : sumNumbers) {
      total += number.getNumber();
    }

    System.out.println("Total: " + total);
  }

  public void findHighestNumber() {
    Common.printCustomOperationName("Highest number");

    try {
      if (sumNumbers.isEmpty()) {
        throw new Exception();
      }
      
      int highestNumber = Integer.MIN_VALUE;

      for (Number number : sumNumbers) {
        int currentNumber = number.getNumber();

        if (currentNumber > highestNumber) {
          highestNumber = currentNumber;
        }
      }

      System.out.println(highestNumber);
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void findLeastNumber() {
    Common.printCustomOperationName("Least number");

    try {
      if (sumNumbers.isEmpty()) {
        throw new Exception();
      }
      
      int leastNumber = Integer.MAX_VALUE;

      for (Number number : sumNumbers) {
        int currentNumber = number.getNumber();

        if (currentNumber < leastNumber) {
          leastNumber = currentNumber;
        }
      }

      System.out.println(leastNumber);
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }
}
