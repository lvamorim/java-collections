package javacollections.list.orderingofpeople;

public class App {
  public static void main(String[] args) {
    OrderingOfPeople orderingOfPeople = new OrderingOfPeople();
    orderingOfPeople.addPerson("Sophia", 29, 1.65);
    orderingOfPeople.addPerson("Liam", 25, 1.80);
    orderingOfPeople.addPerson("Olivia", 32, 1.68);
    orderingOfPeople.addPerson("Noah", 28, 1.75);
    orderingOfPeople.addPerson("Ava", 27, 1.62);
    orderingOfPeople.addPerson("Jackson", 30, 1.85);
    orderingOfPeople.addPerson("Mia", 26, 1.70);
    orderingOfPeople.addPerson("Ethan", 33, 1.78);
    orderingOfPeople.addPerson("Isabella", 31, 1.67);
    orderingOfPeople.addPerson("William", 24, 1.88);
    orderingOfPeople.showPeople();
    orderingOfPeople.orderByAge();
    orderingOfPeople.orderByHeight();
  }
}
