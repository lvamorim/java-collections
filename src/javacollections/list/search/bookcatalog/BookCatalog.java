package javacollections.list.search.bookcatalog;

import java.util.ArrayList;
import java.util.List;

import javacollections.Common;

public class BookCatalog {
  private List<Book> bookCatalog;
  private String data = "book";

  public BookCatalog() {
    this.bookCatalog = new ArrayList<>();

    Common.printAppName("Book catalog");
  }

  public void addBook(String title, String author, int publicationYear) {
    Common.printCommonOperationName(1, data);

    try {
      if (title == null || title.isBlank() || author == null || author.isBlank() || publicationYear == 0) {
        throw new IllegalArgumentException();
      }
      
      Book book = new Book(title, author, publicationYear);
      bookCatalog.add(book);
      Common.printSuccessfulMessage(book);
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
  }

  public void removeBook(String title) {
    Common.printCommonOperationName(2, data);
    List<Book> booksToRemove = new ArrayList<>();

    try {
      if (title == null || title.isBlank()) {
        throw new IllegalArgumentException();
      }
      
      for (Book book : bookCatalog) {
        if (book.getTitle().equalsIgnoreCase(title)) {
          booksToRemove.add(book);
        }
      }

      if (booksToRemove.isEmpty()) {
        throw new Exception();
      }

      else {
        bookCatalog.removeAll(booksToRemove);
        Common.printSuccessfulMessage(booksToRemove);
      }
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }

    catch (Exception e) {
      Common.printCommonErrorMessage(2);
    }
  }

  public void showBooks() {
    Common.printCommonOperationName(4, data);

    try {
      if (bookCatalog.isEmpty()) {
        throw new Exception();
      }

      for (Book book : bookCatalog) {
        System.out.println(book);
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void searchByTitle(String title) {
    Common.printCustomOperationName("Search by title: " + title);
    List<Book> booksByTitle = new ArrayList<>();

    try {
      if (title.isBlank()) {
        throw new IllegalArgumentException();
      }
      
      for (Book book : bookCatalog) {
        if (book.getTitle().equalsIgnoreCase(title)) {
          booksByTitle.add(book);
        }
      }

      if (booksByTitle.isEmpty()) {
        throw new Exception();
      }

      else {
        for (Book book : booksByTitle) {
          System.out.println(book);
        }
      }
    }

    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void searchByAuthor(String author) {
    Common.printCustomOperationName("Search by author: " + author);
    List<Book> booksByAuthor = new ArrayList<>();

    try {
      if (author.isBlank()) {
        throw new IllegalArgumentException();
      }

      for (Book book : bookCatalog) {
        if (book.getAuthor().equalsIgnoreCase(author)) {
          booksByAuthor.add(book);
        }
      }

      if (booksByAuthor.isEmpty()) {
        throw new Exception();
      }

      else {
        for (Book book : booksByAuthor) {
          System.out.println(book);
        }
      }
    }

    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public List<Book> searchByYearInterval(int initialYear, int finalYear) {
    Common.printCustomOperationName("Search by year interval: " + initialYear + "-" + finalYear);
    List<Book> booksByYearInterval = new ArrayList<>();

    try {
      if (initialYear == 0 || finalYear == 0) {
        throw new IllegalArgumentException();
      }
      
      for (Book book : bookCatalog) {
        if (book.getPublicationYear() >= initialYear && book.getPublicationYear() <= finalYear) {
          booksByYearInterval.add(book);
        }
      }

      if (booksByYearInterval.isEmpty()) {
        throw new Exception();
      }

      else {
        for (Book book : booksByYearInterval) {
          System.out.println(book);
        }
      }
    }

    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(3);
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }

    return booksByYearInterval;
  }
}
