package javacollections.set.search.contactlist;

import java.util.Set;

import javacollections.Common;

import java.util.HashSet;

public class ContactList {
  private Set<Contact> contactList;
  private String data = "contact";

  public ContactList() {
    this.contactList = new HashSet<>();

    Common.printAppName("Contact list");
  }

  public void addContact(String name, int number) {
    Common.printCommonOperationName(1, data);

    try {
      if (name == null || name.isBlank() || number == 0) {
        throw new IllegalArgumentException();
      }

      Contact contact = new Contact(name, number);
      contactList.add(contact);
      Common.printSuccessfulMessage(contact);
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
  }

  public void showContacts() {
    Common.printCommonOperationName(4, data);
    try {
      if (contactList.isEmpty()) {
        throw new Exception();
      }

      for (Contact contact : contactList) {
        System.out.println(contact);
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void searchContactsByName(String name) {
    Common.printCustomOperationName("Search " + data + "s by name");

    try {
      if (name == null || name.isBlank()) {
        throw new IllegalArgumentException();
      }

      if (contactList.isEmpty()) {
        throw new Exception();
      }

      boolean foundContact = false;
  
      for (Contact contact : contactList) {
        if (contact.getName().toLowerCase().startsWith(name.toLowerCase())) {
          System.out.println(contact);
          foundContact = true;
        }
      }
  
      if (!foundContact) {
        throw new Exception();
      }
    }

    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void updateContactNumber(String name, int newNumber) {
    Common.printCommonOperationName(3, data + " number");

    try {
      if (name == null || name.isBlank() || newNumber == 0) {
        throw new IllegalArgumentException();
      }

      boolean updatedContact = false;
  
      for (Contact contact : contactList) {
        if (contact.getName().equalsIgnoreCase(name)) {
          contact.setNumber(newNumber);
          updatedContact = true;
          Common.printSuccessfulMessage(contact);
        }
      }
  
      if (!updatedContact) {
        throw new Exception();
      }
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }

    catch (Exception e) {
      Common.printCommonErrorMessage(2);
    }
  }
}
