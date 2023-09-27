package javacollections.list.bookcatalog;

public class App {
  public static void main(String[] args) {
    BookCatalog bookCatalog = new BookCatalog();
    bookCatalog.addBook("Miau miau book", "The cat", 2020);
    bookCatalog.addBook("My life", "The cat", 2021);
    bookCatalog.addBook("Woof woof book", "The dog", 2022);
    bookCatalog.addBook("My life", "The dog", 2023);
    bookCatalog.addBook("Oink Oink book", "The pig", 2023);
    bookCatalog.removeBook("Oink Oink book");
    bookCatalog.showBooks();
    bookCatalog.searchByAuthor("The cat");
    bookCatalog.searchByTitle("My life");
    bookCatalog.searchByYearInterval(2022, 2023);
  }
}
