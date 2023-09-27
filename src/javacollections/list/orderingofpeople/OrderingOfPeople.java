package javacollections.list.orderingofpeople;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javacollections.Common;

public class OrderingOfPeople {
  private List<Person> orderingOfPeople;
  private String data = "people";

  public OrderingOfPeople() {
    this.orderingOfPeople = new ArrayList<>();

    Common.appName("Ordering of people");
  }

  public void addPerson(String name, int age, double height) {
    Person person = new Person(name, age, height);

    if (name.isBlank() || age == 0 || height == 0) {
      Common.missingDataMessage("person");
    }

    else {
      orderingOfPeople.add(person);
    }
  }

  public void showPeople() {
    if (orderingOfPeople.isEmpty()) {
      Common.emptyDataMessage(data);
    }

    else {
      Common.operationName("Show people");

      for (Person person : orderingOfPeople) {
        System.out.println(person);
      }
    }
  }

  public List<Person> orderByAge() {
    List<Person> orderByAge = new ArrayList<>(orderingOfPeople);

    if (orderingOfPeople.isEmpty()) {
      Common.emptyDataMessage(data);
    }

    else {
      Common.operationName("Order by age");
      
      Collections.sort(orderByAge);

      for (Person person : orderByAge) {
        System.out.println(person);
      }
    }

    return orderByAge;
  }

  public List<Person> orderByHeight() {
    List<Person> orderByHeight = new ArrayList<>(orderingOfPeople);

    if (orderingOfPeople.isEmpty()) {
      Common.emptyDataMessage(data);
    }

    else {
      Common.operationName("Order by height");

      Collections.sort(orderByHeight, new ComparatorByHeight());

      for (Person person : orderByHeight) {
        System.out.println(person);
      }
    }
    
    return orderByHeight;
  }
}
