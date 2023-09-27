package javacollections.list.todolist;

import java.util.ArrayList;
import java.util.List;

import javacollections.Common;

public class ToDoList {
  private List<Task> toDoList;
  private String data = "task";

  public ToDoList() {
    this.toDoList = new ArrayList<>();

    Common.appName("To do list");
  }

  public void addTask(String description) {
    Task task = new Task(description);

    if (description.isBlank()) {
      Common.missingDataMessage(data);
    }
    
    else {
      toDoList.add(task);
    }
  }

  public void removeTask(String description) {
    List<Task> tasksToRemove = new ArrayList<>();

    for (Task task : toDoList) {
      if (task.getDescription().equalsIgnoreCase(description)) {
        tasksToRemove.add(task);
      }
    }

    if (tasksToRemove.isEmpty()) {
      Common.notFoundToRemoveMessage(data);
    }

    else {
      toDoList.removeAll(tasksToRemove);
    }
  }

  public void showTasks() {
    Common.operationName("Tasks");

    if (toDoList.isEmpty()) {
      Common.emptyDataMessage(data);
    }

    else {
      for (Task task : toDoList) {
        System.out.println("- " + task);
      }
    }
  }

  public void getNumberOfTasks() {
    int numberOfTasks = toDoList.size();
    Common.operationName("Number of tasks");

    if (numberOfTasks == 0) {
      Common.emptyDataMessage(data);
    }
    
    else {
      System.out.printf("There are " + numberOfTasks + " task" + (numberOfTasks == 1 ? "." : "s."));
    }
  }
}
