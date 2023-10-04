package javacollections.set.search.todolist;

public class App {
  public static void main(String[] args) {
    ToDoList toDoList = new ToDoList();
    toDoList.addTask("Clean the house", true);
    toDoList.addTask("Go for a walk", false);
    toDoList.addTask("Do the dishes", false);
    toDoList.showTasks();
    toDoList.countTasks();
    toDoList.getDoneTasks();
    toDoList.getPendingTasks();
    toDoList.setTaskAsDone("Go for a walk");
    toDoList.setTaskAsDone("Do the dishes");
    toDoList.setTaskAsPending("Clean the house");
    toDoList.setTaskAsPending("Clean the house");
    toDoList.clearToDoList();
    toDoList.showTasks();
  }
}
