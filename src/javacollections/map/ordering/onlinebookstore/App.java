package javacollections.map.ordering.onlinebookstore;

public class App {
  public static void main(String[] args) {
    OnlineBookstore onlineBookstore = new OnlineBookstore();
    onlineBookstore.addBook("https://link.com/book1", "Echoes", "Emily Davis", 14.99);
    onlineBookstore.addBook("https://link.com/book2", "Whispers", "Michael Johnson", 9.95);
    onlineBookstore.addBook("https://link.com/book3", "Wanderlust", "Sophia Roberts", 12.99);
    onlineBookstore.addBook("https://link.com/book4", "Echoes", "Daniel White", 8.75);
    onlineBookstore.addBook("https://link.com/book5", "Journey", "Olivia Smith", 19.99);
    onlineBookstore.addBook("https://link.com/book6", "Mysteries", "David Miller", 6.50);
    onlineBookstore.removeBook("Whispers");
    onlineBookstore.showBooks();
    onlineBookstore.searchBooksByAuthor("David");
    onlineBookstore.showBooksOrderedByPrice();
    onlineBookstore.showBooksOrderedByAuthor();
    onlineBookstore.showMostExpensiveBook();
    onlineBookstore.showCheapestBook();
  }
}
