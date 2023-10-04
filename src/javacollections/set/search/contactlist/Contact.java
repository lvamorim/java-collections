package javacollections.set.search.contactlist;

import java.util.Objects;

public class Contact {
  private String name;
  private int number;

  public Contact(String name, int number) {
    this.name = name;
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if(!(o instanceof Contact contact)) return false;
    return getName() == contact.getName();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName());
  }

  @Override
  public String toString() {
    return "Name: " + name + " | Number: " + number;
  }
}
