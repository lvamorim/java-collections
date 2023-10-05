package javacollections.map.search.wordcount;

public class App {
  public static void main(String[] args) {
    WordCount wordCount = new WordCount();
    wordCount.addWord("apple", 10);
    wordCount.addWord("banana", 15);
    wordCount.addWord("orange", 8);
    wordCount.addWord("carrot", 12);
    wordCount.addWord("grape", 20);
    wordCount.addWord("pineapple", 7);
    wordCount.removeWord("banana");
    wordCount.showWordCount();
    wordCount.showMostFrequentWord();
  }
}
