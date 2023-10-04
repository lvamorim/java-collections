package javacollections.set.basicoperations.setofuniquewords;

import java.util.Objects;

public class Word {
  private String word;

  public Word(String word) {
    this.word = word;
  }

  public String getWord() {
    return word;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if(!(o instanceof Word word)) return false;
    return getWord() == word.getWord();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getWord());
  }

  @Override
  public String toString() {
    return word;
  }
}
