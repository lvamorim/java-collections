package javacollections.set.basicoperations.setofuniquewords;

public class App {
  public static void main(String[] args) {
    SetOfUniqueWords setOfUniqueWords = new SetOfUniqueWords();
    setOfUniqueWords.addWord("Banana");
    setOfUniqueWords.addWord("Orange");
    setOfUniqueWords.addWord("Apple");
    setOfUniqueWords.addWord("Strawberry");
    setOfUniqueWords.addWord("Pineapple");
    setOfUniqueWords.addWord("Blueberry");
    setOfUniqueWords.addWord("Apple");
    setOfUniqueWords.addWord("Grapes");
    setOfUniqueWords.addWord("Cherry");
    setOfUniqueWords.addWord("Kiwi");
    setOfUniqueWords.addWord("Apple");
    setOfUniqueWords.addWord("Lemon");
    setOfUniqueWords.addWord("Pear");
    setOfUniqueWords.removeWord("Apple");
    setOfUniqueWords.showUniqueWords();
    setOfUniqueWords.searchWord("Apple");
    setOfUniqueWords.searchWord("Pear");
  }
}
