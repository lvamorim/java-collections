package javacollections.set.search.todolist;

import java.util.Objects;

public class Task {
  private String description;
  private boolean isDone;

  public Task(String description, boolean isDone) {
    this.description = description;
    this.isDone = isDone;
  }

  public String getDescription() {
    return description;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean isDone) {
    this.isDone = isDone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if(!(o instanceof Task task)) return false;
    return getDescription() == task.getDescription();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getDescription());
  }

  @Override
  public String toString() {
    return "Task: " + description + " | Status: " + (isDone ? "done" : "pending");
  }
}
