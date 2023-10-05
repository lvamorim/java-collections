package javacollections.map.basicoperations.dictionary;

import java.util.HashMap;
import java.util.Map;

import javacollections.Common;

public class Dictionary {
  private Map<String, String> dictionary;

  private String toString(Map.Entry<String, String> entry) {
    return "Word: " + entry.getKey() + " | Definition: " + entry.getValue();
  }

  private String data = "word";

  public Dictionary() {
    this.dictionary = new HashMap<>();

    Common.printAppName(data);
  }

  public void addWord(String word, String definition) {
    Common.printCommonOperationName(1, data);

    try {
      if (word == null || word.isBlank() || definition == null || definition.isBlank()) {
        throw new IllegalArgumentException();
      }

      dictionary.put(word, definition);

      for (Map.Entry<String, String> entry : dictionary.entrySet()) {
        if (entry.getKey() == word && entry.getValue() == definition) {
          Common.printSuccessfulMessage(toString(entry));
        }
      }
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
  }

  public void removeWord(String word) {
    Common.printCommonOperationName(2, data);

    try {
      if (word == null || word.isBlank()) {
        throw new IllegalArgumentException();
      }

      if (dictionary.isEmpty()) {
        throw new Exception();
      }

      boolean foundToRemove = false;
      
      for (Map.Entry<String, String> entry : dictionary.entrySet()) {
        if (entry.getKey() == word) {
          dictionary.remove(word);
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

  public void showWords() {
    Common.printCommonOperationName(4, data);

    try {
      if (dictionary.isEmpty()) {
        throw new Exception();
      }

      for (Map.Entry<String, String> entry : dictionary.entrySet()) {
        System.out.println(toString(entry));
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void searchByWord(String word) {
    Common.printCustomOperationName("Search by " + data);

    try {
      if (word == null || word.isBlank()) {
        throw new IllegalArgumentException();
      }

      boolean foundWord = false;

      for (Map.Entry<String, String> entry : dictionary.entrySet()) {
        if (entry.getKey() == word) {
          System.out.println(toString(entry));
          foundWord = true;
        }
      }

      if (!foundWord) {
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
