package javacollections.map.basicoperations.contactlist;

import java.util.HashMap;
import java.util.Map;

import javacollections.Common;

public class ContactList {
  private Map<String, Integer> contactList;
  
  private String toString(Map.Entry<String, Integer> entry) {
    return "Name: " + entry.getKey() + " | Number: " + entry.getValue();
  }
  
  private String data = "contact";

  public ContactList() {
    this.contactList = new HashMap<>();
    
    Common.printAppName(data + " list");
  }

  public void addContact(String name, Integer number) {
    Common.printCommonOperationName(1, data);

    try {
      if (name == null || name.isBlank() || number == null) {
        throw new IllegalArgumentException();
      }

      contactList.put(name, number);

      for (Map.Entry<String, Integer> entry : contactList.entrySet()) {
        if (entry.getKey() == name) {
          Common.printSuccessfulMessage(toString(entry));
        }
      }
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
  }

  public void removeContact(String name) {
    Common.printCommonOperationName(2, data);

    try {
      if (name == null || name.isBlank()) {
        throw new IllegalArgumentException();
      }

      if (contactList.isEmpty()) {
        throw new Exception();
      }
      
      boolean foundToRemove = false;

      for (Map.Entry<String, Integer> entry : contactList.entrySet()) {
        if (entry.getKey() == name) {
          contactList.remove(name);
          foundToRemove = true;
          Common.printSuccessfulMessage(toString(entry));
          break;
        }
      }

      if (!foundToRemove) {
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

  public <T> void showContacts() {
    Common.printCommonOperationName(4, data);

    try {
      if (contactList.isEmpty()) {
        throw new Exception();
      }

      for (Map.Entry<String, Integer> entry : contactList.entrySet()) {
        System.out.println(toString(entry));
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void searchByName(String name) {
    Common.printCustomOperationName("Search by name" + ((name != null && !name.isBlank()) ? ": \"" + name + "\"" : ""));

    try {
      if (name == null || name.isBlank()) {
        throw new IllegalArgumentException();
      }

      if (contactList.isEmpty()) {
        throw new Exception();
      }

      boolean contactFound = false;

      for (Map.Entry<String, Integer> entry : contactList.entrySet()) {
        if (entry.getKey() == name) {
          System.out.println(toString(entry));
          contactFound = true;
        }
      }
      
      if (!contactFound) {
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
