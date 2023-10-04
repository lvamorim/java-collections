package javacollections.set.search.todolist;

import java.util.HashSet;
import java.util.Set;

import javacollections.Common;

public class ToDoList {
  private Set<Task> toDoList;
  private String data = "task";

  public ToDoList() {
    this.toDoList = new HashSet<>();

    Common.printAppName("To-do list");
  }

  public void addTask(String description, boolean done) {
    Common.printCommonOperationName(1, data);

    try {
      if (description == null || description.isBlank()) {
        throw new IllegalArgumentException();
      }

      Task task = new Task(description, done);
      toDoList.add(task);
      Common.printSuccessfulMessage(task);
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
  }

  public void removeTask(String description) {
    Common.printCommonOperationName(2, data);

    try {
      if (description == null || description.isBlank()) {
        throw new IllegalArgumentException();
      }

      Task taskToRemove = null;

      for (Task task : toDoList) {
        if (task.getDescription().equalsIgnoreCase(description)) {
          taskToRemove = task;
          break;
        }
      }

      if (taskToRemove == null) {
        throw new Exception();
      }

      toDoList.remove(taskToRemove);
      Common.printSuccessfulMessage(taskToRemove);
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
        System.out.println(task);
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void countTasks() {
    Common.printCustomOperationName("Count " + data + "s");
    int tasks = toDoList.size();

    System.out.println("There are " + tasks + " " + data + (tasks != 1 ? "s" : "") + ".");
  }

  private void getTasksByStatus(boolean status) {
    Common.printCustomOperationName(data + "s " + (status ? "done" : "pending"));

    try {
      boolean found = false;

      for (Task task : toDoList) {
        if (status ? task.isDone() : !task.isDone()) {
          System.out.println(task);
          found = true;
        }
      }

      if (!found) {
        throw new Exception();
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void getDoneTasks() {
    getTasksByStatus(true);
  }

  public void getPendingTasks() {
    getTasksByStatus(false);
  }

  private void updateTaskStatus(String description, boolean status) {
    String statusName = status ? "done" : "pending";
    Common.printCustomOperationName("Set " + data + " as " + statusName);

    try {
      if (description == null || description.isBlank()) {
        throw new IllegalArgumentException();
      }

      boolean foundTask = false;
      boolean changeStatus = false;

      for (Task task : toDoList) {
        if (task.getDescription().equalsIgnoreCase(description)) {
          foundTask = true;
          
          if (task.isDone() != status) {
            task.setDone(status);
            changeStatus = true;
            Common.printSuccessfulMessage(task);
          }
        }
      }

      if (!foundTask) {
        throw new Exception();
      }

      if (!changeStatus) {
        Common.printCustomErrorMessage("The " + data + " status is " + statusName + " already.");
      }
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }

    catch (Exception e) {
      Common.printCommonErrorMessage(2);
    }
  }

  public void setTaskAsDone(String description) {
    updateTaskStatus(description, true);
  }

  public void setTaskAsPending(String description) {
    updateTaskStatus(description, false);
  }

  public void clearToDoList() {
    Common.printCustomOperationName("Clear to-do list");

    try {
      if (toDoList.isEmpty()) {
        throw new Exception();
      }

      toDoList.clear();
      System.out.println("The list is clear!");
    }
    
    catch (Exception e) {
      Common.printCustomErrorMessage("The list is empty already.");
    }
  }
}
