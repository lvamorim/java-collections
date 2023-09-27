package javacollections.list.bookcatalog;

import java.util.ArrayList;
import java.util.List;

import javacollections.Common;

public class BookCatalog {
  private List<Book> bookCatalog;
  private String data = "book";

  public BookCatalog() {
    this.bookCatalog = new ArrayList<>();

    Common.appName("Book catalog");
  }

  public void addBook(String title, String author, int publicationYear) {
    Book book = new Book(title, author, publicationYear);

    if (title.isBlank() || author.isBlank() || publicationYear == 0) {
      Common.missingDataMessage(data);
    }

    else {
      bookCatalog.add(book);
    }
  }

  public void removeBook(String title) {
    List<Book> booksToRemove = new ArrayList<>();

    for (Book book : bookCatalog) {
      if (book.getTitle().equalsIgnoreCase(title)) {
        booksToRemove.add(book);
      }
    }

    if (booksToRemove.isEmpty()) {
      Common.notFoundToRemoveMessage(data);
    }

    else {
      bookCatalog.removeAll(booksToRemove);
    }
  }

  public void showBooks() {
    Common.operationName("Books");

    if (bookCatalog.isEmpty()) {
      Common.emptyDataMessage(data);
    }
    
    else {
      for (Book book : bookCatalog) {
        System.out.println(book);
      }
    }
  }

  public List<Book> searchByTitle(String title) {
    List<Book> booksByTitle = new ArrayList<>();
    Common.operationName("Search by title");

    if (bookCatalog.isEmpty()) {
      Common.emptyDataMessage(data);
    }

    else {
      for (Book book : bookCatalog) {
        if (book.getTitle().equalsIgnoreCase(title)) {
          booksByTitle.add(book);
          System.out.println(book);
        }
      }
    }

    return booksByTitle;
  }

  public List<Book> searchByAuthor(String author) {
    List<Book> booksByAuthor = new ArrayList<>();
    Common.operationName("Search by author");

    if (bookCatalog.isEmpty()) {
      Common.emptyDataMessage(data);
    }

    else {
      for (Book book : bookCatalog) {
        if (book.getAuthor().equalsIgnoreCase(author)) {
          booksByAuthor.add(book);
          System.out.println(book);
        }
      }
    }

    return booksByAuthor;
  }

  public List<Book> searchByYearInterval(int initialYear, int finalYear) {
    List<Book> booksByYearInterval = new ArrayList<>();
    Common.operationName("Search by year interval");

    if (bookCatalog.isEmpty()) {
      Common.emptyDataMessage(data);
    }

    else {
      for (Book book : bookCatalog) {
        if (book.getPublicationYear() >= initialYear && book.getPublicationYear() <= finalYear) {
          booksByYearInterval.add(book);
          System.out.println(book);
        }
      }
    }

    return booksByYearInterval;
  }
}
