package javacollections.list.ordering.orderingofpersons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javacollections.Common;

public class OrderingOfPersons {
  private List<Person> orderingOfPersons;
  private String data = "person";

  public OrderingOfPersons() {
    this.orderingOfPersons = new ArrayList<>();

    Common.printAppName("Ordering of persons");
  }

  public void addPerson(String name, int age, double height) {
    Common.printCommonOperationName(1, data);
    
    try {
      if (name == null || name.isBlank() || age == 0 || height == 0) {
        throw new IllegalArgumentException();
      }

      Person person = new Person(name, age, height);
      orderingOfPersons.add(person);
      Common.printSuccessfulMessage(person);
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
  }

  public void showPersons() {
    Common.printCommonOperationName(4, data);

    try {
      if (orderingOfPersons.isEmpty()) {
        throw new Exception();
      }

      for (Person person : orderingOfPersons) {
        System.out.println(person);
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void orderByAge() {
    Common.printCustomOperationName("Order by age");

    try {
      if (orderingOfPersons.isEmpty()) {
        throw new Exception();
      }
      
      List<Person> orderByAge = new ArrayList<>(orderingOfPersons);
      Collections.sort(orderByAge);

      for (Person person : orderByAge) {
        System.out.println(person);
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void orderByHeight() {
    Common.printCustomOperationName("Order by height");

    try {
      if (orderingOfPersons.isEmpty()) {
        throw new Exception();
      }
      
      List<Person> orderByHeight = new ArrayList<>(orderingOfPersons);
      Collections.sort(orderByHeight, new ComparatorByHeight());

      for (Person person : orderByHeight) {
        System.out.println(person);
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }
}
