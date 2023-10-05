package javacollections.map.search.wordcount;

import java.util.HashMap;
import java.util.Map;

import javacollections.Common;

public class WordCount {
  private Map<String, Integer> wordCount;
  
  private String toString(Map.Entry<String, Integer> entry) {
    return "Word: " + entry.getKey() + " | Count: " + entry.getValue();
  }

  private String data = "word";

  public WordCount() {
    this.wordCount = new HashMap<>();

    Common.printAppName(data + " count");
  }

  public void addWord(String word, Integer count) {
    Common.printCommonOperationName(1, data);

    try {
      if (word == null || word.isBlank() || count == null || count == 0) {
        throw new IllegalArgumentException();
      }

      wordCount.put(word, count);
      Common.printSuccessfulMessage("Word: " + word + " | Count: " + count);
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

      Map.Entry<String, Integer> entryToRemove = null;
      
      for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
        if (entry.getKey().equalsIgnoreCase(word)) {
          wordCount.remove(word);
          entryToRemove = entry;
          Common.printSuccessfulMessage(toString(entry));
          break;
        }
      }

      if (entryToRemove == null) {
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

  public void showWordCount() {
    Common.printCustomOperationName("Show " + data + " count");

    try {
      if (wordCount.isEmpty()) {
        throw new Exception();
      }

      for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
        System.out.println(toString(entry));
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void showMostFrequentWord() {
    Common.printCustomOperationName("Most frequent " + data);
    
    try {
      if (wordCount.isEmpty()) {
        throw new Exception();
      }

      String mostFrequentWord = null;
      int biggerCount = 0;

      for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
        if (entry.getValue() > biggerCount) {
          mostFrequentWord = entry.getKey();
          biggerCount = entry.getValue();
        }
      }

      for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
        if (entry.getKey() == mostFrequentWord) {
          System.out.println(toString(entry));
        }
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }
}
