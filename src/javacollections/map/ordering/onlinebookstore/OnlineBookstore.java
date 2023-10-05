package javacollections.map.ordering.onlinebookstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

import javacollections.Common;

public class OnlineBookstore {
  private Map<String, Book> onlineBookstore;

  private String toString(Map.Entry<String, Book> entry) {
    return "Link: " + entry.getKey() + " | " + entry.getValue();
  }

  private String data = "book";

  public OnlineBookstore() {
    this.onlineBookstore = new HashMap<>();
    
    Common.printAppName("Online " + data + "store");
  }

  public void addBook(String link, String title, String author, double price) {
    Common.printCommonOperationName(1, data);

    try {
      if (link == null || link.isBlank() || title == null || title.isBlank() || author == null || author.isBlank() || price == 0) {
        throw new IllegalArgumentException();
      }

      Book book = new Book(title, author, price);
      onlineBookstore.put(link, book);

      for (Map.Entry<String, Book> entry : onlineBookstore.entrySet()) {
        if (entry.getKey() == link) {
          Common.printSuccessfulMessage(toString(entry));
        }
      }
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
  }

  public void removeBook(String title) {
    Common.printCommonOperationName(2, data);

    try {
      if (title == null || title.isBlank()) {
        throw new IllegalArgumentException();
      }

      if (onlineBookstore.isEmpty()) {
        throw new Exception();
      }

      List<Map.Entry<String, Book>> booksToRemove = new ArrayList<>();
      boolean foundBook = false;

      for (Map.Entry<String, Book> entry : onlineBookstore.entrySet()) {
        if (entry.getValue().getTitle().equalsIgnoreCase(title)) {
          booksToRemove.add(entry);
          foundBook = true;
        }
      }

      if (!foundBook) {
        Common.printCommonErrorMessage(2);
        return;
      }

      for (Map.Entry<String,Book> entry : booksToRemove) {
        onlineBookstore.remove(entry.getKey());
        Common.printSuccessfulMessage(toString(entry));
      }
    }

    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void showBooks() {
    Common.printCommonOperationName(4, data);

    try {
      if (onlineBookstore.isEmpty()) {
        throw new Exception();
      }

      for (Map.Entry<String, Book> entry : onlineBookstore.entrySet()) {
        System.out.println(toString(entry));
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void searchBooksByAuthor(String author) {
    boolean invalidAuthor = author == null || author.isBlank();
    Common.printCustomOperationName("Search " + data + "s by author" + (invalidAuthor ? "" : ": " + author));

    try {
      if (invalidAuthor) {
        throw new IllegalArgumentException();
      }

      if (onlineBookstore.isEmpty()) {
        throw new Exception();
      }

      for (Map.Entry<String, Book> entry : onlineBookstore.entrySet()) {
        if (entry.getValue().getAuthor().toLowerCase().startsWith(author.toLowerCase())) {
          System.out.println(toString(entry));
          return;
        }
      }
      
      throw new NoSuchElementException();
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
    
    catch (NoSuchElementException e) {
      Common.printCommonErrorMessage(2);
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  private void showBooksOrderedBy(boolean option) {
    Common.printCustomOperationName("Show " + data + "s ordered by " + (option ? "price" : "author"));

    try {
      if (onlineBookstore.isEmpty()) {
        throw new Exception();
      }

      List<Map.Entry<String, Book>> orderedBooks = new ArrayList<>(onlineBookstore.entrySet());
      Collections.sort(orderedBooks, option ? new ComparatorByPrice() : new ComparatorByAuthor());

      for (Map.Entry<String, Book> entry : orderedBooks) {
        System.out.println(toString(entry));
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void showBooksOrderedByPrice() {
    showBooksOrderedBy(true);
  }

  public void showBooksOrderedByAuthor() {
    showBooksOrderedBy(false);
  }

  private void showMostExpensiveOrCheapestBook(boolean option) {
    Common.printCustomOperationName((option ? "Most expensive" : "Cheapest") + " " + data);

    try {
      if (onlineBookstore.isEmpty()) {
        throw new Exception();
      }
      
      double mostExpensive = Double.MIN_VALUE;
      double cheapest = Double.MAX_VALUE;

      for (Book book : onlineBookstore.values()) {
        double price = book.getPrice();

        if (option ? price > mostExpensive : price < cheapest) {
          if (option) {
            mostExpensive = price;
          }

          cheapest = price;
        }
      }

      for (Map.Entry<String, Book> entry : onlineBookstore.entrySet()) {
        if (entry.getValue().getPrice() == (option ? mostExpensive : cheapest)) {
          System.out.println(toString(entry));
        }
      }
    }

    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void showMostExpensiveBook() {
    showMostExpensiveOrCheapestBook(true);
  }

  public void showCheapestBook() {
    showMostExpensiveOrCheapestBook(false);
  }
}
