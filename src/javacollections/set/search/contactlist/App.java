package javacollections.set.search.contactlist;

public class App {
  public static void main(String[] args) {
    ContactList contactList = new ContactList();
    contactList.addContact("Alice Johnson", 1234567890);
    contactList.addContact("Bob Smith", 987654321);
    contactList.addContact("Charlie Brown", 555123456);
    contactList.addContact("Alice Jackson", 777888999);
    contactList.addContact("David Davis", 111222333);
    contactList.addContact("Eva Gonzalez", 999888777);
    contactList.addContact("Alice White", 888777666);
    contactList.addContact("Frank Wilson", 444555666);
    contactList.addContact("Grace Harris", 666777888);
    contactList.addContact("Alice Davis", 555666777);
    contactList.showContacts();
    contactList.searchContactsByName("Alice");
    contactList.updateContactNumber("Grace Harris", 927654321);
  }
}
