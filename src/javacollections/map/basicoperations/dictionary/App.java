package javacollections.map.basicoperations.dictionary;

public class App {
  public static void main(String[] args) {
    Dictionary dictionary = new Dictionary();
    dictionary.addWord("Serendipity", "A fortunate accident or pleasant surprise.");
    dictionary.addWord("Ephemeral", "Lasting for a brief moment.");
    dictionary.addWord("Quixotic", "Idealistic but impractical.");
    dictionary.addWord("Cacophony", "A harsh, noisy mixture of sounds.");
    dictionary.addWord("Sycophant", "A person who flatters influential people to gain favor.");
    dictionary.addWord("Ubiquitous", "Seemingly everywhere at once.");
    dictionary.removeWord("Sycophant");
    dictionary.showWords();
    dictionary.searchByWord("Ephemeral");
  }
}
