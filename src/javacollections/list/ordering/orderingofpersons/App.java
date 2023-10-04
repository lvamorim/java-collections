package javacollections.list.ordering.orderingofpersons;

public class App {
  public static void main(String[] args) {
    OrderingOfPersons orderingOfPersons = new OrderingOfPersons();
    orderingOfPersons.addPerson("Sophia", 29, 1.65);
    orderingOfPersons.addPerson("Liam", 25, 1.80);
    orderingOfPersons.addPerson("Olivia", 32, 1.68);
    orderingOfPersons.addPerson("Noah", 28, 1.75);
    orderingOfPersons.addPerson("Ava", 27, 1.62);
    orderingOfPersons.addPerson("Jackson", 30, 1.85);
    orderingOfPersons.addPerson("Mia", 26, 1.70);
    orderingOfPersons.addPerson("Ethan", 33, 1.78);
    orderingOfPersons.addPerson("Isabella", 31, 1.67);
    orderingOfPersons.addPerson("William", 24, 1.88);
    orderingOfPersons.showPersons();
    orderingOfPersons.orderByAge();
    orderingOfPersons.orderByHeight();
  }
}
