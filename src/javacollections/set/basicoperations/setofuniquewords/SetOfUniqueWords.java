package javacollections.set.basicoperations.setofuniquewords;

import java.util.Set;
import java.util.HashSet;

import javacollections.Common;

public class SetOfUniqueWords {
  private Set<Word> setOfUniqueWords;
  private String data = "word";

  public SetOfUniqueWords() {
    this.setOfUniqueWords = new HashSet<>();

    Common.printAppName("Set of unique words");
  }

  public void addWord(String word) {
    Common.printCommonOperationName(1, data);

    try {
      if (word == null || word.isBlank()) {
        throw new IllegalArgumentException();
      }

      Word newWord = new Word(word);
      setOfUniqueWords.add(newWord);
      Common.printSuccessfulMessage(word);
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

      Word wordToRemove = null;

      for (Word words : setOfUniqueWords) {
        if (words.getWord().equalsIgnoreCase(word)) {
          wordToRemove = words;
        }
      }
      
      if (wordToRemove == null) {
        throw new Exception();
      }

      else {
        setOfUniqueWords.remove(wordToRemove);
        Common.printSuccessfulMessage(word);
      }
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }

    catch (Exception e) {
      Common.printCommonErrorMessage(2);
    }
  }

  public void showUniqueWords() {
    Common.printCustomOperationName("Show unique " + data + "s");

    try {
      if (setOfUniqueWords.isEmpty()) {
        throw new Exception();
      }
      
      for (Word word : setOfUniqueWords) {
        System.out.println(word);
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void searchWord(String word) {
    Common.printCustomOperationName("Search " + data);

    try {
      if (word == null || word.isBlank()) {
        throw new IllegalArgumentException();
      }

      boolean wordFound = false;

      for (Word words : setOfUniqueWords) {
        if (words.getWord().equalsIgnoreCase(word)) {
          System.out.println("Word found: " + "\"" + words + "\".");
          wordFound = true;
          break;
        }
      }

      if (!wordFound) {
        throw new Exception();
      }
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }

    catch (Exception e) {
      Common.printCustomErrorMessage("\"" + word + "\" was not found.");
    }
  }
}
