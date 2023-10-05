package javacollections.map.basicoperations.contactlist;

public class App {
  public static void main(String[] args) {
    ContactList contactList = new ContactList();
    contactList.addContact("Amalia", 84651561);
    contactList.addContact("Esther", 464616468);
    contactList.addContact("Sonia", 775454515);
    contactList.removeContact("Sonia");
    contactList.showContacts();
    contactList.searchByName("Amalia");
  }
}
