package javacollections.map.ordering.onlinebookstore;

import java.util.Comparator;
import java.util.Locale;
import java.util.Map;

public class Book {
  private String title;
  private String author;
  private double price;

  public Book(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    Locale.setDefault(Locale.US);
    
    return "Title: " + title + " | Author: " + author + " | Price: " + String.format("$%.2f", price);
  }
}

class ComparatorByPrice implements Comparator<Map.Entry<String, Book>> {
  @Override
  public int compare(Map.Entry<String, Book> book1, Map.Entry<String, Book> book2) {
    return Double.compare(book1.getValue().getPrice(), book2.getValue().getPrice());
  }
}

class ComparatorByAuthor implements Comparator<Map.Entry<String, Book>> {
  @Override
  public int compare(Map.Entry<String, Book> book1, Map.Entry<String, Book> book2) {
    return book1.getValue().getAuthor().compareToIgnoreCase(book2.getValue().getAuthor());
  }
}
