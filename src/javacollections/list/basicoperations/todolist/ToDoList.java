package javacollections.list.basicoperations.todolist;

import java.util.ArrayList;
import java.util.List;

import javacollections.Common;

public class ToDoList {
  private List<Task> toDoList;
  private String data = "task";

  public ToDoList() {
    this.toDoList = new ArrayList<>();

    Common.printAppName("To-do list");
  }

  public void addTask(String description) {
    Common.printCommonOperationName(1, data);

    try {
      if (description == null || description.isBlank()) {
        throw new IllegalArgumentException();
      }

      Task task = new Task(description);
      toDoList.add(task);
      Common.printSuccessfulMessage(task);
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(1);
    }
  }

  public void removeTask(String description) {
    Common.printCommonOperationName(2, data);

    try {
      if (description == null || description.isBlank()) {
        throw new IllegalArgumentException();
      }

      List<Task> tasksToRemove = new ArrayList<>();
      
      for (Task task : toDoList) {
        if (task.getDescription().equalsIgnoreCase(description)) {
          tasksToRemove.add(task);
        }
      }

      if (tasksToRemove.isEmpty()) {
        throw new Exception();
      }

      toDoList.removeAll(tasksToRemove);

      for (Task task : tasksToRemove) {
        Common.printSuccessfulMessage(task);
      }
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }

    catch (Exception e) {
      Common.printCommonErrorMessage(2);
    }
  }

  public void showTasks() {
    Common.printCommonOperationName(4, data);

    try {
      if (toDoList.isEmpty()) {
        throw new Exception();
      }
      
      for (Task task : toDoList) {
        System.out.println("- " + task);
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void getNumberOfTasks() {
    Common.printCustomOperationName("Number of tasks");
    int numberOfTasks = toDoList.size();

    System.out.printf("There are " + numberOfTasks + " task" + (numberOfTasks == 1 ? "." : "s."));
  }
}
